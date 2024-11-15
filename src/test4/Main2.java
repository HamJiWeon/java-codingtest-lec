package test4;

import java.util.HashMap;
import java.util.Scanner;

public class Main2 {
    public String solution(String n, String m) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : n.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (char x : m.toCharArray()) {
            if (!map.containsKey(x) || map.get(x) == 0) return "NO";
            map.put(x, map.get(x) - 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main2 main = new Main2();
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String m = sc.next();
        System.out.println(main.solution(n, m));
    }
}
