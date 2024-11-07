package test1;

import java.util.Scanner;

public class Main8 {
    public String solution(String str) {
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String temp = new StringBuilder(str).reverse().toString();
        if (str.equals(temp)) answer = "YES";
            return answer;


    }

    public static void main(String[] args) {
        Main8 main8 = new Main8();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(main8.solution(str));
    }
}
