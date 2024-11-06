package test1;

import java.util.Scanner;

public class Main5 {
    public String solution(String str) {
        String answer = "";
        char[] c = str.toCharArray();
        int lt = 0, rt = str.length() - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic(c[lt])) lt++;
            else if (!Character.isAlphabetic(c[rt])) rt--;
            else {
                char temp = c[lt];
                c[lt] = c[rt];
                c[rt] = temp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(c);
        return answer;
    }

    public static void main(String[] args) {
        Main5 main5 = new Main5();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(main5.solution(str));
    }
}
