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
