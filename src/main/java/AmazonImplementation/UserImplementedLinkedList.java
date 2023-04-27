package AmazonImplementation;

import java.util.Hashtable;
import java.util.LinkedList;

//public class LinkedList {
//	
//	
//	 class Node{
//		int data;
//		Node next;
//		
//		public Node(int data) {
//			this.data=data;
//			this.next=null;
//		}
//	}
//
//	public static Node head=null;
//	public static Node rear=null;
//	
//	static void add(int data) {
//		 LinkedList sList = new LinkedList(); 
//		Node newNode = sList.new Node(data);
//		Node curr=head;
//		if(head==null) {
//			head= newNode;
//			rear=newNode;
//		}
//		else {
////			newNode.next=head;
////			head= newNode;
//			
////			while(curr.next!=null) {
////				curr=curr.next;
////			}
////			curr.next=newNode;
//			rear.next=newNode;
//			rear=newNode;
//			
//		}
//	}
//	
//	 int remove() {
//		Node curr=head;
//		int x=curr.data;
//		curr=curr.next;
//		head=curr;
//		
//		return x;
//		
//	}
//	 void display() {
//		Node curr=head;
//		while(curr!=null) {
//			System.out.println(curr.data);
//			curr=curr.next;
//		}
//	}
//	
//	static void displayRear() {
//		
//			System.out.println(rear.data);
//			
//	}
////	public static void main(String[] args) {
////		add(1);
////		add(2);
////		add(3);
////		add(4);
////		display();
////		//remove();
////		displayRear();
////
////	}
//
////}
//
//
//} 


public class UserImplementedLinkedList {    
    //Represent a node of the singly linked list    
    class Node{    
        int data;    
        Node next;    
            
        public Node(int data) {    
            this.data = data;    
            this.next = null;    
        }    
    }    
     
    //Represent the head and tail of the singly linked list    
    public Node head = null;    
    public Node tail = null;    
        
    //addNode() will add a new node to the list    
    public void addNode(int data) {    
        //Create a new node    
        Node newNode = new Node(data);    
            
        //Checks if the list is empty    
        if(head == null) {    
            //If list is empty, both head and tail will point to new node    
            head = newNode;    
            tail = newNode;    
        }    
        else {    
            //newNode will be added after tail such that tail's next will point to newNode    
            tail.next = newNode;    
            //newNode will become new tail of the list    
            tail = newNode;    
        }    
    }    
        
    //display() will display all the nodes present in the list    
    public void display() {    
        //Node current will point to head    
        Node current = head;    
            
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Nodes of singly linked list: ");    
        while(current != null) {    
            //Prints each node by incrementing pointer    
            System.out.print(current.data + " ");    
            current = current.next;    
        }    
        System.out.println();    
    }    
        
    void LinkedListDemo() {
    	LinkedList l = new LinkedList();
    	l.add(l);
    	l.add(2);
    	l.add(3);
    	l.add(4);
    	l.add(5);
    	
    }
    
    
    public static void main(String[] args) {    
            
         Hashtable<String, Integer> hs = new Hashtable<String, Integer>(); 
         
         hs.put("hag", 1);
         
         hs.put("wkhqj", 2);
         hs.put("hasakjg", 3);
         hs.put("hkfnlag", 4);
        
         hs.put("lrkhag", 5);
         System.out.println(hs.get("hag"));
         
         
    }    
}   