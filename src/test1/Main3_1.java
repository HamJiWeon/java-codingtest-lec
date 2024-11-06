package test1;

import java.util.Scanner;

public class Main3_1 {

    public String solution(String str) {
        String answer = "";
        int min = Integer.MIN_VALUE, pos;
        while ((pos = str.indexOf(" ")) != -1) {
            String temp = str.substring(0, pos);
            int len = temp.length();
            if (len > min) {
                min = len;
                answer = temp;
            }
            str = str.substring(pos + 1);
        }
        if (str.length() > min) {
            answer = str;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main3_1 main3 = new Main3_1();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(main3.solution(str));
    }
}