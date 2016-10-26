package Bst;

public class BstTree {
	
	class Node{
		int data;
		Node left,right;
		
		public Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	Node root;
	
	BstTree(){
		root=null;
	}
	
	
	public void bstInsert(int data){
		root=BstInsertRoot(root,data);
	}
	
    Node BstInsertRoot(Node root,int data){
	     if(root==null){
	    	 root=new Node(data);
	    	 return root;
	     }
	     
	     if(data<root.data){
	    	 root.left=BstInsertRoot(root.left,data);
	     }
	     else if(data>root.data){
	    	 root.right=BstInsertRoot(root.right,data);
	     }
 
         return root;
    
	}

    public void inorder() {
    	System.out.println("InOrder Traversal");
    	inorderRec(root);
    	}
    
    public void inorderRec(Node root){
    	
    	if(root!=null){
    		inorderRec(root.left);
    		System.out.print("->"+root.data);
    		inorderRec(root.right);
    	}
    }
    
    public void preorder() {
    	System.out.println("Pre_Order Traversal");
    	preorderRec(root);
    	}
    
    public void preorderRec(Node root){
    	
    	if(root!=null){
    		System.out.print("->"+root.data);
    		preorderRec(root.left);
    	    preorderRec(root.right);
    	}
    }	
    
    
    public void postorder() {
    	System.out.println("Post Order Traversal");
    	preorderRec(root);
    	}
    
    public void postorderRec(Node root){
    	
    	if(root!=null){
    		postorderRec(root.left);
    	    postorderRec(root.right);
    	    System.out.print("->"+root.data);
    	}
    }	
  
    
    
    
    public void findMin(){
    	findMinRec(root);
    }
    
    public void findMinRec(Node root){
    	Node current;
    	current=root;
    	
    	while(current.left!=null){
    	  current=current.left;
    	  
    	}
    	System.out.println("Minumum is:->"+current.data);
    	
    }     
    
    public void findMax(){
    	findMaxRec(root);
    }
    
    public void findMaxRec(Node root){
    	Node current;
    	current=root;
    	
    	while(current.right!=null){
    	  current=current.right;
    	  
    	}
    	System.out.println("Maximum is:->"+current.data);
    	
    }     

    
    
}
