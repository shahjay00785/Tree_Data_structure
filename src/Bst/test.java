package Bst;


import java.util.Scanner;

public class test {
	public static void main(String args[]){
		
          
			     
			   //test bst=new test();
			   BstTree bst=new BstTree();
			   
			   
			   Scanner sc=new Scanner(System.in);
			   
			   
			   while(true)
			   {
				   System.out.println();
				   System.out.println("------------Menu--------------------");
				   System.out.println("1: Insert-data:");
				   System.out.println("2: In-order: ");
				   System.out.println("3: pre-order: ");
				   System.out.println("4: Post-order");
				   System.out.println("5: bread search order ");
				   System.out.println("6: sort");
				   System.out.println("7: find Minimum:");
				   System.out.println("8: find Maximum:");
				   System.out.println("-------------------------------------");
				   
				  
				   System.out.println("Enter the choice");
				   int choice=sc.nextInt();
				   
				   switch(choice){
				   case 1:
					   System.out.println("Enter the data for tree");
					   int data=sc.nextInt();
					   bst.bstInsert(data);
					   break;
					   
				   case 2:
					   bst.inorder();
					   break;
				   case 3:
					   bst.preorder();
					   break;
				   case 4:
					   bst.postorder();
					   break;   
					   
					   
				   
				   case 7:
					   bst.findMin();
					  
					   break;
					   
				   case 8:
					   bst.findMax();
					   break;
					   
					   default:
						   System.out.println("You are out the process");
						  break;
				   }
				   
				   
				 
				   
			   }
			   
		  
		
		
		
	}
}
	