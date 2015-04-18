package linkedlist;

public class HouseRobber {
	
	    
	    public int rob(int[] num) {
	       //   int sum = 0,sum1 =0,sum3 =0;
	        /*  //even sum
	          for(int i=0;i<num.length; i =i+2)
	                sum += num[i];
	          //alternating sum
	         for(int i=0;i<num.length;i=i+3)
	          	  sum3 += num[i];
	        // for(int i=0;i<num.length;i++)
	        // 	 for(int j=i+2;j<num.length;j=j+2)
	        //		 sum3 =num[i]+num[j];
	          
	          //odd sum
	          for(int i=1;i<num.length;i=i+2)
	        	  sum1+=num[i];
	          
	          
	          
	         return max(sum, sum1,sum3);     
	         //return sum3;
*/	    
	         if(num.length == 0) return 0;
	         if(num.length == 1) return 1;
	         
	         int max,last;
	         if(num[0] > num[1]){
	        	  max = num[0];
	        	  last = num[0];
	        	 
	         }
	         
	         else{
	        	 max = num[1];
	        	 last = num[0];
	         }
	    
	         for(int i=2;i<num.length;i++){
	        	 int tmp;
	        	 if(last + num[i]>max){
	        		//max = num[i];
	        		tmp =max;
	        		max = last+num[i];
	        		last = tmp;
	        		
	        	 }
	        	 else
	        		 last = max;
	        	 
	         }
	    
	    
	         return max;
	    
	    
	    }
	    
	    
	    
	    public int max(int a,int b,int c){
	    	 if(a >b){
	    		 if(a >c){
	    			 return a;
	    		 }
	    		 else
	    			 return c;
	    	 }
	    	
	    	 else{
	    		 if(b > c)
	    			 return b;
	    		 else
	    			 return c;
	    	 }
	    	 
	    	 
	    }
	    
	    public static void main(String[] args){
	    	  int[] arr = {1,1,1,1};
	    	  HouseRobber r= new HouseRobber();
	    	  int amount = r.rob(arr);
	    	  System.out.println(amount);//expected amount 103 but getting 102
	    	  
	    	
	    }
}

