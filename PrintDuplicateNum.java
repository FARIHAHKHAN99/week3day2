package week3Assgns;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateNum {
	
		public static void main(String[] args) {
			
			int[] data= {4,3,6,8,29,1,2,4,7,8};

			Set<Integer> dup=new HashSet<Integer>();
			Set<Integer> count=new HashSet<Integer>();
			for (int i=0;i<data.length;i++) {
				
				boolean add = dup.add(data[i]);
				if(!add) {	
					count.add(data[i]);
			}
			
			}
			System.out.println("duplicates: " +count);
		}
	}

