package bst;

public class Main {

	public static void main(String[] args) {
		
	Binary bst=new Binary();
	
	bst.Insert(50);
	bst.Insert(20);
	bst.Insert(10);
	bst.Insert(30);
	bst.Insert(40);
	bst.Insert(25);
	bst.Insert(90);
	bst.Insert(60);
	bst.Insert(100);
	bst.Insert(55);
	bst.Insert(80);
	
	bst.preorder();
	bst.inorder();
	System.out.print("Postorder:");
	bst.postorder(bst.getRoot());
	System.out.println();
	System.out.println(bst.find(200));
	System.out.println(bst.max());
	

	}

}
