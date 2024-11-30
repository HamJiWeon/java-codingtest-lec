package test7;

public class Main4_1 {
    static int[] dfsArr;

    public int DFS(int n) {
        if (n == 1) return dfsArr[n] = 1;
        else if (n == 2) return dfsArr[n] = 1;
        else return dfsArr[n] = DFS(n - 2) + DFS(n - 1);
    }

    public static void main(String[] args) {
        Main4_1 m = new Main4_1();
        int n = 10;
        dfsArr = new int[n + 1];
        m.DFS(n);
        for (int i = 1; i <=n; i++) System.out.print(dfsArr[i] + " ");
    }
}