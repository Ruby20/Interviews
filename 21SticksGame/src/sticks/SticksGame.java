package sticks;

import java.util.Scanner;

public class SticksGame {
         
	   public static void main(String[] args){
		        int numSticks = 21; //to begin with in the game
		        
		        System.out.println("there are "+ numSticks+" to begin with in this game");
		        System.out.println("Do you want to go first?");
		        //String goFirst = new Scanner(System.in).toString();
		       
		        Scanner take = new Scanner(System.in);//number of sticks player has chosen
		        String goFirst = new Scanner(System.in).nextLine(); 
		        int take_num =0;
		        
		        while(numSticks > 0){
		        	 
		        	
		        	
		        	if(goFirst.equalsIgnoreCase("y")){
		        		System.out.println("there are "+ numSticks+" sticks left in this game");
			        	System.out.println("How many sticks would like to pick?");
			        	 
			        	take_num = take.nextInt();
		        		if(take_num <1)
			        		 take_num = 1;
			        	if(take_num > 2)
			        		 take_num = 2;
		        		numSticks = numSticks - take_num;
		        		   
		        		if(numSticks <= 0){
		        			 System.out.println("you lose!");
		        		}
		        		
		        		else{
		        			 if((numSticks - 2)%3 == 0 || (numSticks-2) == 0){
		        				  take_num = 1;
		        		 		  
		        			 }else{
		        				  take_num = 2;
		        			 }
		        			 System.out.println("computer takes "+ take_num +"sticks" );
		        			 numSticks = numSticks - take_num;
		        			 
		        			 if(numSticks <= 0){
		        			 System.out.println("you win!");
		        		     }
		        			 
		        			
		        		}
		        		   
		        		   
		        		 
		        	}else{
		        		if((numSticks - 2)%3 == 0 || (numSticks-2) == 0){
	        				  take_num = 1;
	        		 		  
	        			 }else{
	        				  take_num = 2;
	        			 } 
		        		System.out.println("computer takes "+ take_num +"sticks" );
	        			numSticks = numSticks - take_num;
		        		
	        			if(numSticks <=0){
	        				System.out.println("you win!");
	        			}else{
	        				System.out.println("there are "+ numSticks+" left in this game");
				        	System.out.println("How many sticks would like to pick?");
				        	 
				        	take_num = take.nextInt();
	        				if(take_num <1)
				        		 take_num = 1;
				        	if(take_num > 2)
				        		 take_num = 2;
			        		numSticks = numSticks - take_num;
			        		if(numSticks <= 0){
			        			 System.out.println("you lose!");
			        		}
			        		
	        			    	
	        				
	        				
	        			}
		        		
		        		
		        	}
		        	
		        	  
		        	
		        	
		        }
		        
		        
		        
		   
		        take.close();
		  
		   
	   }
}
