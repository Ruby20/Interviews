//write a code to remove duplicates from an unsorted LL
//use a hash table complexity is O(n)

void removeDups(LinkedListNode n){
      Hashtable t = new Hashtable();
      LinkedListNode prev = null;
      while(n! = null){
            if(t.containsKey(n.data))
                 prev.next = n.next; 
            else{
            	t.put(n.data,true);
            	prev = n;
            }
                 
            n = n.next
      }

}



//If a temporary buffer is not allowed ?
//This is an O(n2) problem
void removeDupsRunner(LinkedListNode n){
        LinkedListNode n= null;
        //edge case
        if (n == null ) return;

        LinkedListNode current = n;
       
        while(current != null){
        	LinkedListNode runner =  current;
	        while(runner.next != null){
	              if(runner.data == current.data){
	                   runner = runner.next.next;
	              }
	              else
	              	   runner = runner.next;

	               
	        }
	      
            current = current.next;
        }    

}


//Find kth to last element in a singly linked List
//Iterative solution O(n)time and O(1) space

LinkedListNode findKthNode(LinkedListNode head, int k){
     LinkedListNode p1 = head;
     LinkedListNode p2 = head;

     if(k<=0) return null;

     for(int  i =0; i<k-1;i++){
     	if(p2== null) return null;//edge case
     	p2 = p2.next;
     } 
     
     while( p2!=null){
     	 p1 = p1->next;
     	 p2 = p2->next;
     }
     
     return p1;

}

//Recursive solution but needs O(n) space
public static int recurseKthNode(LinkedListNode head,int k){
      // if (k<=0) return null;
       if (head == null) return 0;
       
       int counter =  recurseKthNode(head.next,k) + 1;
       
       if(k == counter){
          System.out.println(head.data);

       }

       return counter;

}


//Delete a node in the middle of the list given access to only that node
//Not given access 













































