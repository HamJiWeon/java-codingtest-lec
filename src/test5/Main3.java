package test5;

import java.util.Scanner;
import java.util.Stack;

public class Main3 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int pos : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][pos - 1] != 0) {
                    int temp = board[i][pos - 1];
                    board[i][pos - 1] = 0;
                    if (!stack.empty() && temp == stack.peek()) {
                        answer += 2;
                        stack.pop();
                    } else stack.push(temp);
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main3 main = new Main3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }
        System.out.println(main.solution(board, moves));
    }
}
