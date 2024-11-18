package test5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main6 {
    public int solution(int n, int m) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) q.offer(i);
        while (!q.isEmpty()) {
            for (int i = 1; i < m; i++) q.offer(q.poll());
            q.poll();
            if (q.size() == 1) answer = q.poll();
        }

        return answer;
    }

    public static void main(String[] args) {
        Main6 main = new Main6();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(main.solution(n, m));
    }
}
