package bittech;

import java.util.List;

/**
 * Author:lxy1999
 * Created:2019/8/23
 */
public class CreateTree {
    
    public static Node createTree(){
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        Node H = new Node('H');
        A.left = B;A.right = C;
        B.left = D;B.right = E;
        C.left = F;C.right = G;
        D.left = null;D.right = null;
        E.left = null;E.right = H;
        H.left = null;H.right = null;
        return A;
    }

    public static void preOrderTraversal(Node root){
        if(root == null){
            return;
        }
        //根+左子树+右子树
        System.out.println(root);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    
    public static void inOrderTraversal(Node root){
        if(root==null){
            return;
        }
        //左子树+根+右子树
        inOrderTraversal(root.left);
        System.out.println(root);
        inOrderTraversal(root.right);
    }

    public static void postOrderTraversal(Node root){
        if(root==null){
            return;
        }
        //左子树+右子树+根
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root);
    }
    //汇总
    public static int leafCount(Node root){
        if(root==null){
            return 0;
        }
        //代表一个结点的树
        if(root.left==null&&root.right==null){
            return 1;
        }

        return leafCount(root.left)+leafCount(root.right);
    }
    //遍历
    public static int leafCount =0;
    public static void  leafCount1(Node root){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            leafCount++;
        }
        leafCount1(root.left);
        leafCount1(root.right);
    }
    public static Node search(Node root,char val){
        if(root==null){
            return null;
        }
        if(root.value == val){
            return root;
        }

        Node left = search(root.left,val);
        if(left!=null){
            return left;
        }
        Node right = search(root.right,val);
        if(right!=null){
            return right;
        }
        return null;
    }

    public static boolean search1(Node root,char val){
        if(root==null){
            return false;
        }
        if(root.value == val){
            return true;
        }
        if(search1(root.left,val)||search1(root.right,val)){
            return true;
        }
        return false;
    }


    public static int kLevelCount(Node root,int k){
        if(root==null){
            return 0;
        }
        if(k==1){
            return 1;
        }
        int left = kLevelCount(root.left,k-1);
        int right = kLevelCount(root.right,k-1);
        return left+right;
    }

    public static boolean isSameTree(Node p,Node q){
        if(p==null||q==null){
            if(p==null&&q==null){
                return true;
            }
            return false;
        }
        return p.value==q.value&&isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
    //是否镜像对称
    public static boolean isMirror(Node p,Node q){
        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
        return p.value==q.value && isMirror(p.left,q.right) && isMirror(p.right,q.left);
    }
    //是否对称
    public static boolean isSymmetric(Node root){
        if(root==null){
            return true;
        }
        return isMirror(root.left,root.right);
    }
    //根据中序和后序构建二叉树
    public static Node buildTree(List<Character> inOrder,List<Character> postOrder){
        int last = postOrder.size()-1;
        Node root = new Node(postOrder.get(last));
        int leftSize = inOrder.indexOf(root);
        List<Character> leftInOrder = inOrder.subList(0,leftSize);
        List<Character> leftPostOrder = postOrder.subList(0,leftSize);
        Node left = buildTree(leftInOrder,leftPostOrder);
        root.left = left;
        List<Character> rightInOrder = inOrder.subList(leftSize+1,inOrder.size());
        List<Character> rightPostOrder = postOrder.subList(leftSize,postOrder.size()-1);
        Node right = buildTree(rightInOrder,rightPostOrder);
        root.right = right;
        return root;
    }


    public static void main(String[] args) {
        Node root = createTree();
        preOrderTraversal(root);
        System.out.println("================================");
        inOrderTraversal(root);
        System.out.println("================================");
        postOrderTraversal(root);
        System.out.println("================================");
        leafCount1(root);
        System.out.println(leafCount);
    }
}
