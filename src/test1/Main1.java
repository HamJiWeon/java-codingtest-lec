package test1;

import java.util.Scanner;

public class Main1 {

    public int solution(String str, char s) {
        int answer = 0;

        str = str.toUpperCase();
        s = Character.toUpperCase(s);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == s) answer ++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main1 main1 = new Main1();

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char s = sc.next().charAt(0);
        System.out.println(main1.solution(str, s));

    }
}