package test3;

import java.util.Scanner;

public class Main6 {
    public int solution(int n, int m, int[] arr) {
        int answer = 0, cnt = 0, lt = 2;
        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) cnt++;
            while (cnt > m) {
                if (arr[lt] == 0) cnt--;
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
        }
         return answer;
    }

    public static void main(String[] args) {
        Main6 main = new Main6();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(main.solution(n, m, arr));
    }
}
