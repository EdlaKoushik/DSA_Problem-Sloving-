

public class Prefixsubarray {
             
             
    public static  void Prefixsubarray(int nums[]){
         int largest=Integer.MIN_VALUE;
              int current_sum=0;     
              int start=0;int end=0;
          int prefix[] = new int[nums.length];
          prefix[0]=nums[0];

          //calculate prefix array
            for(int i=1;i<prefix.length;i++){
                prefix[i]= prefix[i-1]+nums[i];
            }



            for(int i=0;i<nums.length;i++){
                start=i;
            for(int j=0;j<nums.length;j++){
                end=j;
              current_sum= start== 0 ?prefix[end]: prefix[end]-prefix[start-1];
                 
                if(largest < current_sum){
                    largest =current_sum;
                }

            }
            System.out.println(current_sum);
            }
       
        System.out.println("largest_sub array sum :"+largest);
  }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6};
        Prefixsubarray(nums);
    }
}
