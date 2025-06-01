package Arrays;
//call by reference
public class PassingArrayasArgument {

    public static void update(int marks[],int number){
         number=10;
        for(int i=0;i<marks.length;i++){
          marks[i]=marks[i]+1;
          System.out.print(marks[i]+" ");
        }
      
    }
     public static void main(String[] args) {
        int marks[]={1,3,5};
        int number=5;
        update(marks,number);
           System.out.println(number);
     }
}
