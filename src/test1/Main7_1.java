package test1;

import java.util.Scanner;

public class Main7_1 {

    public String solution(String str) {
        String answer = "NO";
        str = str.toUpperCase();
        String temp = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(temp)) answer = "YES";
            return answer;
    }

    public static void main(String[] args) {
        Main7_1 main7 = new Main7_1();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main7.solution(str));
    }
}
