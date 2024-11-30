package test7;

public class Main6 {
    static int n;
    static int[] ch;

    public void DFS(int L) {
        if (L == n + 1) {
            String temp = "";
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) temp+= (i + " ");
            }
            if (temp.length() > 0) System.out.println(temp);
        } else {
            ch[L] = 1;
            DFS(L + 1);
            ch[L] = 0;
            DFS(L + 1);
        }
    }

    public static void main(String[] args) {
        Main6 main = new Main6();
        n = 3;
        ch = new int[n + 1];
        main.DFS(1);
    }
}
