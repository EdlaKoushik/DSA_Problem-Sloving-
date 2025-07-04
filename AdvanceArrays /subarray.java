

import java.util.*;
public class subarray{
    public static void PrintSubarray(int nums[]){
        int largest_sub_array_sum=Integer.MIN_VALUE;
       int start=0, end=0;
         for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                System.out.print("[");
                 int current_sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(nums[k]+ " ");
                    current_sum+=nums[k];
                }

                System.out.print("]");
                if(current_sum>largest_sub_array_sum){
                    largest_sub_array_sum=current_sum;
                    start=i;
                    end=j;

                }
            }
            System.out.println();

         }
         System.out.print("largest_sub array sum is :"+largest_sub_array_sum +" for sub array:[");
         for(int k=start;k<=end;k++){
            System.out.print(nums[k]+",");
           
         }
         System.out.print("]");


    }
    public static void main(String args[]){
        int nums[]={2,-1,3,4,5,6};
        PrintSubarray(nums);

    }
    }
