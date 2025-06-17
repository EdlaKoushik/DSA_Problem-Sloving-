//Arrays as refernce

import java.util.*;
public class ArraysAsReference{
    public static void update(int marks[],int num){
         num=num+1;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
       
    }
    public static void main(String args[]){
        int marks[]={97,98,99};
        int num=50;
        update(marks,num);
        
        for(int i=0;i<marks.length;i++){
    System.out.println(marks[i]);
    // System.out.println(Arrays.toString(marks));
        }
    }
}
//input and output of arrays
import java.util.*;
public class Practice{
public static void main(String args[]){
int marks[]=new int[50];
System.out.println(marks.length);
Scanner sc=new Scanner(System.in);
  marks[0]=sc.nextInt();
  marks[1]=sc.nextInt();
  marks[2]=sc.nextInt();

System.out.println(marks[0]);
  System.out.println(marks[1]);
  System.out.println(marks[2]);
marks[2]=marks[2]+1;
  System.out.println(marks[2]);

  //percentage
  int percentage=(marks[0]+marks[1]+marks[2])/3;
  System.out.println("percentage="+percentage+"%");
  System.out.println(marks.length);
  sc.close();
}
}

