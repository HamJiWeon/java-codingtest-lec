package test8;

import java.util.Scanner;

public class Main2 {
    static int answer = Integer.MIN_VALUE, kg, n;

    public void DFS(int level, int sum, int[] arr) {
        if (sum > kg) return;
        if (level == n) {
            answer = Math.max(answer, sum);
        } else {
            DFS(level + 1, sum + arr[level], arr);
            DFS(level + 1, sum , arr);
        }
    }


    public static void main(String[] args) {
        Main2 sol = new Main2();
        Scanner sc = new Scanner(System.in);

        kg = sc.nextInt();
        n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sol.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
