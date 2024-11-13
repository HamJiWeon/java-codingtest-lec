package test3;

import java.util.Scanner;

public class Main3 {
    public int solution(int n, int m, int[] arr) {
        int answer = 0, sum = 0;
        for (int i = 0; i < m; i++) sum += arr[i];
        answer = sum;
        for (int i = m; i < n; i++) {
            sum = sum + (arr[i] - arr[i - m]);
            answer = Math.max(sum, answer);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main3 main = new Main3();
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
