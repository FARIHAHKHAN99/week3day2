package week3Assgns;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingNum {

		public static void main(String[] args) {
		
			int[] data= {2,4,3,6,7};
			Set<Integer> miss=new HashSet<Integer>();
			
			for (Integer i: data) {
			       miss.add(i);
			}
			
			System.out.println(miss);
			
			List<Integer> c=new ArrayList<Integer>(miss);
			List<Integer> ms=new ArrayList<Integer>();
			for(int i=2;i<=c.size();i++) {
			  	    
				 if(i!=c.get(i-2))
					{ 	
				    	ms.add(i);
				    }  
		}
			
			System.out.println("Missing elemennt is: " +ms);
	}
		}


			     
