package linkedlist;

//This is a basic binary tree implementation and some other solutions from Stanford Library

public class BinarysearchTree {
          
	      private Node root;//When there are no nodes
	      
	      //Nested class to store the node with two pointers
	      private static class Node{
	    	   Node left;
	    	   Node right;
	    	   int data;
	    	   //constructor in the  node
	    	   Node(int newdata){
	    		   left =  null;
	    		   right = null;
	    		   data =  newdata;
	    	   }
	      }
	      
	      //Create an empty binary tree
	      public void BinaryTree(){
	    	    root = null;
	      }
	      
	      // recursive helper function for lookup
	      public boolean lookup(int data){
	    	  return lookup(data,root) ;
	    	     
	      }
	      
	      //recursive lookup when a pointer is given
	      public boolean lookup(int data, Node node){
	    	  if(node == null){
	    		  return (false);
	    	  }
	    	  
	    	  if(data == node.data) return (true);
	    	  
	    	  if(data < node.data){
	    		  return lookup(data,node.left);
	    	  }
	    	  else{
	    		  return lookup(data,node.right);
	    	  }
	    	  
	    	  
	      }
	      
	      
	      //1.Insert node
	      public void insert(int data){
	    	  root = insert(root,data);
	    	  //return root;
	      }
	      
	      public Node insert(Node node, int data){
	    	   if(node == null) return null;
	    	   
	    	   if(data == node.data)
	    		   return node;
	    	   if (data < node.data){
	    		   return insert(node.left,data);
	    	   }
	    	   
	    	   else{
	    		   return insert(node.right,data);
	    	   }
	    	   
	    	
	      }
	      
	      public static void main(String[] args){
	    	    Node n = new Node(2);
	    	    n.left = new Node(1);
	    	    n.right =  new Node(3);
	    	    
	    	    
                System.out.println("Hi BT is ");
	    	     
	      }
	      
	      //build 123 BT using 3 pointers
	      public void build123(){
	    	  
	    	  root =  new Node(2);
	    	  root.left = insert(root,1);
	    	  root.right = insert(root,3);
	    	  
	    	  
	      }
	      
	      //Function to find the size of a BT
	      public int size(){
	    	   return size(root);
	    	  
	      }
	      public int size(Node n){
	    	   if(n ==  null) return 0;
	    	   else{
	    		   return size(n.left)+ 1+ size(n.right);
	    	   }
	      }
	      
	      //find the max depth of the BT
	      public int maxDepth(){
	    	  return maxDepth(root);
	      }
	      
	      public int maxDepth(Node root){
	    	  if ( root == null) return 0;
	    	  
	    	  int lDepth = maxDepth(root.left);
	    	  int rDepth =  maxDepth(root.right);
	    	  
	    	  return Math.max(lDepth,rDepth)+1;
	    	  
	      }
	      /** 
	      Returns the min value in a non-empty binary search tree. 
	      Uses a helper method that iterates to the left to find 
	      the min value. 
	     */ 
	      public int minValue(){
	    	  return minValue(root);
	      }
	      //since its a BST then all the min values are towards the left subtree
	      public int minValue(Node n){
              if ( root == null) return 0;
	    	  Node min = n;
	    	  while(min.left!= null){
	    		  min =  min.left;
	    	  }
	    	  return min.data;
	      }
	      
	      /** 
	      Prints the node values in the "inorder" order. 
	      Uses a recursive helper to do the traversal. 
	     */ 
	      public void inOrder(){
	    	  inOrder(root);
	    	  System.out.println();
	      }
	      
	      public void inOrder(Node n){
	    	  //LVR 
	    	  //visit the left node
	    	  if(n == null) return;
	    	  inOrder(n.left);
	    	  //print the node data
	    	  System.out.println("node data"+n.data);
	    	  //visit the right node
	          inOrder(n.right);
	    	  
	      }
	      
	      /** 
	      Prints the node values in the "postorder" order. 
	      Uses a recursive helper to do the traversal. 
	     */ 
	      
	      public void postOrder(){
	    	  postOrder(root);
	    	  System.out.println();
	      }
	      
	      public void postOrder(Node n){
	    	  //LRV
	    	  postOrder(n.left);
	    	  postOrder(n.right);
	    	  System.out.println(n.data+" ");
	    	  
	    	  
	      }
	      
	      /** 
	      Given a tree and a sum, returns true if there is a path from the root 
	      down to a leaf, such that adding up all the values along the path 
	      equals the given sum.
	      
	      Strategy: subtract the node value from the sum when recurring down, 
	      and check to see if the sum is 0 when you run out of tree. 
	     */ 
	      public boolean hasPath(int sum){
	    	   return hasPath(root,sum);
	    	   
	      }
	      
