package test3;

import java.util.Scanner;

public class Main5_1 {
    public int solution(int n) {
        int answer = 0, cnt = 1;
        n--; // 14
        while (n > 0) {
            cnt++;
            n -= cnt; // 12
            if (n % cnt == 0 ) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main5_1 main = new Main5_1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(main.solution(n));
    }
}
