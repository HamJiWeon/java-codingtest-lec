package test1;

import java.util.Scanner;

public class Main12 {
    public String solution(int n, String str) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            String temp = str.substring(0, 7).replace("#", "1").replace("*", "0");
            int num = Integer.parseInt(temp, 2);
            answer += (char)num;
            str = str.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main12 main12 = new Main12();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(main12.solution(n, str));
    }
}
