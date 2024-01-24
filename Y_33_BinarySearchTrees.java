import java.util.ArrayList;

public class Y_33_BinarySearchTrees {

    //making the node
static class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data=data;
    }
}
     public static Node insert(Node root,int val){
     if(root==null){
        root=new Node(val);
        return root;
     }
     if(root.data>val){
        //left subtree
        root.left = insert(root.left,val);
     }
     else{
        root.right=insert(root.right, val);

     }
     return root;
     }

     public static void inorder(Node root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
     }
     

     //searching
     public static boolean search(Node root,int key){
        if(root==null)
        {
            return false;
        }
        if(root.data>key){
            return search(root.left,key);
        }
                
        else if(root.data==key){
            return true;
        }
        else{
            return search(root.right,key);
     }
    }

    //delete an node


    public static Node delete(Node root, int val){
        if(root.data>val){
            root.left=delete(root.left,val);
        }                                                //search
        else if(root.data<val){
            root.right = delete(root.right,val);
        }
        else{  //root.data == val 
                //case 1
                if(root.left==null && root.right==null){
                    return null;
                }

                //case 2
                if(root.left ==null){
                    return root.right;
                }
                else if(root.right==null){
                    return root.right;
                }
                Node IS = inorderSuccessor(root.right);
                root.data=IS.data;
               root.right= delete(root.right, IS.data);
        }
        return root;
    }
    public static Node inorderSuccessor(Node root){
           while(root.left!=null){
                root=root.left;
            }
            return root;
    }

    //print in range
    public static void printInRange(Node root,int X, int Y){
        if(root==null){
            return;
        }
            if(root.data >= X && root.data <= Y){
                printInRange(root.left,X,Y);
                System.out.println(root.data+" ");
                printInRange(root.right,X,Y);
            }
            else if(root.data >= Y){
                printInRange(root.left,X,Y);
            }
            else{
                printInRange(root.right,X,Y);
            }
    }
    public static void printPath( ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.println(path.get(i)+"->");
        }
    }
    public static void printRoot2leaf(Node root, ArrayList<Integer>
    path){
    if(root==null){
        return;
    }
    path.add(root.data);

    //leaf
    if(root.left==null&& root.right==null){
        printPath(path);
    } else{  // non leaf
        printRoot2leaf(root.left,path);
        printRoot2leaf(root.right,path);
    }
   
    path.remove(path.size()-1);
}
    
    public static void main(String[] args) {
      int values[]={8,5,3,1,4,6,10,11,14};  
      Node root=null;

      for(int i=0;i<values.length;i++){
        root = insert(root, values[i]);
      }
      inorder(root);
      System.out.println();

    //   if(search(root,7)){
    //     System.out.println("found");
    //   }  else{
    //     System.out.println("not found");
    //   }
    // delete(root, 4);
    // inorder(root);  
    // printInRange(root, 3, 10);
    printRoot2leaf(root, new ArrayList<>());
    }
}