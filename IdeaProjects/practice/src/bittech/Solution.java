package bittech;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:lxy1999
 * Created:2019/8/23
 */
public class Solution {
    private List<Character> list;

    public void preOrder(Node root) {
        if (root == null) {
           return;
        }
        list.add(root.value);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static List<Character> preOrderTraversal(Node root){
        if(root==null){
            return new ArrayList<>();
        }
        List<Character> list = new ArrayList<>();//创建多个线性表，将它们合并
        List<Character> left = preOrderTraversal(root.left);
        List<Character> right = preOrderTraversal(root.right);
        list.add(root.value);
        list.addAll(left);
        list.addAll(right);
        return list;
    }
    public List<Character> preOrderTraversal1(Node root){
        list = new ArrayList<>();//创建一个线性表，往里面添加元素
        preOrder(root);
        return list;
    }

    public static void main(String[] args) {
        Node root = CreateTree.createTree();
        Solution solution = new Solution();
        System.out.println(preOrderTraversal(root));
        System.out.println(solution.preOrderTraversal1(root));

    }
}
