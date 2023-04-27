package AmazonImplementation;

public class BinarySearch {
	
	
	static int binarySearch(int[] a,int x, int s, int e) {
		
		int m= s+(e-s)/2;
		while(s<=e) {
			m= s+(e-s)/2;
			if(a[m]==x)
				return m;
			else if(x>a[m]) {
				s=m+1;
			}
			else if(x<a[m]) {
				e=m-1;
			}
		}
		
		
		
		return -1;
	}
	
	static int FirstAndLastOccurance(int[] a,int x, int s, int e, boolean searchLast) {
	
	int m= s+(e-s)/2, flag=0;
	while(s<=e) {
		
		m= s+(e-s)/2;
		if(a[m]==x) {
			flag= m;
			if(searchLast)
			   s=m+1;
			else
               e=m-1;
		}
		else if(x<a[m]) {
			e=m-1;
		}
		else if(x>a[m]) {
			s=m+1;
		}
		
		System.out.println("FirstOccurance: ");
	}
	
	
	
	return flag;
}
	
	static int countOccurances(int[] a,int x, int s, int e) {
		
		return FirstAndLastOccurance(a,x,s,e,true)-FirstAndLastOccurance(a,x,s,e,false)+1;
	}

	
	
static int circularSorting(int[] a,int s, int e) {
		
		int m= s+(e-s)/2,l=a.length;
		while(s<=e) {
			m= s+(e-s)/2;
			if(a[s]<=a[e])
				return s;
			else if(a[m]<a[(m+1)%l] && a[m]<a[(m+l-1)%l])
				return m;
			else if(a[m]<=a[e]) {
				e=(m-1)%l;
			}
			else if(a[m]>=a[s]) {
				s=(m+1)%l;
			}
			
		}
		
		
		
		return -1;
	}
static int searchCircularlySortedArray(int[] a,int x,int s, int e) {
	
	int m= s+(e-s)/2,l=a.length;
	while(s<=e) {
		m= s+(e-s)/2;
		if(x==a[m])
			return m;
		else if(a[m]>=a[s]) {
			if(x>=a[s] && x<=a[m]) {
				e=m-1;
				
			}else {
				s=m+1;
			}
	//	return binarySearch(a,x,s,m-1);
		}
		else if(a[e]>=a[m]) {
			if(x>=a[m] && x<=a[e]) {
				s=m+1;
				
			}else {
				e=m-1;
			}
			//return binarySearch(a,x,m+1,e);
		}
		
	}
	
	
	
	return -1;
}
	public static void main(String[] args) {
		
		
		int[] a= {10,3,4,5,8,9};
		
		
		System.out.println(searchCircularlySortedArray(a,10,0,a.length-1));

	}

}
