package test4;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

// TreeSet<> 기능 모음집
public class Main5_1 {
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
        // Collections.reverseOrder() -> 내림차순으로 바꾸기
        new TreeSet<>(Collections.reverseOrder());
        // .remove() -> 지정한 숫자 지우기
        ts.remove(143);
        // .size() -> 값의 개수
        ts.size();
        // .first() -> 첫번째 값
        ts.first();
        // .last() -> 마지막 값
        ts.last();

        return answer;
    }

    public static void main(String[] args) {
        Main5_1 m = new Main5_1();
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
