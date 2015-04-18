package linkedlist;
/**
 * Given a text txt[0..n-1] and a pattern pat[0..m-1],
 *  write a function search(char pat[], char txt[]) that prints all occurrences of pat[] in txt[]. You may assume that n > m
 * txt[] =  "AABAACAADAABAAABAA"
    pat[] = "FAA"

 * Output :index is found at 10
 * @author shrav
 *
 */
//Naive pattern searching O(
public class PatternSearch {
          public static void search(char pat[],char txt[]){
        	    for(int i=0;i<=pat.length - txt.length;i++  ){
        	    	int j;
        	    	for(j=0;j<txt.length;j++){
        	    		if(pat[i+j] != txt[j])
        	    			break;
        	    	}
        	    	//System.out.println("Value of j"+j);
                    if(j == txt.length)        	    	
        	    			System.out.println("The pattern is found at "+ i);
        	    		
        	    }
        	    		
        	  
        } 
          
        //Implement using KMP algorithm which uses the degenerating pattern to compare the strings
         
          
          
          
          
          
        	  
          
	    
          public static void main(String[] args){
        	  char txt[] =  "ABAACDABAACDEAABAA".toCharArray();
        	  char pat[] = "FAA".toCharArray()  ;
        	  
        	  search(txt,pat);
        	  
        	  
          }
          
          
          
          
          
          
}
