package linkedlist;

public class Palindrome {
	 public boolean isPalindrome(int x) {
         int rev=0;
         
         if(x<0) return false;
         if (x == 1 || x == 0) return true;
         
         while(x > 0){
             
             rev =  rev *10 +  x%10;
             x = x / 10;
             
         }
         
         if(rev == x)
           return true;
       
         return false;    
       
       
   }
	 
	 
	 public static void main(String[] args){
   	     Palindrome t = new Palindrome();
   	     boolean r = t.isPalindrome(3);
   	     System.out.println(r);
   	  
     }
}
