package linkedlist;

public class EditDistance {
        
	   public static int editDistance(String s1,String s2){
		   //create a matrix of i+1,j+1
		   int[][] distance = new int[s1.length()+1][s2.length()+1];
		   /**
		    m[i,j] = d(s1[1..i], s2[1..j])

           m[0,0] = 0
           m[i,0] = i,  i=1..|s1|
           m[0,j] = j,  j=1..|s2|
           m[i,j] = min(m[i-1,j-1]
                         + if s1[i]=s2[j] then 0 else 1 fi,
                        m[i-1, j] + 1,
                        m[i, j-1] + 1 ),  i=1..|s1|, j=1..|s2|         
		   
		**/
		   distance[0][0] = 0;
		   for(int i=0; i<s1.length()+1;i++)
			   distance[i][0] = i;
		   
		   for(int j =0;j<s2.length()+1;j++)
		       distance[0][j] = j;
		   
		   int val = 0;
		   for(int i=1; i<s1.length()+1;i++){
			  for(int j=1;j<s2.length()+1;j++){
			      
				 if((int)s1.charAt(i-1) == (int)s2.charAt(j-1))
					  val = 0;
				 
				  else
					  val = 1;
				  
				 
				 distance[i][j] = min(distance[i-1][j-1]+val,distance[i][j-1]+1,distance[i-1][j]+1);
				 System.out.println("distance"+ distance[i][j]); 
			 }
			  
		  }
		   
		  return distance[s1.length()][s2.length()]; 
		  
		   
		    
	   }
	   
	   
	   public static int min(int a ,int b,int c){
		   
		   if(a<b){
			   if(a< c)
				   return a;
			   else
				   return c;
		   }
		   
		   else{
			   if(b<c)
				   return b;
			   else
				   return c;
			   
		   }
	   }
	   
	   public static void main(String[] args){
		    String s1 ="SUNDAY";
		    String s2 = "SATURDAY";
		    int d = editDistance(s1,s2);
		    System.out.println(d);
		    
		    
		    
		   
		   
	   }
	 
}
