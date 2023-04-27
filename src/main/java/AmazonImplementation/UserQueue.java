package AmazonImplementation;
//package AmazonImplementation;
//
//public class Queue {
//	
//	static int front=-1;
//	static int rear=-1;
//	static int max_size = 100;  
//	static int[] a = new int[max_size]; 
//	
//	static void Enqueue(int x) {
//		if(rear==max_size-1) {
//			System.out.println("Queue is full, can't enqueue any more entry");
//			return;
//		}
//		if(isEmpty()) {
//			front=0;
//			rear=0;
//			a[rear]=x;
//		}
//		else {
//			a[++rear]=x;
//		}
//		
//	}
//	static int Dequeue() {
//		int popppedItem=0;
//		if(isEmpty()) {
//			System.out.println("Queue is empty, can't dequeue any more entry");
//		}
//		else if(front==rear) {
//			popppedItem = a[front];
//			front=rear=-1;
//		}
//		
//		popppedItem = a[front];
//		front=front+1;
//		
//		return popppedItem;
//		
//	}
//	static int peek() {
//		return a[front];
//	}
//	static boolean isEmpty() {
//		return rear==-1 && front==-1?true:false;
//	}
//	public static void main(String[] args) {
//		
//
//	}
//
//}
