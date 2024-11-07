package test1;

import java.util.Scanner;

public class Main7 {

    public String solution(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) answer = "NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        Main7 main7 = new Main7();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main7.solution(str));
    }
}
