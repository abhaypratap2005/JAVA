import java.util.*;

public class Y_32_BinaryTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    static class BinaryTree {
        static int idx = -1;

        // buid tree
        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    // preorder traversal
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // inorder traversal
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.right);
    }

    // postorder traversal
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data + " ");
    }

    // level order traversal
    public static void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.println(currNode + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);

                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }

        }
    }

    // count of nodes
    public static int countofNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNodes = countofNodes(root.left);
        int rightNodes = countofNodes(root.right);

        return leftNodes + rightNodes + 1;
    }

    // sum pf nodes
    public static int SumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = SumOfNodes(root.left);
        int rightSum = SumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }

    // height of a tree
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.left);

        int myHeight = Math.max(leftHeight, rightHeight) + 1;
        return myHeight;
    }


    // Diameter of a tree
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 =  diameter(root.left)+ height(root.right)+1;
        return Math.max(diam3, Math.max(diam1,diam2));
    }
    static class TreeInfo{
        int ht;
        int dia;

        TreeInfo(int ht, int dia){
            this.ht=ht;
            this.dia=dia;
        }
    }
    public static TreeInfo diameter2(Node root){
        if(root==null){
           return  new TreeInfo(0,0);
        }
        TreeInfo left=diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight=Math.max(left.ht, right.ht) +1;
        int dia1=left.dia;
        int dia2=right.dia;
        int dia3=left.ht+right.ht+1;

        int mydia=Math.max(Math.max(dia1,dia2),dia3);

        TreeInfo myInfo = new TreeInfo(myHeight, mydia);
        return myInfo;
    }


    //subtree of another tree
    

    //BHAI BHUT BADA H AUR SHAYAD KAAM BHI NA AYE

    public static void main(String[] args) {
        int nodes[] = { 1, 2, -1, -1, 5, -1, -1, 3, -1, 6 - 1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);
        // preorder(root);
        // inorder(root);
        // postorder(root);
        // levelOrder(root);
        // System.out.println(countofNodes(root));
        // System.out.println(SumOfNodes(root));
        // System.out.println(height(root));
        // System.out.println(diameter(root));
        System.out.println(diameter2(root).dia);
       
    }
}
