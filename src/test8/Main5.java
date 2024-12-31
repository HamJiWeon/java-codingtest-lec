package test8;

import java.util.Scanner;

public class Main5 {
    static int n, m, answer = Integer.MAX_VALUE;

    public void DFS(int level, int sum, int[] arr) {
        if (sum > m) return;
        if (sum == m) {
            answer = Math.min(answer, level);
        } else {
            for (int i = 0; i < n; i++) {
                DFS(level + 1, sum + arr[i], arr);
            }
        }
    }

    public static void main(String[] args) {
        Main5 sol = new Main5();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        m = sc.nextInt();
        sol.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
