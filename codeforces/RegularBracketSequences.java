// https://codeforces.com/contest/1574/problem/0

import java.util.*;

public class RegularBracketSequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int length = 2 * n;
            String[] answers = new String[n];
            boolean flag = false;
            Stack<Boolean> stk = new Stack<>();
            for (int j = 0; j < n; j++)  {
                // System.out.println("CHECK");
                stk.clear();
                int k = 0;
                while (answers[j] == null || (answers[j].length() != length)) {
                    // System.out.println("HELP");
                    flag = getRandomBoolean();
                    if (stk == null || stk.empty() || (flag == true && stk.peek() == false)) {
                        answers[j] += ")";
                        if (!stk.empty())
                            stk.pop();
                    } else if (flag == false && k <= n) {
                        k++;
                        answers[j] += "(";
                        stk.push(false);
                    }
                }
                if (!areDistinct(answers)) {
                    answers[j] = "";
                    --j;
                } 
                length = 2 * n;

            }
            for (int l = 0; l < answers.length; l++)
                System.out.println(answers[i]);

        }
        sc.close();

    }

    public static boolean getRandomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }

    public static boolean areDistinct(String arr[]) {
        Set<String> s = new HashSet<String>(Arrays.asList(arr));
        return (s.size() == arr.length);
    }

}
