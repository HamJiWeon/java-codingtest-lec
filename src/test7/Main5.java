package test7;

class Node {
    int data;
    Node lt, rt;
    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Main5 {
    Node root;
    public void DFS(Node root) {
        if (root == null) return;
        else {
            // 전위 순회 출력
            System.out.print(root.data + " "); // 1 2 4 5 3 6 7
            DFS(root.lt);
            // 중위 순회 출력
            // System.out.print(root.data + " "); // 4 3 5 1 6 3 7
            DFS(root.rt);
            // 후위 순회 출력
            // System.out.print(root.data + " "); // 4 5 2 6 7 3 1


        }

    }


    public static void main(String[] args) {
        Main5 tree = new Main5();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);
    }
}
