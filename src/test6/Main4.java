package test6;

import java.util.Scanner;

public class Main4 {
    public int[] solution(int size, int n, int[] arr) {
        int[] cache = new int[size];

        // size = 5
        // n = 9
        // arr = 1 2 3 2 6 2 3 5 7
        for (int x : arr) {
            int pos = -1;
            for (int i = 0; i < size; i++) if (x == cache[i]) pos = i;
            if (pos == -1) {
                for (int i = size - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            } else {
                for (int i = pos; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            }
            cache[0] = x;
        }
        return cache;
    }

    public static void main(String[] args) {
        Main4 m = new Main4();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int x : m.solution(s, n, arr)) System.out.print(x + " ");
    }
}
