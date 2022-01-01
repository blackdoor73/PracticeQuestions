
// https://codeforces.com/problemset/problem/1553/B
import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        String[] answer = new String[testCases];
        for (int i = 0; i < testCases; i++) {
            String s = sc.nextLine();
            String t = sc.nextLine();
            for (int j = 0; j < s.length(); j++){
                Character ch =  s.charAt(j);
                // while(s.indexOf(s.charAt(0)));
            }

        }
        Arrays.stream(answer).forEach(System.out::println);   
        sc.close();

    }
    
}