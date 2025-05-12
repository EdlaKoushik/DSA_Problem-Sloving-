// import java.util.*;
// public class Loops {
//     public static void main(String args[]){
    //while
    //do while
    //for loop
    
    // int counter=1;
    // while (counter <= 1000){
    //   System.out.print(counter+" ");
    //   counter++;
    // }
    // System.out.println();
    // Scanner sc=new Scanner(System.in);
    // System.out.println("enter a number n:");
    // int n=sc.nextInt();
    // int counter=1;
    // while(counter<=n){
    //     System.out.println(counter);
    //     counter++;
    // }
    // System.out.println("enter n :");
    // int n=sc.nextInt();
    // int sum=0,i=1;
    // while(i<=n){
    //     sum+=i;
    //     i++;
    // }
    // System.out.println(sum);
    // for (int i=1;i<=100;i++){
    //     System.out.println("Hello world");
    // }
    // for (int line=1;line<=4;line++){
    //     System.out.println("* * * *");
    // }



    //Printing the last digit
    // for(int n=345;n>0;n=n/10){
    //     int last_digit=n %10;
    //     System.out.print(last_digit);
    // }

    //Reversing the last number
    // int rev=0;
    // for(int number=209;number>0;number=number/10){
        
    //     int last_digit=number%10;
    //     rev=(rev*10)+last_digit;
        
    // }
    // System.out.print(rev);

    //  int n=1;
    //  do{    //first execution then next condition
    //     System.out.println("Hello microsoft");
    //     n++;
    //  }while(n<=10);

  
    //break Statement
    // to ext the loop
 

//     int n=1;
//     do{
//         System.out.println(n);
//         if(n==3){
            
//             break;
//         }
//         n++;
//     }while(n<=5);
//   System.out.println("You jumped out of the loop");

// do{
//     System.out.println("enter n value :");
//    int n=sc.nextInt();
//    System.out.println(n);
//     if(n%10==0){
//         System.out.println(n+"value is multiple of 10");
//         break;
//     }
// }while(true);


// for(int i=1;i<=5;i++){
    
//     if(i==3){
//         continue;
//     }
//     System.out.println(i);
// }


// do{
//     System.out.println("enter n value :");
//    int n=sc.nextInt();
   
//     if(n%10==0){
//         // System.out.println(n+"value is multiple of 10");
//         continue;
//     }
//     System.out.println(n);
// }while(true);

// while(true){
//     System.out.println("enter n");
//     int n=sc.nextInt();
//     if(n%10==0){
//         continue;
//     }
//     System.out.println(n);

// }

// int n=10;
// int count=0;
// for(int i=1;i<=n;i++){
//     if(n%i==0 ){
//         count++;
//     }
// }

// if(count==2){
//     System.out.println("the number is prime");
// }else{
//     System.out.println("the number is not prime");
// }
// import java.util.Scanner;
// public class Loops {
//     public static void main(String args[]){
// Scanner sc=new Scanner(System.in);
// System.out.println("enter the number of integers you want to enter :");
// int n=sc.nextInt();
// int evensum=0;
// int oddsum=0;
// int n1;
// for(int i=0;i<n;i++){
//  System.out.println("enter the "+i+"number:");
//   n1=sc.nextInt();
//   if(n1%2==0){
//    evensum=evensum+n1;
//   }else{
//     oddsum=oddsum+n1;
//         }
//     }

// System.out.println("even sum is :"+evensum);
// System.out.println("odd sum :"+oddsum);
 
// }
//     }
// import java.util.Scanner;
//  public class Loops {
//      public static void main(String args[]){
//  Scanner sc=new Scanner(System.in);
//  System.out.println("enter the number :");
//   int n=sc.nextInt();
//   int fact=1;
// for(int i=1;i<=n;i++){
//   fact=fact*i;
// } 
//      }
//     }
/*
 * multiplication of a number;
 * 2*1=2;
 * 2*2=4;
 * 2*3=6;
 * 2*4=8;
 * 2*5=10;
 * .
 * .
 * 2*10=20;
 */



 
// // import java.util.Scanner;
//  public class Loops{
//     public static void main(String args[]){ 
//     // Scanner sc= new Scanner(System.in);
//     int n=2; 
//     // int n=sc.nextInt(); 
//     for(int i=1;i<=10;i++){
//         System.out.println(n+"*"+i+"="+n*i);
//     }

//     }
//  }

public class Koushik{
    public static void main(String[] args) {
        System.out.println("koushik");
        int n=10;
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}



