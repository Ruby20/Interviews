package linkedlist;

import java.util.HashMap;

public class MajorityElement {
           public int majority(int[] num){
        	     HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        	     
        	     for (int elem : num){
        	    	  if(map.containsKey(elem)){
        	    		  map.put(elem,map.get(elem)+1 );
        	    	  }
        	    	  else
        	    		  map.put(num[elem], 1);
        	    	  
        	     }
        	     
        	     for(int elem:map.keySet()){
        	    	 if(map.get(elem) > (num.length)/2)
        	    		   return elem;
        	     }
        	     
        	   
        	   
        	      return -1; 
           }
          
           public static void main(String[] args){
        	       MajorityElement m = new MajorityElement();
        	       int[] num={2,3,3,4,5,5,5,5,6,7,7,5,5,5,5};
        	       
        	       System.out.println(m.majority(num));
        	       
        	       
        	      
        	   
           }
           
}
