package bittech;

/**
 * Author:lxy1999
 * Created:2019/8/23
 */
public class Node {
    char value;
    Node left = null;
    Node right = null;

    public Node(char value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
