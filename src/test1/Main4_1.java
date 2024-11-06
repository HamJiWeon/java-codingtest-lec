package test1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main4_1 {

    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for(String x : str) {
            char[] c = x.toCharArray();
            int lt = 0;
            int rt = (x.length()-1);
            while (lt < rt) {
                char temp = c[lt];
                c[lt] = c[rt];
                c[rt] = temp;
                lt++;
                rt--;
            }
            String temp = String.valueOf(c);
            answer.add(temp);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main4_1 main4 = new Main4_1();

        int n = sc.nextInt();
        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }

        for (String x : main4.solution(n, str)) {
            System.out.println(x);
        }
    }
}
