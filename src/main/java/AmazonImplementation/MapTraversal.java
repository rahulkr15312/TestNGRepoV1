package AmazonImplementation;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapTraversal {

	public static void main(String[] args) {
		
		Map<String, Integer> hm
        = new HashMap<String, Integer>();

    
    hm.put("GeeksforGeeks", 54);
    hm.put("A computer portal", 80);
    hm.put("For geeks", 82);
    
    Iterator it= hm.entrySet().iterator();
    while(it.hasNext()) {
    	Map.Entry mapElement = (Map.Entry) it.next();
    	
    	System.out.println(mapElement.getKey()+"=>"+mapElement.getValue());
    }
    System.out.println("---------------------------");
    
    for(Map.Entry<String, Integer> me: hm.entrySet()) {
    	System.out.println(me.getKey()+"=>"+me.getValue());
    	   
    }

    System.out.println(hm.keySet());
	}

}
