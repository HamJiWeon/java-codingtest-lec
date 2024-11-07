package test1;

import java.util.Scanner;

public class Main9_2 {
    public int solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) answer += x;
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Main9_2 main9 = new Main9_2();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main9.solution(str));
    }
}
