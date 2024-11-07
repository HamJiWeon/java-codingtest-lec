package test1;

import java.util.Scanner;

public class Main9_1 {
    public String solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) answer += x;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main9_1 main9 = new Main9_1();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main9.solution(str));
    }
}
