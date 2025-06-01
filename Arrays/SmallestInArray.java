package Arrays;

public class SmallestInArray {
    public static void main(String[] args) {
        int check=10;
        int numbers[]={2,3,4,5};
        for(int i=0;i<numbers.length;i++ ){
        if(check>numbers[i]){
            check=numbers[i];
        }
        }
        System.out.print(check);
    }
}
