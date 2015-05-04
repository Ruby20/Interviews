public class MultiplyArrays {

    public int[] multiply(int input[]){
        int result[] = new int[input.length];
        int left[] = new int[input.length];
        int right[] = new int[input.length];
        left[0] = 1;
        for(int i=1; i < input.length; i++){
            left[i] = left[i-1]*input[i-1];
        }
        
        right[input.length-1] = 1;
        for(int i=input.length-2; i >=0; i--){
            right[i] = right[i+1]*input[i+1];
        }
        
        for(int i=0;i < input.length; i++){
            result[i] = left[i]*right[i];
        }
        return result;
    }

    //o(n^2) solution
    public int MaxDiff(int[] input){
         int max_diff = input[0] - input[1];
         for(int i=0;i<input.length;i++){
            for(int j=i+1;j<input.length;j++){
                   
                  if(max_diff < input[i] - input[j]){
                           max_diff = input[i] - input[j];     
                  }

            }
          }
         return max_diff;
    }
   
    //Better efficient solution?

    public int Maxdiff(int[] input){
           //keep track of the minima so far 
           int minElem = input[0];
           int maxdiff =  input[0] - minElem;
           for(int i=0;i<input.length;i++){
                if(input[i] - minElem > maxdiff)
                     maxdiff = input[i] - minElem;
                if (minElem > input[i])
                     minElem = input[i];               
           }
           return maxdiff;          

    }


   public static void main(String args[]){
        MultiplyArrays maf = new MultiplyArrays();
        int input[] = {2,3,4,5};
        int result[] = maf.multiply(input);
        //for(int r : result){
          //  System.out.print(r + " ");
        //}
        int[] array ={100,180,260,310,40,535,695};
        int[] app ={2,3,10,6,4,8,1};
        int res =  maf.Maxdiff(array);
        System.out.print(res);
    }
}
