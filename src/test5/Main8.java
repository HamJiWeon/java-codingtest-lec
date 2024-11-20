package test5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class Main8 {
    public int solution(int n, int m, int[] arr) {
        int answer = 1;
        Queue<Person> q = new LinkedList<>();

        for (int i = 0; i < n; i++) q.add(new Person(i, arr[i]));
        while (!q.isEmpty()) {
            Person temp = q.poll(); // q.poll -> 반환값: 삭제된 value의 자료형 / 공백 queue면 null반환
            // q.remove()를 쓰지 못하는 이유는 공백 queue일 때, null값을 반환하지 않음.
            for (Person x : q) {
                if (x.priority > temp.priority) {
                    q.offer(temp);
                    temp = null;
                    break;
                }
            }
            if (temp != null) {
                answer++;
                if (temp.id == m) return answer;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main8 main = new Main8();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(main.solution(n, m, arr));
    }
}
