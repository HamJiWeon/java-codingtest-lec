package test2;

import java.util.Scanner;
// no 배열 버전
public class Main4_1 {
    public void solution(int n) {
        int a = 1, b = 1, c;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }

    public static void main(String[] args) {
        Main4_1 m = new Main4_1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        m.solution(n);
    }
}
