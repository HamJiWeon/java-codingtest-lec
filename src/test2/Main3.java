package test2;

import java.util.Scanner;

public class Main3 {
    public String solution(int n, int[] rcp1, int[] rcp2) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            if (rcp1[i] == rcp2[i]) answer += "D";
            else if (rcp1[i] == 1 && rcp2[i] == 3) answer += "A";
            else if (rcp1[i] == 2 && rcp2[i] == 1) answer += "A";
            else if (rcp1[i] == 3 && rcp2[i] == 2) answer += "A";
            else answer += "B";
        }

        return answer;
    }

    public static void main(String[] args) {
        Main3 m = new Main3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] rcp1 = new int[n];
        int[] rcp2 = new int[n];

        for (int i = 0; i < n; i++) {
            rcp1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            rcp2[i] = sc.nextInt();
        }
        for (char x : m.solution(n, rcp1, rcp2).toCharArray()) {
            System.out.println(x);
        }
    }
}
