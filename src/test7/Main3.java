package test7;

public class Main3 {
    public int DFS(int n) {
        if (n == 1) return 1;
        else return n * DFS(n - 1);
    }

    public static void main(String[] args) {
        Main3 m = new Main3();
        System.out.println(m.DFS(5) );
    }
}
