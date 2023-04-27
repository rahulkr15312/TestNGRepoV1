package AmazonImplementation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Test {

	public static void main(String[] args) {
		
		String s="aabbcccda";
		
		String[] cA= s.split("");
		//System.out.print(cA[0]);
			ArrayList<String> list = new ArrayList<String>();
		
for (int i=0;i<cA.length;i++) {
	//System.out.print(cA[i]+" ");
	list.add(cA[i]);
}

Set<String> set =new HashSet<String>(list);

Iterator setIt= (Iterator) set.iterator();

System.out.print(set);
		
	}

}
