package bst;

import java.util.Stack;

public class Binary {
	private Node root;
	
	public Binary() {
		root=null;
	}
	
	public boolean Insert(int data) {
		Node newNode=new Node(data);
		
		if(newNode==null) {
			return false;
		}
		
		if(root==null) {
			root=newNode;
			return true;
		}
		Node temp=root;
		while(true) {
			if(data==temp.getData()) {
				return false;
			}
			
			if (data<temp.getData()) {
				if(temp.getLeft()==null) {
					temp.setLeft(newNode);
					return true;
				}
				temp=temp.getLeft();
				
			}
			else{
				if(temp.getRight()==null) {
					temp.setRight(newNode);
					return true;
				}
				temp=temp.getRight();
			}
		}
		
	}
	
	public void preorder() {
		Node temp=root;
		System.out.print("prerder :");
		Stack<Node> stack=new Stack<>();
		
		
		while (temp!=null||!stack.empty()) {
			while(temp!=null) {
				
			System.out.print(temp.getData()+" ");
			stack.push(temp);
			temp=temp.getLeft();
		}
			
		temp=stack.pop().getRight();
		}
		System.out.println();
	}
//	void pre(Node node) {
//		System.out.println(node.getData());
//		pre(node.getLeft());
//		pre(node.getRight());
//	}
//	void preorder() {
//		pre(root);
//	}
	
	
	public void inorder() {
		
		Node temp=root;
		Stack<Node> stack=new Stack<>();
		System.out.print("Inorder :");
	    while (temp!=null|| !stack.empty()) {
	    	while(temp!=null) {
	    		stack.push(temp);
	    		temp=temp.getLeft();
	    		
	    		
	    	}
	    	
	    	temp=stack.pop();
	    	System.out.print(temp.getData()+ " ");
	    	temp=temp.getRight();
	    }
	    System.out.println();
		
	}
	
	
	public void postorder(Node root) {
		if(root!=null) {
			postorder(root.getLeft());
			postorder(root.getRight());
			System.out.print(root.getData()+" ");
		}
		
	}
	 public Node getRoot() {
	        return root;
	    }
	 
	 
	 public boolean find(int data) {
		 Node temp=root;
		 
		 while (temp!=null) {
		 if(temp.getData()==data) {
			 return true;
		 }
		 if(data<temp.getData()) {
			 temp=temp.getLeft();
		 }
		 else {
			 temp=temp.getRight();
		 }
		 }
		 
		 return false;
	 }
	 
	 public int max() {
		 Node temp=root;
		 while (temp.getRight()!=null) {
			 temp=temp.getRight();
		 }
		 return temp.getData();
	 }

}
























