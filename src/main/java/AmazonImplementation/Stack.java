package AmazonImplementation;

public class Stack {
	
	static int top=-1;   
	static int max_size = 100;  
	static int[] arr = new int[max_size]; 
	
	public static void push(int x) {
		try {
			arr[++top]=x;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	public static int pop() {
		int x=0;
		try {
			 x= arr[top];
			top=top-1;
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return x;
	}
	
	public static int peek()
	{
		return arr[top];
	}
	public static boolean isEmpty()
	{
		return top==-1?true:false;
	}
	public static void dispaly() {
		for(int i=top;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		
        push(1);
        push(2);
        push(2);
	}

}
