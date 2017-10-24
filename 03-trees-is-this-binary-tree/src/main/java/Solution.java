public class Solution {
    static boolean checkBST(Node root) {
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean checkBST(Node root, int min, int max) {
        if (root == null) {
            return true;
        }

        if (root.data < min || root.data > max) {
            return false;
        }

        if (root.left != null && root.left.data > root.data) {
            return false;
        }

        if (root.right != null && root.right.data < root.data) {
            return false;
        }

        return checkBST(root.left, min, root.data - 1) && checkBST(root.right, root.data + 1, max);
    }
}

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public String toString() {
        return "" + data;
    }
}
