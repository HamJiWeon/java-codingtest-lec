package test1;

import java.util.Scanner;

public class Main2_1 {

    public String solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if (x >= 97 && x < 122) {
                answer += (char)(x - 32);
            } else {
                answer += (char)(x + 32);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main2_1 main2 = new Main2_1();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main2.solution(str));
    }
}