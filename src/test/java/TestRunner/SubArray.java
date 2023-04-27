package TestRunner;

public class SubArray {

	public static void main(String[] args) {
		int[] a= {2, 1, 3, 4, 2, 6, 7, 1, 8};
		int t=8;
		boolean f=false;
		
		for(int i=0;i<a.length;i++) {
			int sum=0;
			for(int j=i;j<a.length;j++) {
				
				sum=sum+a[j];
				if(sum==t) {
					System.out.print(i+" "+j+"---------");
					
					f=true;
					
					break;
				}
//				if(f)
//				break;
			}
			System.out.println();
		}
          // SecondMax(a, a.length);
	}
	
	
	static void SecondMax(int[] a, int x) {
		int max=0;
		for(int i=0;i<x;i++){

		if(max<=a[i]){
		max=a[i];
		}
		}
		int secondMax=0;
		for(int j=0;j<x;j++){

		if(a[j]==max){
		continue;
		}

		else if(secondMax<=a[j]){
		secondMax=a[j];
		}
}
	

		System.out.println(max +" "+ secondMax);	
		
	}
	
}
