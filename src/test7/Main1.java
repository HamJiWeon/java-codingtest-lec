package test7;

public class Main1 {
    public void DFS(int n) {
        if (n == 0) return;
        else {
            System.out.println(n);
            DFS(n - 1);
        }
    }

    public static void main(String[] args) {
        Main1 m = new Main1();
        m.DFS(3);
    }
}
