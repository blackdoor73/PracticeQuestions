import java.util.*;

public class Tires{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        String[] ary = str.split("");
        if(ary[ary.length - 1].equals("r"))
            System.out.println("er");
        else
            System.out.println("ist");
        sc.close();
    }
}