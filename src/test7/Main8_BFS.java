package test7;

import java.util.ArrayDeque;
import java.util.Deque;

class Node1 {
    int data;
    Node lt, rt;

    public Node1(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Main8_BFS {
    Node root;

    public int BFS(Node root) {
        Deque<Node> q = new ArrayDeque<>();
        q.offer(root);
        int level = 0;

        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                Node current = q.poll();
                if (current.lt == null && current.rt == null) return level;
                if (current.lt != null) q.offer(current.lt);
                if (current.rt != null) q.offer(current.rt);
            }
            level++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Main8_BFS tree = new Main8_BFS();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.BFS(tree.root));
    }
}
