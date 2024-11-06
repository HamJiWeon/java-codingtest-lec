package test1;

import java.util.Scanner;

public class Main3 {

    public String solution(String str) {
        String answer = "";
        int min = Integer.MIN_VALUE;
        String[] s = str.split(" ");

        for (String x : s) {
            int len = x.length();
            if (min < len) {
                min = len;
                answer = x;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main3 main3 = new Main3();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(main3.solution(str));
    }
}