import java.util.Scanner;
public class Day9 {
    public static String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            int digit = num.charAt(i) - '0';
            if (digit % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number string: ");
        String num = sc.nextLine();
        String res = largestOddNumber(num);
        System.out.println("Largest odd number: " + res);
        sc.close();
    }
}
