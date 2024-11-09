package test2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public int solution(int n, int[] arr) {
        int answer = 1, max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                answer ++;
                max = arr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main2 m = new Main2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(m.solution(n, arr));
    }
}
