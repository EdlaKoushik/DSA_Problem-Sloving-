package Patterns;
public class Patterns_11 {
   //star patterns using nested loops
    public static void main(String[] args) {
      for(int i=1;i<=4;i++){ //i-->Line
         for(int j=1;j<=i;j++){ //j-->star
            System.out.print("*");
         }
         System.out.println();
      }
    }

}
