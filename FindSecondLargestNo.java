package week3Assgns;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargestNo {
   
		public static void main(String[] args) {
			
			//set-TreeSet(ascii value/ordered set)
			int[] a= {3,2,11,4,6,7,2,3,3,6,7};
	        Set<Integer> values=new TreeSet<Integer>();
	       
	        //add array values to set
	             for(int i=0;i<a.length;i++) {
	         	 
	            	 values.add(a[i]);
	             }
	               System.out.println(values);
	             
	             //convert Set to List to get()
	             List<Integer> b=new ArrayList<Integer>(values);
	            
	            	    int size = b.size();
	            	    	System.out.println("size of list : " +size); 
	            	    	
	            	     Integer integer = b.get(size-2);
	            	    	System.out.println("Second Largest No: " +integer);
	            		  
	            	   }
	             }
		