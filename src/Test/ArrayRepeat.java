package Test;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayRepeat {
	public static void main(String[] args) {
	String [] array1 = {"Ava", "Emma", "Olivia"} ;
	String [] array2 = {"Olivia", "Sophia","Emma", } ;
	HashSet<String> hset= new HashSet<String>();
	
	for (String x :array1) {
		hset.add(x);
	}
	for (String h :array2) {
		hset.add(h);
	}
	System.out.println(hset);
	
	
	
	
	String [] array3 = {"aaa", "aba", "adda", "acdea", "aeda"} ;

	ArrayList<String> list1= new ArrayList<String>();
	for (int i=0;i<=array3.length-1;i++) {
		
		String a = array3[i];
		
		StringBuilder sb= new StringBuilder(a);
		String x= sb.reverse().toString();
	if(a.equals(x)) {
		
		list1.add(a);

	}
		}
	
	System.out.println(list1);
	String large = list1.get(0);
	for (String j : list1) {
		if (j.length()>large.length()) {
			large = j;
		}
		
		
	}
	
	System.out.println("Largest Palindrone is" + " "+ large);
	
		
	}
	
			
		}
	
	

