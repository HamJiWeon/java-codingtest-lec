package test8;

import java.util.Scanner;

public class Main6 {
    static int[] pm, check, arr;
    static int n, m;

    public void DFS(int level) {
        if (level == m) {
            for (int x : pm) System.out.print(x + " ");
            System.out.println();


        } else {
            for (int i = 0; i < n; i++) {
                if (check[i] == 0) {
                    check[i] = 1;
                    pm[level] = arr[i];
                    DFS(level + 1);
                    check[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main6 sol = new Main6();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 3
        m = sc.nextInt(); // 2
        arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt(); // 3 6 9
        check = new int[n];
        pm = new int[m];
        sol.DFS(0);
    }
}
