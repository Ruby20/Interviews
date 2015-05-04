package linkedlist;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
//import java.util.LinkedHashMap;
import java.util.Set;

public class StringAndArray{
   /**remove char from a string 
	 *Write a program to remove a given character from String in Java. 
	 *Your program must remove all occurrences of given character. 
	 *For example, if given String is "aaaaa" and String to remove is "a" then output should be an empty String. 
	 *Similarly if input String is "abc" and character to remove is "b" then your program must return "ac" as output. 
    **/
	 public static String removeChar(String a,char c){
		 char[] arr = a.toCharArray();
		// boolean[] rt = false;
		 StringBuilder str = new StringBuilder();
		 for(char i : arr){
			 if(i != c){
				 str.append(i);
			 }
			
		 }
		 
		 return str.toString();
		 
	 }
	 
	
	 //to remove only the first occurence then
	 public static String removeFirstChar(String a,char c){
		 char[] arr = a.toCharArray();
		 boolean flag = false;
		 
		 StringBuilder str = new StringBuilder();
		 for(char i : arr){
			
			 if( i==c){
				 if(flag == false)
					 flag = true;
				 else 
				   str.append(i);
			 }
			 if(i!= c)
				 str.append(i);
			 
			 
		 }
		 
		 
		 return str.toString();
		 
	 }
	 
	 
	 /**How to find first non repeated characters from String in Java?
     //"aaabccdee" first non would be b
	 //naive solution doesn't work 'hello' ans 'h' but getting 'e'
	  * 
	  * @param a
	  * @return
	  */
	 public static char findNonRepChar(String a){
		 char c=' ';
		 char[] arr = a.toCharArray();
		// boolean flag = false;
		 
		// StringBuilder str = new StringBuilder();
		 for(int i = 1;i<  arr.length;i++){
	            if(arr[i-1]!=arr[i]){
	            	return arr[i];
	            }
	      
		 }
		 return c;
	 }	 
	 
	 //maintain a count of each values in a hashmap
	 
	 public static char findNonRep(String test){
		//char  c = ' ';
		//using a set and a list we can get right solution in O(N)
		Set<Character> rep = new HashSet<>();
		List<Character> non_rep = new ArrayList<> ();
		char[]  testarr = test.toCharArray();
		
		for(int i = 0;i<testarr.length;i++){
			   if(rep.contains(test.charAt(i))){
				   continue;
			   }
			   if(non_rep.contains(test.charAt(i))){
				   non_rep.remove((Character)test.charAt(i));
				   rep.add(test.charAt(i));
				   
			   }else{
				   non_rep.add(test.charAt(i));
			   }
			   
		}		   
		
	    return non_rep.get(0);	
	}
	//Write a method to count occurrences of  a character in String? 
    public static int countOccurence(String test,char c){
    	if(c == ' ' ){
    		System.out.println("Null character");
    	}
    	//int index = 0;
    	
    	Map<Character,Integer> count = new HashMap<Character,Integer>();
    	for(int i =0;i<test.length();i++){
    	  if(test.charAt(i) == c){	 
    		 if(count.containsKey(test.charAt(i))){
    			  count.put(test.charAt(i), count.get(c)+1);
    		 }
    		 else{
    			 count.put(test.charAt(i), 1);
    		 }
    		
    	  }	 
    	}
    	
    	return count.get(c);
    }
 
    /**	Write a method to remove duplicates from ArrayList in Java?
    *Read more: http://javarevisited.blogspot.com/2015/04/how-to-remove-given-character-from.html#ixzz3Y10Ju63w	 
	*We can copy the arraylist elements into a Set and then copy back into the arrayList
	*To maintain node insertion order we can use LinkedHashSet
	**/
    public static ArrayList<Integer> removeDup(int[] a){
    	ArrayList<Integer> list =  new ArrayList<Integer>(a.length);
    	ArrayList<Integer> list1 =  new ArrayList<Integer>(a.length);
    	
    	//copy array elements into an arraylist
    	for(int i = 0;i<a.length;i++){
    		 list.add(a[i]);
    		 list1.add(a[i]);
    	}
    	//copy arraylist into a set
    	Set<Integer> dedup = new HashSet<>(list);
    	Set<Integer> noDup = new LinkedHashSet<>(list);
    	list.clear();
    	list1.clear();
    	
    	//copy back the set without dups into the list
    	list.addAll(dedup);
    	list1.addAll(noDup);
    	
    	//return list;
    	return list1;
    	
    	
    	
    	
    }
    
    //How to get rid of repeated elements from ArrayList? 
    
    public static ArrayList<Integer> getRidofDup(int[] a){
    	ArrayList<Integer> list =  new ArrayList<Integer>(a.length);
    	//ArrayList<Integer> list1 =  new ArrayList<Integer>(a.length);
    	
    	//copy array elements into an arraylist
    	for(int i = 0;i<a.length;i++){
    		 list.add(a[i]);
    	//	 list1.add(a[i]);
    	}
    	
    	//convert the arraylist into a hashset and copy back
    	Set<Integer> dedup = new HashSet<>(list);
    	list.clear();
    	//copy back 
    	list.addAll(dedup);
    	
    	
    	return list;
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
		 
		 
			 
	 
	 
	 
	public static void main(String[] args){
		  
		  String a = "aaaaabccdee";
		  char target = 'a';
		  String test = "hello";
		  int[] my_num = {2, 3, 4, 5, 6, 2, 2, 2, 2, 5, 6, 7, 8, 9, 10, 34, 23, 2 ,2 ,25, 4, 5};
		  
		  //String res = removeChar(a,target);
		  //String res1 =  removeFirstChar( a, target);
		  char f = findNonRep(test);
		  //char f =
		  int res = countOccurence(a,'c');
		  System.out.println(getRidofDup(my_num));
		  System.out.println(removeDup(my_num));
		  
		  System.out.println(res);
		  //System.out.println(res1);
		  //System.out.println(f);
		  
	  }

	    
	   
	
	
	
}
