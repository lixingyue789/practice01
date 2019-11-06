/**
 * Author:lxy1999
 * Created:2019/5/7
 */
public class Test8 {
    public class Node {
        public char value;
        public Node left;
        public Node right;

        Node(char value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    private static int getKLevelSize(Node root, int k) {
        if (root == null) {
            return 0;
        }
        if (k == 1) {
            return 1;
        }
        return getKLevelSize(root.left, k - 1) + getKLevelSize(root.right, k - 1);
    }
}