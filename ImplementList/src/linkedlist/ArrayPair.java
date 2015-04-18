package linkedlist;
import java.util.HashMap;
import java.util.Set;
public class ArrayPair {
	 /**Does not consider duplicates of numbers
	 * 
	 * @param Sum
	 *            . Example: 8
	 * @param Integer
	 *            array. Example: [3, 4, 5, 4, 4]
	 * @return List of Integer pairs. Example: [[3, 5], [4, 4]]. Does not
	 *         consider multiple occurrences of number 4.
     **/
	
	
	//This is a O(n) approach using a hashmap
	 public static int[] arrayPair(int[] arr,int target){
		   
		   HashMap<Integer,Integer> list =  new HashMap<Integer,Integer> ();
		   int[] store = new int[2];
		   
		   for(int i =0;i<arr.length;i++){
			    if(list.containsKey(arr[i])){
			    	int index = list.get(arr[i]);
			    	store[0]= index +1;
			    	store[1]= i+1;
			    	break;
			    }
			    else{
			    	list.put(target - arr[i], i);
			    }
		   }
		   
		   return store; 
	 }
	
     

     //Insert position of an Array
     //Binary search algorithm O(nlogn) 
     public static int searchPos(int[] array,int key, int start, int end){
    	     int mid = (start+end)/2;
    	     
    	     if(array[mid] == key)
    	    	 return mid;
    	     
    	     else if(array[mid] > key){
    	    	 return start<mid?searchPos(array,key,start,mid-1):start;
    	    	 
    	     }
    	     else
    	    	 return end>mid?searchPos(array,key,mid+1,end):end+1;
    	 
     }
     
     /** Solution for word break problem
         Given a string and a dict find if the words in the string can be segmented.
         s = "leetcode"  dict=["leet","code"]
     **/
     public boolean wordbreak(String s,Set<String> dict,int index){
    	    if(index == s.length()) return true;
    	    
    	    for(String t: dict){
    	    	 int len = t.length();
    	    	 int end = index+len;
    	    	 
    	    	 if(end> s.length())continue;
    	    	 
    	    	 if(s.substring(index, end).equals(t))
    	    		 if(wordbreak(s,dict,end))
    	    		     return true;
    	    	 
    	    	 }
    	    
    	     return false;
     }

     
     public static void main(String[] args){
 	    int[] array = {2,7,9,10,11,15};
 	    int target = 16;
 	    int[] result;
 	    result = arrayPair(array,target);
 	    int search = searchPos(array,target,0,array.length-1);
 	    
 	    String st ="Programcreek";
 	    //Set<String> dict = new Set<String>();
 	    //["Program","creek"];
 	    
 	    
 	    
 	    System.out.println(result[0]);
 	    System.out.println(result[1]);
 	    System.out.println(search);
 	    
  }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     



}
