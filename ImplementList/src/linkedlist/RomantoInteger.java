package linkedlist;

import java.util.HashMap;

public class RomantoInteger {
       public static int rtoi(String num){
    	   HashMap<Character,Integer> tab = new HashMap<Character,Integer>();
    	   tab.put('M',1000);
    	   tab.put('D', 500);
    	   tab.put('C', 100);
    	   tab.put('L', 50);
    	   tab.put('X', 10);
    	   tab.put('V', 5);
    	   
    	   int prev = 0;
    	   int Intnum = 0;
    	   for(int i = num.length()-1;i>=0;i--){
    	        int temp = tab.get(num.charAt(i));
    	        
    	        if(temp < prev)
    	        	Intnum -= temp;
    	        else
    	        	Intnum += temp;
    	        
    	        prev = temp;
    	   
    	   }
    	   
    	   
    	   
    	   return Intnum;
    	   
       }
	  
	   public static void main(String[] args){
		     int res = rtoi("XXX");
		     System.out.println(res);
		   
	   }
	
	
	
}
