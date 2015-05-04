import java.util.Arrays;
class subset{

  public static boolean subSetSum(int[] arr,int n, int kSum){
            
                 //base case for the current recursive solution
                 if(kSum == 0 || n == kSum){
                      return true;
                  }      
               
                 if(n == 0 && kSum!=0){
                      return false;
                 }
                 //if last element is greater then sum
                 if( arr[n-1]> kSum){
                      return subSetSum(arr,n-1,kSum);
                 }
                 
                 //selection of k elements from n problem
                 return subSetSum(arr,n-1,kSum-arr[n-1]) || subSetSum(arr,n-1,kSum);

 } 
 
public static boolean isSubsetSum(int set[], int n, int sum)
{
    // The value of subset[i][j] will be true if there is a subset of set[0..j-1]
    //  with sum equal to i
    boolean[][] subset = new boolean[sum+1][n+1];
 
    // If sum is 0, then answer is true
    for (int i = 0; i <= n; i++)
      subset[0][i] = true;
 
    // If sum is not 0 and set is empty, then answer is false
    for (int i = 1; i <= sum; i++)
      subset[i][0] = false;
 
     // Fill the subset table in botton up manner
     for (int i = 1; i <= sum; i++)
     {
       for (int j = 1; j <= n; j++)
       {
         subset[i][j] = subset[i][j-1];
         if (i >= set[j-1])
           subset[i][j] = subset[i][j] || subset[i - set[j-1]][j-1];
       }
     }
 
    /** // uncomment this code to print table
     for (int i = 0; i <= sum; i++)
     {
       for (int j = 0; j <= n; j++)
          System.out.println("[i][j] "+ i + " " + j + "  "+ subset[i][j]);
       System.out.println("\n");
     } **/
 
     return subset[sum][n];
}

  /**
   Move all zeros to the end of the array
   
**/
   public static void MoveZeros(int[] arr){
            
         int fast = 0,slow = 0;
         while(fast< arr.length){
                if(arr[fast] == 0){
                      fast++;
                      continue;//ignore the zeros
                }
                arr[slow] = arr[fast]; //if non zero then copy to the rest of the elements
                slow++;
                fast++;
        }
                //after copying the non zero elements to the array, now append zeros
       while(slow<arr.length){
               arr[slow++] = 0;
       }

 }

 public static boolean isConsecutive(int[] arr){
        //incorrect implementation
        boolean flag = false;
      /**  for(int i=1;i<arr.length;i++){
                if(arr[i-1]+1 == arr[i])
                    flag = true;
                    
                else
                    flag = false;
        }
       return flag;
       **/
       Arrays.sort(arr);
       for(int i=1;i<arr.length;i++){
                  if(diff(arr[i-1],arr[i])== 1)
                        flag = true;
                  else
                        flag = false;   
       }  
      
       return flag;

 } 

  static int diff(int a ,int b){
      return Math.abs(a-b);
  }

  









 public static void main(String[] args){
                int[] array = {3, 34, 4, 12, 5, 2};
                int[] new_Arr = {0,0,1,0,2,0,5,6,7,0};
                int[] app =   {34, 23, 52, 12, 3 };
                int Sum = 9;
                int n = array.length;
                boolean ans = subSetSum(array,n,Sum);
                boolean table = isSubsetSum(array,  n, Sum);
               // System.out.println(ans);
              //  System.out.println(table);  
                MoveZeros(new_Arr);
                for(int i=0;i<new_Arr.length;i++)
                   System.out.println(new_Arr[i]);
                boolean Consec = isConsecutive(app);
                System.out.println(Consec);
 }






}
