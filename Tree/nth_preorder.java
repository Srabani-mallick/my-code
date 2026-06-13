class Node {
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

public class nth_preorder {
    static int count=0;
    
    public static Node createTree() {
        Node root=new Node('A');
        root.left=new Node('B');
        root.right=new Node('C');
        root.left.left= new Node('D');
        root.left.right=new Node('E');
        root.left.right.left=new Node('G');
        root.right.right=new Node('F');
        return root;
    }
    
    public static void nthpreorder(Node root, int N) {
        if(root==null) {
        	return;  
        }
        
        count++; 
        
        if(count==N) {
            System.out.print((char)root.data); 
            return;
        }
        nthpreorder(root.left,N);
        nthpreorder(root.right,N);
    }
    
    public static void main(String[] args) {
        Node a=createTree();
        int n=5;
        count=0;
        nthpreorder(a,n);
    }
}