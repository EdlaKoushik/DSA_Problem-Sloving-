// "static void main" must be defined in a public class.
Time Complexity of the binary search will be O(log n)
    --> n
        n/2
        n/4
        n/....
         n/2^k=1
         n/2=k
         log n base 2=k
       so Time complexity will be log n--> O(log n)


    //"optimized binary search 
    class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int start=0;int end=arr.length-1;
        int result=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==k){
                result=mid;
                end=mid-1;
                
            }
            else if(arr[mid]<k){
                start =mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return result;
    
        }
        
    }



//General binary search
    
import java.util.*;
public class Main {
    
    public static int binarySearch(int numbers[],int key){
        int start=0,end=numbers.length-1;
        while(start <=end){
            int mid =(start +end)/2;
            //comparisions
            
            if(numbers[mid]==key){
                return mid;
               }
            if(numbers[mid]<key){ //right
                start=mid+1;
              }
            else{
                end =mid-1;
                }
        }
        return -1;
}
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14};
       int key=10;
        System.out.println("index for key is :"+binarySearch(numbers,key));
    }
}
