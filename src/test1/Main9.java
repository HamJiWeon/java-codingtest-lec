package test1;

import java.util.Scanner;

public class Main9 {
    public int solution(String str) {
        int answer = 0;
        for (char x : str.toCharArray()) {
            if (x >= 48 && x <=57) {
                answer = answer * 10 + (x - 48);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main9 main9 = new Main9();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main9.solution(str));
    }
}