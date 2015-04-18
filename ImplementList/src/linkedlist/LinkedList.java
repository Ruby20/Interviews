package linkedlist;
//Datastructure 1 LinkedList Implementation
class LlImplement{
      
	   private Node head;
	   private int listCount; 
	   
	   //Constructor to initialize the param
	   //Empty List
	   public LlImplement(){
		      head = new Node(null);
	          //n.data = null;
	          listCount = 0;
	   }
	   
	  //add a specified node to the end of the list
	  public void add(Object dataVal){
		      
		      if(head == null) return;
		      
		      Node temp =  new Node(dataVal);
		      Node current = head;
		      //traverse the list and add the incoming object to the front
		      while(current.getNext()!=null){
		    	  current = current.getNext();
		      }
		      
		      current.setNext(temp);
		      listCount++;
	  }
	
	  public void add(Object data,int index){
		      //add the node at the specified index
		      
		      Node temp =  new Node(data);
		      Node current =  head;
		      
		      for(int i =1;i<index && current.getNext()!=null ;i++ ){
		    	        current =  current.getNext();
		    	          	    
		      }
		      
        	  temp.setNext(current.getNext());
        	  current.setNext(temp);
        	  listCount++;
	  }
	  
	  //Return the element at a specified position in a list
	  public Object get(int index){
		     
		     
		     if(index <= 0) return 0;
		     Node current = head;
		     
		     for (int i =1;i<index;i++){
		    	    if(current == null) return null;
		    	    current = current.getNext();
		     }
		     
		     
		     return current.getData();
		  
	  }
	  
	  
	  
	  //remove an element at a given position
	  public boolean remove(int index){
		      Node current = head;
		      for (int i =1;i<index;i++){
		    	  current = current.getNext();
		     }
		     current.setNext(current.getNext().getNext()); 
		     listCount--;
		     return true;
	  }
	  
	  
	  public int size(){
		     return listCount;
		  
	  }
	  
	  public String toString(){
		     Node current = head.getNext();
		     String output="";
		     while(current.getNext()!= null){
		    	   output = "[" + current.getData().toString() + "]";
		    	   current = current.getNext();
		     }
		   
		  
		     return output;
	  }
}






class Node{
	   Object data;//data
	   Node next;//link
	   
	   //two constructors
	   public Node(Object dataval){
		   data = dataval  ;
		   next = null;
	   }
	   
	   
	   public Node(Object dataval, Node n){
		   data = dataval;
		   next = n;
	   }
	   
	   Object getData(){
		   return data;
	   }
	   
	   public void setData(Object dataval){
		   data =  dataval;
	   }
	   
	   public Node getNext(){
		   return next;
	   }
	   
	   public void setNext(Node n){
		      next = n;
	   }
	   
}


public class LinkedList {
           
	      
	       public static void main(String[] args){
	    	   LlImplement lList =  new LlImplement();
	           lList.add("1");
	           lList.add("2");
	           lList.add("3");
	           lList.add("4");
	           lList.add("5");
	    
	           /*
	            * Please note that primitive values can not be added into LinkedList
	            * directly. They must be converted to their corresponding wrapper
	            * class.
	            */
	    
	           System.out.println("lList - print linkedlist: " + lList.toString());
	           System.out.println("lList.size() - print linkedlist size: " + lList.size());
	           System.out.println("lList.get(3) - get 3rd element: " + lList.get(3));
	           System.out.println("lList.remove(2) - remove 2nd element: " + lList.remove(2));
	           System.out.println("lList.get(3) - get 3rd element: " + lList.get(3));
	           System.out.println("lList.size() - print linkedlist size: " + lList.size());
	           System.out.println("lList - print linkedlist: " + lList.toString());
	       
        	      
        	      
        	   
        	   
           }







}





















