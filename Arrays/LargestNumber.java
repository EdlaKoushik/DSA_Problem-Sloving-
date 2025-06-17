//find the Largest number in a given array 
import java.util.*;
public class LargestNumber{
  public static int  largestNum(int nums[]){
    int largest=Integer.MIN_VALUE;
    int smallest=Integer.MAX_VALUE;
     for(int i=0 ;i<=nums.length;i++){
     if(largest<nums[i]){
      largest=nums[i];  
     }
       if(smallest>nums[i]){
        smallest=nums[i];
  }
       System.out.println("smallest value"+smallest);
    return largest;
    
public static void main (String args[]){
   int nums[]={1,23,43,54,56};
 System.out.println(largestNum(nums));
}
  }
