package test4;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main5 {
    public int solution(int n, int k, int[] arr) {
        int answer = -1;
        TreeSet<Integer> ts = new TreeSet<>(Collections.reverseOrder());
        // Collections.reverseOrder()이 없으면 자동적으로 오름차순을 해준다.
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    ts.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        int cnt = 0;
        for (int x : ts) {
            cnt++;
            if (cnt == k) return x;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main5 m = new Main5();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(m.solution(n, k, arr));
    }
}
