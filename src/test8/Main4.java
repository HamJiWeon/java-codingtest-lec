package test8;

import java.util.Scanner;

public class Main4 {
    static int[] pm;
    static int n, m;

    public void DFS(int level) {
        if (level == m) {
            for (int x : pm) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                pm[level] = i;
                DFS(level + 1);
            }
        }
    }

    public static void main(String[] args) {
        Main4 sol = new Main4();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        pm = new int[m];
        sol.DFS(0);
    }
}
