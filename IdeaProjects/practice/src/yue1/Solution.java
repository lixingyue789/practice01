package yue1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Author:lxy1999
 * Created:2019/8/25
 */
class Node{
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }
}



public class Solution {

    public static void preOrderTraversal(Node root){
        if(root == null){
            return;
        }
        //根+左子树+右子树
        System.out.println(root);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    //判断是否为平衡树，时间复杂度为O(n)
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        int max = Math.max(left,right);
        return max+1;
    }

    public static boolean isBalanced(Node root){
        if(root == null){
            return true;
        }

        boolean left = isBalanced(root.left);
        if(!left){
            return false;
        }
        boolean right = isBalanced(root.right);
        if(!right){
            return false;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if(leftHeight-rightHeight>1||leftHeight-rightHeight<-1){
            return false;
        }

        return true;
   }

   public static void preOrder(StringBuilder s,Node root){
        if(root == null){
            return;
        }
        s.append("(");
        s.append(root.value);
        if(root.left == null&&root.right!=null){
            s.append("()");
        }
        preOrder(s,root.left);
        preOrder(s,root.right);
        s.append(")");
   }

    public boolean find(Node root, Node p) {
        if(root == null){
            return false;
        }
        if(root == p){
            return true;
        }
        if(find(root.left,p)){
            return true;
        }
        return find(root.right,p);
    }


    public Node lowestCommonAncestor(Node root,Node p,Node q){
        if(root==p || root==q){
            return root;
        }

        boolean pLeft = find(root.left,p);
        boolean qLeft = find(root.right,q);

        if(pLeft&&qLeft){
            return lowestCommonAncestor(root.left,p,q);
        }

        if(!pLeft&&!qLeft){
            return lowestCommonAncestor(root.right,p,q);
        }

        return root;
   }

   public static void levelOrderTraversal(Node root){
        if(root == null){
            return;
        }

       Queue<Node> queue = new LinkedList<>();
       queue.add(root);
       while (!queue.isEmpty()){
           Node front = queue.poll();
           System.out.println(front.value);
           if(front.left!=null){
               queue.add(front.left);
           }
           if(front.right!=null){
               queue.add(front.right);
           }
       }
   }

}
