package week3Assgns;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

		public static void main(String[] args) {

			String str="PayPal India";
	        char[] charArray = str.toCharArray();
			Set<Character> charSet=new HashSet<Character>();
			Set<Character> dupcharSet=new HashSet<Character>();
			
			for(int i=0;i<charArray.length;i++) {
				  boolean add = charSet.add(charArray[i]);
				  if(!add) {
					  dupcharSet.add(charArray[i]);
				      
			}

		}
			System.out.println(charSet);
	    	System.out.println(dupcharSet);
	      int freqcy = Collections.frequency(charSet, 'a');
	      System.out.println(freqcy);
		}
	}

