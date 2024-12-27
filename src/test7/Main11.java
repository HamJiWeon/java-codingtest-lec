package test7;

import java.util.*;

public class Main11 {
    static int vertex, edge;
    static int[] check, distance;
    static ArrayList<ArrayList<Integer>> graph;

    public void BFS(int value) {
        Deque<Integer> queue = new ArrayDeque<>();
        check[value] = 1;
        distance[value] = 0;
        queue.offer(value);
        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            for (int valueVertex : graph.get(currentVertex)) {
                if (check[valueVertex] == 0) {
                    check[valueVertex] = 1;
                    queue.offer(valueVertex);
                    distance[valueVertex] = distance[currentVertex] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main11 solution = new Main11();
        Scanner sc = new Scanner(System.in);
        vertex = sc.nextInt();
        edge = sc.nextInt();
        graph = new ArrayList<>();
        for (int i = 0; i <= vertex; i++) graph.add(new ArrayList<>());
        check = new int[vertex + 1];
        distance = new int[vertex + 1];
        for (int i = 0; i < edge; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        solution.BFS(1);
        for (int i = 2; i <= vertex; i++) System.out.println(i + " : " + distance[i]);
    }
}
