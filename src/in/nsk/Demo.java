package in.nsk;

import java.util.*;
class Demo {
 public static void main(String[] args) {
    List <Integer> l= new ArrayList<>();
    l.add(10);
     l.add(5); 
     l.add(68); 
     l.add(43);
     l.add(43);
     System.out.print(l);
     Comparator<Integer> c=(i,j)->(i<j)?-1:(i>j)?1:0;
     Collections.sort(l,c);
     System.out.print(l);
    
}
}
//class Mycomparator implements Comparator<Integer>{ 
//	 public int compare(Integer i,Integer j){
//			/*
//			 * if(i<j){ return -1; } if(i>j){ return 1; } else{ return 0; }
//			 */
//		return  (i<j)?-1:(i>j)?1:0;
//	 }
//	}
 