package test7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main10 {
    static int answer = 0, vertex, edge;
    static ArrayList<ArrayList<Integer>> graph;
    static int [] check;

    public void DFS(int value) {
        if (value == vertex) answer++;
        else {
            for (int vv : graph.get(value)) {
                if (check[vv] == 0) {
                    check[vv] = 1;
                    DFS(vv);
                    check[vv] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main10 solution = new Main10();
        Scanner sc = new Scanner(System.in);
        vertex = sc.nextInt();
        edge = sc.nextInt();
        graph = new ArrayList<>();
        for (int i = 0; i <= vertex; i++) graph.add(new ArrayList<>());
        check = new int[vertex + 1];
        for (int i = 0; i < edge; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        check[1] = 1;
        solution.DFS(1);
        System.out.println(answer);
    }
}
