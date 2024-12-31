package test8;

import java.util.Scanner;

public class Main1 {
    static String answer = "NO";
    static int n, total = 0;
    boolean flag = false;

    public void DFS(int level, int sum, int[] arr) {
        if (flag) return;
        if (sum > total / 2) return;
        if (level == n) {
            if (total - sum == sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            DFS(level + 1, sum + arr[level], arr);
            DFS(level + 1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Main1 sol = new Main1();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        sol.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
