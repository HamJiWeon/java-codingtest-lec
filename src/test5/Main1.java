package test5;

import java.util.Scanner;
import java.util.Stack;

public class Main1 {
    public String solution(String a) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (char x : a.toCharArray()) {
            if (x == '(') stack.push(x);
            else {
                if (stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if (!stack.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        Main1 m = new Main1();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(m.solution(a));
    }
}
