package test7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main7 {
        int answer = 0;
        int[] distance = {1, -1, 5};
        int[] check;
        Queue<Integer> q = new LinkedList<>();
        public int BFS(int s, int e) {
            check = new int[10001];
            check[s] = 1;
            q.offer(s);
            int level = 0;
            while (!q.isEmpty()) {
                int length = q.size();
                for (int i = 0; i < length; i++) {
                    int x = q.poll();
                    if (x == e) return level;
                    for (int j = 0; j < 3; j++) {
                        int nodeX = x + distance[j];
                        if (nodeX > 0 && nodeX <= 10000 && check[nodeX] == 0) {
                            check[nodeX] = 1;
                            q.offer(nodeX);
                        }
                    }
                }
                level++;
            }
            return -1;
        }

    public static void main(String[] args) {
        Main7 main = new Main7();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(); // 5 <- 현수 위치
        int e = sc.nextInt(); // 14 <- 송아지 위치

        System.out.println(main.BFS(s, e));
    }
}
