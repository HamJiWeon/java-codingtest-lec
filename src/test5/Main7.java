package test5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main7 {
    public String solution(String need, String plan) {
        String answer = "YES";
        Queue<Character> q = new LinkedList<>();
        for (char x : need.toCharArray()) q.offer(x);
        for (char x : plan.toCharArray()) {
            if (q.contains(x)) {
                if (x != q.poll()) return "NO";
            }
        }
        if (!q.isEmpty()) return "NO";

        return answer;
    }

    public static void main(String[] args) {
        Main7 main = new Main7();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(main.solution(a, b));
    }
}
