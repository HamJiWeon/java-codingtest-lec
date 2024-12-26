package test7;

import java.util.Scanner;

public class Main9 {
    static int vertex, edge, answer = 0;
    static int[][] graph;
    static int[] check;

    public void DFS(int value) {
        if (value == vertex) answer++;
        else {
            for (int i = 1; i <= vertex; i++) {
                if (graph[value][i] == 1 && check[i] == 0) {
                    check[i] = 1;
                    DFS(i);
                    check[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main9 solution = new Main9();
        Scanner sc = new Scanner(System.in);
        vertex = sc.nextInt(); // 노드의 개수
        edge = sc.nextInt(); // 간선의 개수
        graph = new int[vertex + 1][vertex + 1];
        check = new int[vertex + 1];

        for (int i = 0; i < edge; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }
        check[1] = 1;
        solution.DFS(1);
        System.out.println(answer);
    }
}
