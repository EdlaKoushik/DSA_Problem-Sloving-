
//linear search is used to find an element in the array
package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int key=50;
        int array[]={10,20,30,40,50};
        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                System.out.print("element found at"+i+"index");
            }
        }
    }
}
//linear search numbers
import java.util.*;
public class ArraysCC{
    public static int linearSearch(int numbers[],int key){
    for(int i=0;i<numbers.length;i++){
   if(numbers[i]==key){
   return i;
   }
  }
        return -1;
    }
    public static void main(String args[]){
int numbers[]={2,3,4,6,7,89};
        int key=10;
        int index=linearSearch(numbers,key);
        if(index==-1){
        System.out.println("key not found");
        }
        else{
            System.out.println("Key found at index ",index);
        }
    }
}


//string linear search
import java.util.*;
public class StringLinearSearch{
    public static int linearSearch(String menu[],String key){
    for(int i=0;i<menu.length;i++){
   if(menu[i]==key){
   return i;
   }
  }
        return -1;
    }
    public static void main(String args[]){
String menu[]={"dosa","puri","chapathi","vada","cholebature"};
        String key="puri";
        int index=linearSearch(menu,key);
        if(index==-1){
        System.out.println("key not found");
        }
        else{
            System.out.println("Key found at index "+index);
        }
    }
}
