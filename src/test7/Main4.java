package test7;

public class Main4 {
    public int DFS(int n) {
        if (n == 1) return 1;
        else if (n == 2) return 1;
        else return DFS(n - 2) + DFS(n - 1);
    }

    public static void main(String[] args) {
        Main4_1 m = new Main4_1();
        int n = 6;
        for (int i = 1; i <=n; i++) System.out.print(m.DFS(i) + " ");
    }
}

