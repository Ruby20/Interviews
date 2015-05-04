package linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Palindrome {
	 
	public boolean isPalindrome(int x) {
         int rev=0;
         int num =x;
         if(x<0) return false;
         if (x == 1 || x == 0) return true;
         
         while(x > 0){
             
             rev =  rev *10 +  x%10;
             x = x / 10;
             
         }
         System.out.println(rev);  
         System.out.println(x);
         if(rev == num)
           return true;
         else
           return false;    
       
	 }    
	 
	 /**find unique minimum element in an array
	 * Given   57211132443
	 * sort it 11122334457
	 * Output  = 5
	 **/
	// import java.util.Arrays;
	 public static int findMinUnique(int[] a){
		 if(a.length<1)
			 return 0;
		 if(a.length == 1)
			 return a[0];
		 int flag = 0;
		 Arrays.sort(a);
		 int min = 0;
		 for(int i=0;i<a.length-1;i++){
			   if(a[i]== a[i+1]){
				   i++;
				   flag = 1;
			   }
			   else
				    min = a[i];
			 
			 
		 }
		 return min;
		 
 }
	 
	 
/**find the position of the unique min element in an array	 
**  suppose you get a space delimited string 3 3 4 5 6 7 7 4 6 11 11
** Output is 5 is the unique min and its pos is 4.
**	 Get the pos
 * @throws IOException 
**/	 
/*	public int minElement(int[] a){
        String s ="3 3 4 5 6 7 7 4 6 11 11";
        String[] str =  s.split(" ");
        int[]  num = new int[str.length];
        
        for(int i = 0;i<num.length;i++){
        	
        }
        
		
        
		
		return 0;
	}
*/
	 
/**	 Input: arr[] = {3, 1, 4, 6, 5}
 Output: True
 There is a Pythagorean triplet (3, 4, 5).

 Input: arr[] = {10, 4, 6, 12, 5}
 Output: False
 There is no Pythagorean triplet.
 O(N^3) solution ver bad!!!
**/
public static boolean hasPythagoreanTriplets(int[] a){
	  
	  //Use hashmap and find the squares of each number in the array
	  for(int i=0;i<a.length;i++){
		  for(int j=i+1;j<a.length;j++){
			  for(int k=j+1;k<a.length;k++){
				   int x = a[i]*a[i];
				   int y = a[j]*a[j];
				   int z = a[k]*a[k];
				   
				   if(x == y+z||y == x+z || z == x+y){
					   return true;
				   }
				   
			}
		  }
	  }
	  return false;
}
	 
/** strive for a better solution 
 *  	 
 * @param args
 * @throws IOException
 */

public static boolean pythagoreanTrip(int[] a){
	HashMap count = new HashMap();
	//int h=0;
	int b=0,c=0;
	boolean result = false;
	
	//keep a hashtable of the array values squared
	for(int i = 0;i<a.length;i++){
		count.put(a[i]*a[i],i); 
	}		
	
	for(int i=0;i<a.length;i++){
		
		for(int j=i+1;j<a.length;j++){
			c = a[i]*a[i];
			b = a[j]*a[j];
			
			if(count.containsKey(b+c)){
				result = true;
			}
			
		}	  
	}
	
	return result;
}

public static int[] arrayPairSum(int[] a,int target){
	 int[] res = new int[2];
	 HashMap<Integer,Integer> map =  new HashMap<Integer,Integer>();
	 
	 for(int i=0;i<a.length;i++){
		 if(map.containsKey(target-a[i])){
			 int index = map.get(target-a[i]);
			 res[0] = index+1;
			 res[1] = i+1;
		 }
		 else
			 map.put(a[i],i);
		 
		 
	 }
	 
	 
	
	
	return res;
}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	public static void main(String[] args) throws IOException{
   	     Palindrome t = new Palindrome();
   	     //  boolean r = t.isPalindrome(101);
   	     int[] a = {1,2,3,4, 6};
   	     int res =  findMinUnique(a);
   	     boolean res1 = hasPythagoreanTriplets(a);
   	     boolean res2 = pythagoreanTrip(a);
   	     System.out.println("func1 "+res1+" func2 "+res2);
   	     int[] result = arrayPairSum(a,7);
   	     System.out.println(result[0]+" "+result[1]);
   	     
     }
}
