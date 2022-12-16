package week3Assgns;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {
   
	public static void main(String[] args) {
			int[] a= {3,2,11,4,6,7};
			int[] b= {1,2,8,4,9,7};
			List<Integer> list1=new ArrayList<Integer>();
			List<Integer> list2=new ArrayList<Integer>();
			List<Integer> intrsec=new ArrayList<Integer>();
			
			for(int i=0;i<a.length;i++) {
				
				list1.add(a[i]);
			}
			
			for(int j=0;j<b.length;j++) {
				
				list2.add(b[j]);
			}

			for(int i=0;i<list1.size();i++) {
				
				for(int j=0;j<list2.size();j++) {
					
					if(list1.get(i)==list2.get(j)){
						
						intrsec.add(list1.get(i));
						
					}
				}
			}
			System.out.println("Intersection of array a & b is: " +intrsec);
			
		}

	}
	

