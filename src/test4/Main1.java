package test4;

import java.util.HashMap;
import java.util.Scanner;

public class Main1 {
    public char solution(int n, String s) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
            // System.out.println(x + " " + map.get(x));
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main1 main = new Main1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        System.out.println(main.solution(n, s));
    }
}
