package SeleniumTest;

public class MyStack {
	
	int ms=1000;
	int[] a= new int[ms];
	int top=-1;
	int min=-1;
	
	void push(int x) {
		if(a.length==1000) {
			System.out.println("can take more entry");
			
		}
		else {
		a[++top]=x;	
		
		if(a[top]<min)
			min=a[top];
		}
	}

	int pop() {
		if(a[top]==-1) {
			System.out.println("no more entry to pop");
		}
		int x= a[top];
		
		top=top-1;
		return x;
		
	}
	int top() {
		return a[top];
	}
	
	int getMin() {
		return min;
	}
	
	public static void main(String[] args) {
		

	}

}
