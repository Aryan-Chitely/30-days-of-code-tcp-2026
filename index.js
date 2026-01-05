const cells = document.querySelectorAll(".cell");
const statusText = document.getElementById("status");
const restartBtn = document.getElementById("restart");

let currentPlayer = "X";
let board = ["", "", "", "", "", "", "", "", ""];
let gameActive = true;

const winPatterns = [
    [0,1,2],[3,4,5],[6,7,8],
    [0,3,6],[1,4,7],[2,5,8],
    [0,4,8],[2,4,6]
];

cells.forEach(cell => {
    cell.addEventListener("click", handleClick);
});

restartBtn.addEventListener("click", restartGame);

function handleClick() {
    const index = this.dataset.index;

    if (board[index] !== "" || !gameActive) return;

    board[index] = currentPlayer;
    drawSymbol(this, currentPlayer);

    if (checkWin()) {
        statusText.textContent = currentPlayer + " wins!";
        gameActive = false;
        return;
    }

    if (!board.includes("")) {
        statusText.textContent = "Match draw";
        gameActive = false;
        return;
    }

    currentPlayer = currentPlayer === "X" ? "O" : "X";
    statusText.textContent = currentPlayer + "'s turn";
}

function drawSymbol(cell, player) {
    const svg = document.createElementNS("http://www.w3.org/2000/svg", "svg");
    const use = document.createElementNS("http://www.w3.org/2000/svg", "use");

    use.setAttributeNS(
        "http://www.w3.org/1999/xlink",
        "href",
        player === "X" ? "#x-icon" : "#o-icon"
    );

    svg.appendChild(use);
    svg.classList.add(player === "X" ? "x" : "o");
    cell.appendChild(svg);
}

function checkWin() {
    return winPatterns.some(pattern => {
        const [a,b,c] = pattern;
        if (board[a] && board[a] === board[b] && board[a] === board[c]) {
            pattern.forEach(i => cells[i].classList.add("win"));
            return true;
        }
    });
}

function restartGame() {
    board = ["", "", "", "", "", "", "", "", ""];
    gameActive = true;
    currentPlayer = "X";
    statusText.textContent = "X's turn";

    cells.forEach(cell => {
        cell.innerHTML = "";
        cell.classList.remove("win");
    });
}
