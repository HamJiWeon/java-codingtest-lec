package test5;

import java.util.Scanner;
import java.util.Stack;

public class Main2 {
    public String solution(String a) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char x : a.toCharArray()) {
            if (x == ')') {
                while (stack.pop() != '(');
            } else stack.push(x);
        }
        for (int i = 0; i < stack.size(); i++) answer += stack.get(i);
        return answer;
    }

    public static void main(String[] args) {
        Main2 m = new Main2();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(m.solution(a));
    }
}
