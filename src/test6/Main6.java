package test6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main6 {
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        int[] temp = arr.clone() ;
        Arrays.sort(temp);
        for (int i = 0; i < n; i++) {
            if (temp[i] != arr[i]) answer.add(i + 1);
        }

        return answer;
    }


    public static void main(String[] args) {
        Main6 m = new Main6();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int x : m.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