	      public boolean hasPath(Node n,int sum){
	    	  
	    	  if(n ==  null){
	    		  return sum == 0;
	    	  }
	    	  return hasPath(n.left,sum - n.data) || hasPath(n.right,sum - n.data);
	    	  
	    	  
	      }
	      
	      /** 
	      Given a binary tree, prints out all of its root-to-leaf 
	      paths, one per line. Uses a recursive helper to do the work. 
	     */ 
	     public void printsolution(){
	    	 printSolution(root);
	    	 System.out.println();
	     }
	      
	      void printSolution(Node n){
	    	  if(n == null) return;
	    	  
	    	  if (hasPath(n.left)){
	    		  
	    	  }
	    	  
	      }
	      
	      //mirror image of a TREE 
	      public void mirrorBt(){
	    	  mirrorBt(root);
	      }
	      
	      
	      public void mirrorBt(Node n){
	    	  if(n == null) return;
	    	 //Do the subtrees
	    	  
	    	  mirrorBt(n.left);
	    	  mirrorBt(n.right);
	    	  
	    	  //Swap the left and right pointers of the node
	    	  Node temp = n.left;
	    	  n.left = n.right ;
	    	  n.right = temp;
	    	  
	    	  
	      }
	      
	      
	     /** 
	      Changes the tree by inserting a duplicate node 
	      on each nodes's .left. */
	     public void DoubleTree(Node node){
	    	 if (node == null) return;
	    	/*	 while(current.left!= null){
	    		 current = current.left;
	    	  }
	    	 current.left = current;
	    	  //same thing for right subtree
	    	 //recurse and find the child node for subtree and append the leaf node it
	    	 Right thinking but you have insert the duplicate node to the left of both subtrees
	    	 **/
	    	 //do the subtrees
	    	 DoubleTree(node.left);
	    	 DoubleTree(node.right);
	    	 
	    	 //insert the duplicate node on the left of both subtrees
	    	 Node oldLeft = node.left;
	    	 node.left = new Node(node.data);
	    	 node.left.left = oldLeft;
	      }
	      
	     /* 
	     Compares the receiver to another tree to 
	     see if they are structurally identical. 
	    */ 
	     
	     public boolean sameTree(Node a,Node b){
	    	 if(a == null || b == null) return false;
	    	 
	    	 else if(a!=null ||b != null)
	    			return a.data == b.data && sameTree(a.left,b.left) && sameTree(a.right,b.right);
			 else
				    return (false);		    
	    
	     }
	     
	     /** 
	     For the key values 1...numKeys, how many structurally unique 
	     binary search trees are possible that store those keys?
	     **/
	     
	     int countTrees(int numKeys){
	    	 //consider root as each of the numkeys
	    	 if(numKeys <= 1)
	    		 return 1;
	    	 else {
	    		 int right,root,left;
	    		 int sum = 0;
	    		 for(root = 1;root<= numKeys; root++){
	    			 left = countTrees(root-1);
	    			 right = countTrees(numKeys - root);

	    			 sum += left*right;
	    		 }

	    		 return sum;
	    	 }
	     }
	     
	     /** 
	     Tests if a tree meets the conditions to be a 
	     binary search tree (BST). 
	    */ 
	     
	     int maxValue(Node node){
	    	  if(node == null){
	    		  return 0;
	    	  }
	    	 
	    	  Node current = node;
	    	  
	    	  while(current.right!= null){
	    		  current = current.right;
	    	  }
	    	  return current.data;
	     }
	     
	     public boolean isBST(Node n){
	    	  if(n == null) return false;
	    	  else{
	    		  //using maxvalue method not very efficient
	    		  if(n.left!= null &&  maxValue(n.left)   > n.data ) return false;
	    		  if (n.right!= null && maxValue(n.right) < n.data) return false;
	    		  
	    	  }
	    	  
	    	  return isBST(n.left) && isBST(n.right);
	    	 
	     }
	     
	     //Efficient BST using effcient helper function given min and max which is O(n)
	     public boolean isBST2(){
	    	 return isBST2(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	     }
	     
	     public boolean isBST2(Node n, int min, int max){
	    	 if(n == null) return false;
	    	 else{
	    		 boolean leftBST = isBST2(n.left,min,n.data);
	    	     
	    		 //if left BST is not ok
	    		 if(!leftBST) return false; 
	    		 
	    		 boolean rightBST = isBST2(n.right,n.data,max);
	    		 return rightBST;
	    	 }
	    	  
	    	 
	    	 
	    	 
	    	 
	     }
}     
	     public class Solution {
	    	    public int maxPathSum(TreeNode root) {
	    	           if( root == null) return 0;
	    	           if(root.left == null && root.right == null)
	    	             return root.val;
	    	          
	    	           
	    	          
	    	           
	    	    }
	    	} 
	     
	     
	     
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
      

