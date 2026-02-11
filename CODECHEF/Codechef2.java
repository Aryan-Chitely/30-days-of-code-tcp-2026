import java.util.*;
public class Codechef2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int s = sc.nextInt();
            int[] n = new int[s];

            for (int i = 0; i < s; i++) {
                n[i] = sc.nextInt();
            }

            int sm = 0;
            for (int i = 0; i < s; i++) {
                sm += n[i];
            }

            if (sm % 2 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
}
