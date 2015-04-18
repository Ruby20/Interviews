package linkedlist;

import java.util.HashMap;
import java.util.Stack;

//check if the string has balances pairs of braces
public class BlancedBraces{
       //Maintain a hashmap to store all the patterns of the braces
	   
	   public  boolean isBalanced(String s){
		   
		   HashMap<Character, Character> bracketMap = new HashMap<Character, Character>();
		   bracketMap.put('{', '}');
		   bracketMap.put('[', ']');
		   bracketMap.put('(', ')');
		   
		   
		      if(s.length()%2!= 0) return false;
		      
		      Stack<Character> st =  new Stack<Character>();
		      for(char c:s.toCharArray()){
		    	     if(bracketMap.containsKey(c))
		    	    	 st.push(c);
		    	     
		    	     else if(!st.isEmpty() || bracketMap.get(st.peek()) == c){
		    	    	 st.pop();
		    	    	}
		    	     else
		    	    	  return false;
		      }
		    	        	 
		      return st.isEmpty();      
		      
	   }
	   
	   public static void main(String[] args){
		       BlancedBraces b = new BlancedBraces();
		       System.out.println(b.isBalanced("()[]{}(([])){[()][]}"));
			   System.out.println(b.isBalanced("())[]{}"));
			   System.out.println(b.isBalanced("[(])"));

	   }
	 
	
}