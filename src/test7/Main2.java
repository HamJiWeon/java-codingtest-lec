package test7;

public class Main2 {
    public void DFS(int n) {
        if (n == 0) return;
        else {
            DFS(n / 2);
            System.out.print(n % 2);
        }
    }

    public static void main(String[] args) {
        Main2 m = new Main2();
        m.DFS(11);
    }
}
