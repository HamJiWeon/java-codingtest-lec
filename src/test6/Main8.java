package test6;

import java.util.Arrays;
import java.util.Scanner;

public class Main8 {
    public int solution(int num, int findNum, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 0, rt = num - 1;

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (arr[mid] == findNum) {
                answer = mid + 1;
                break;
            }
            if (arr[mid] > findNum) rt = mid - 1;
            else lt = mid + 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main8 m = new Main8();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int findNum = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(m.solution(num, findNum, arr));
    }
}
