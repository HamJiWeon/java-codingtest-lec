package test6;

import java.util.Arrays;
import java.util.Scanner;

public class Main9 {
    public int count(int[] arr, int capacity) {
        int cnt = 1, sum = 0;
        for (int x : arr) {
            if (sum + x > capacity) {
                cnt++;
                sum = x;
            } else sum += x;
        }
        return cnt;
    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = n;
        int rt = Arrays.stream(arr).sum();

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, mid) <= m) {
                answer = mid;
                rt = mid - 1;
            }
            else lt = mid + 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main9 main = new Main9();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(main.solution(n, m, arr));
    }
}
