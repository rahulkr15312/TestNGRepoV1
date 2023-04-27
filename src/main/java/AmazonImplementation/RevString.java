package AmazonImplementation;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class RevString {
static int circularSorting(char[] a,int s, int e) {
		
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
	public static void main(String[] args) {
//		String s="abcdg",temp = null;
//		String t="";
//		for(int i=s.length()-1;i>=0;i--) {
//			t=t+s.charAt(i);
//		}
//		
//		System.out.println(t);
		
//		String s="abccdfba";
//		boolean flag=false;
//		for(int i=0;i<s.length()/2;i++) {
//			if(s.charAt(i)==s.charAt(s.length()-1-i)) {
//				flag=true;
//			}
//			else {
//				flag=false;
//			}
//			}
//		System.out.println(flag);
		
//		String x="i am a good boy";
//		
//		HashMap<Character, Integer> map= new HashMap<>();
//		
//		
//		
//		for(int i=0;i<x.length();i++) {
//			
//			if(x.charAt(i)!=' ' && x!=null) {
//			if(!map.containsKey(x.charAt(i))) {
//				map.put(x.charAt(i),1);
//				
//			}
//			else {
//				map.put(x.charAt(i),map.get(x.charAt(i))+1);
//			}
//		}
//		}
//		
//		for(Map.Entry<Character, Integer> mE : map.entrySet()) {
//			if(mE.getValue()>1) {
//				System.out.println(mE.getKey());
//				
//			}
//		}
//		System.out.println(map);
		
//		String x= "rahul";
//		
//		String[] s=x.split(" ");
//		int count=0;
//		for(int i=0;i<x.length()-1;i++) {
//			if(x.charAt(i)!=' ' && x.charAt(i+1)==' '  ) {
//				
//				System.out.printf("x.charAt(i)!=' ' && x.charAt(i+1)==' ' %d%n",count);
//				if(i+1==x.length()-1) {
//					System.out.printf("i+1==x.length()-1 %d%n",count);
//				}
//				
//				else {
//					count++;
//					System.out.printf("else %d%n",count);
//				}
//				System.out.println("into if");
//			}
//			
//			
//		} 
		
		
//		if(x.charAt(0)==' ')
//		System.out.println(s.length-1);
//		else {
//			System.out.println(s.length);
//		}
//		
//		System.out.println(count);
		
		
//		String s1="i am a good person";
//		String s2="what to do";
//		System.out.println(s1);
//		for(int i=0;i<s1.length();i++) {
//			for(int j=0;j<s2.length();j++) {
//				if(s1.charAt(i)==s2.charAt(j) && s1.charAt(i)!=' ') {
//					s1=s1.replace(s1.substring(i), s1.substring(i+1));
//				}
//			}
//		}
//		
//		System.out.println(s1);
		
//		String s="bacdbrfblk";
//		ArrayList<String> list1 =  new ArrayList<>();
//		ArrayList<Integer> list2 =  new ArrayList<>();
//		int count=0;
//		for(int i=0;i<s.length();i++) {
//			count=0;
//			for(int j=0;j<s.length();j++) {
//				
//				if(s.charAt(i)==s.charAt(j)) {
//					list2.add(j);
//					System.out.println(list2);
//					count++;
//					if(count==2) {
//						
//						count=0;
//						list1.add(s.substring(list2.get(0),list2.get(1)));
//						list2.clear();
//						
//					}
//					System.out.println(list1);
//				}
//			}
//		}
//		
//		
////		System.out.println(list1);
//		
		String s="{[(])}";
		
		//Stack stack= new Stack();
		
		for(int i=0;i<s.length();i++) {
			if(Stack.isEmpty()) {
				Stack.push(s.charAt(i));
			}
			else if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['  ) {
				Stack.push(s.charAt(i));
			}
			
		}
		Stack.dispaly();
		
		
//		String s="abcab";
//		char ch=' ';
//		for(int i=0;i<s.length();i++) {
//			int count=0;
//			for(int j=0;j<s.length();j++) {
//				if(s.charAt(i)==s.charAt(j)) {
//					count++;
//					ch=s.charAt(i);
//				}
//				
//			
//		}
//			if(count<2) {
//				System.out.println(ch);
//				break;
//			}
//	}
		
//		String s="aabc";
//		
//		for(int i=0;i<s.length();i++) {
//			
//			for(int j=0;j<s.length();j++) {
//				
//				if(j>=i)
//				System.out.println(s.substring(i, j+1));
//		}
//		
//		}
		
		String s1="cdab";
		String s2="bcda";//bcda
		char[] c1= s1.toCharArray();
		char[] c2= s2.toCharArray();
		int i2=circularSorting(c2,0,3);
		int i1=circularSorting(c1,0,3);
		String comp2 = s2.substring(i2,s2.length())+s2.substring(0,i2);
		
		String comp1 = s1.substring(i1,s1.length())+s1.substring(0,i1);
		System.out.println(comp1.equals(comp1));
	}

}
