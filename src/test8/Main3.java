package test8;

import java.util.Scanner;

public class Main3 {
    public static int answer = Integer.MIN_VALUE , n, m;

    public void DFS(int level, int sum, int time, int[] ps, int[] pt) {
        if (time > m) return;
        if (level == n) {
            answer = Math.max(answer, sum);
        } else {
            DFS(level + 1, sum + ps[level], time + pt[level], ps, pt);
            DFS(level + 1, sum, time, ps, pt);
        }
    }

    public static void main(String[] args) {
        Main3 sol = new Main3();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        sol.DFS(0, 0, 0, a, b);
        System.out.println(answer);
    }
}
