// https://codeforces.com/problemset/problem/1555/D
import java.util.Scanner;

public class SayNoToPalindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.nextLine();
        char[] ch = new char[n + 1];
        for (int i = 1; i <= n; i++)
            ch[i] = s.charAt(i);
        int l[] = new int[m];
        int r[] = new int[m];
        for (int i = 0; i < m; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            // ch[l[i]] ch[r[i]]
           
            int flag = 0;

            // Loop till array size n/2.
            for (int j = 0; j <= n / 2 && n != 0; j++) {

                // Check if first and last element are different
                // Then set flag to 1.
                if (ch[j] != ch[n - j - 1]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1)
                System.out.println("Not Palindrome");
            else
                System.out.println("Palindrome");
        }

        sc.close();
    }

    public void checkPalindrome() {

    }
}
