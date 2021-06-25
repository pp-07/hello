package Test;

import java.util.HashMap;
import java.util.Map.Entry;

public class String_Q {

	public static void main(String[] args) {
		/*
		 * Find first repeating word in a sentence. The words can be separated by these
		 * [:, ,;,-](colon, space, semi-colon, hyphen) delimiters.
		 * 
		 * Input : This is a first test for first assignment. Output: first
		 * 
		 * Input: This-is-a-first-test-for-first-assignment. Output: first
		 */

		String a = "This@For.is@a@first@test@for@first@assignment";
		
		String []b = a.split("\\W");
		
		
		for(int i=0;i<=b.length-1 ;i++) {
			
		
for (int j=0 ;j<=b.length-1;j++) {
	
if (b[i].equals(b[j]) && i!=j) {
	
	System.out.println(b[i]);
	
	}
	
	}
}

		
			
		
		
		
 		
	String arr[]=  a.split("\\W");
	
		HashMap<String,Integer> hmap= new HashMap<String,Integer>();
		
		for (int i =0 ;i<=arr.length-1;i++) {
			if (hmap.containsKey(arr[i])==false) {
				hmap.put(arr[i], 1);
				
			}else {int oldvalue = hmap.get(arr[i]);
			       int latest = oldvalue +1 ;
			       hmap.put(arr[i],latest);
			       break;
				
			}
		}
		
for (Entry<String, Integer> values: hmap.entrySet()){
if (values.getValue()>1) {
	System.out.println(values.getKey());
}	
}
	}

}
