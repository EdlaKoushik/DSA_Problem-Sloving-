package Arrays;

import java.util.*;
public class PairsArray{

  public static void Printsubarray(int nums[]){
         for(int i=0;i<nums.length;i++){
            int curr=nums[i];
            for(int j=i+1;j<nums.length;j++){
                System.out.print("("+curr+","+nums[j]+")");
            }
            System.out.println();
         }
         System.out.println(nums.length*(nums.length-1)/2);
  }

   public static void main(String args[]){
         int nums[]={2,3,4,5,6};
         Printsubarray(nums);
   }
}
