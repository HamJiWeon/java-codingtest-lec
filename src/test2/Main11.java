package test2;

import java.util.Scanner;

public class Main11 {
    public int solution(int n, int[][] arr) {
        int answer = 0, max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {      // 고정 학생
            int cnt = 0;
            for (int j = 1; j <= n; j++) {// 고정 학생과 비교
                for (int k = 1; k <= 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
                if (cnt > max) {
                    max = cnt;
                    answer = i;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main11 m = new Main11();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n + 1][6];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(m.solution(n, arr));
    }
}
