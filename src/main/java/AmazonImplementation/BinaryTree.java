package AmazonImplementation;

import java.util.ArrayDeque;
import java.util.Queue;

public class BinaryTree {
	
	static class Node{
		int data;
		Node left,right;
		
		public Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
	public static Node root=null;
	
	static Node getNewNode(int data) {
			
		Node newNode = new Node(data);
		
		return newNode;
	}
	
	static 	Node insert(Node root,int data) {
		Node temp=root;
		if(root==null) {
			root = getNewNode(data);
		
		}
		else if(data<=root.data) {
			root.left=insert(root.left,data);
		}
		else {
			root.right=insert(root.right,data);
		}
		return root;
		
//		if(root==null) {
//		root = getNewNode(data);
//	
//	}
//		else if( data<root.data) {
//			while(temp.left!=null) {
//				temp=temp.left;
//			}
//			temp.data=data;
//			
//		}
//		else {
//			while(temp.right!=null) {
//				temp=temp.right;
//			}
//			temp.data=data;
//		}
		
		
	}
	
	static void traversalBFS(Node root) {
		Node temp=root;
		Queue<Node> q= new ArrayDeque<Node>();
		
		q.add(temp);
		int count=0;
		while(!q.isEmpty()) {
			Node t=q.poll();
			if(temp.left!=null) {
				q.add(temp.left);
			}
			else if(temp.right!=null) {
				q.add(temp.right);
			}
			
			}
		System.out.println(count);
	}

	public static void main(String[] args) {
		
    Node root=null;
    root=insert(root,5);
    root= insert(root,10);
    root=insert(root,12);
    root=insert(root,7);
    root=insert(root,6);
    traversalBFS(root);

	}

}


