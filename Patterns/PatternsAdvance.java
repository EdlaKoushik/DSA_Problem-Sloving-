package Patterns;

public class PatternsAdvance {
    // Hollow rectangle
    // public static void hollow_rectangle(int totRows, int totCols) {
    //     for (int i = 1; i <= totRows; i++) {
    //         for (int j = 1; j <= totCols; j++) {
    //             if (i == 1 || i == totRows || j == 1 || j == totCols) {
    //                 System.out.print("*");
    //             } else {
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println("");
    //     }
    // }

    // Inverted & rotated half pyramid
    // public static void printstar(int rows) {
    //     for (int i = 1; i <= rows; i++) { // fixed: initialize i=1
    //         for (int j = 1; j <= rows - i; j++) {
    //             System.out.print(" "); // fixed: print space for rotation
    //         }
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
       
    // public static void Invertpyramind(int n){
    //     for(int i=5;i>=1;i--){
    //         for(int j=1;j<=i;j++){
    //               System.out.print(j+"");
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void floydtriangle(int n){
    //     int count=1;
    //   for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(count+' ');
    //         count++;
    //     }
    
    //     System.out.println();
    //   }
    // }

    // public static void  zeroOne(int n){
    //        for(int i=1;i<=n;i++){
    //         for(int j=1;j<=i;j++){
    //             int sum=i+j;
    //             if(sum%2==0){
    //                 System.out.print("1"+" ");
    //             }else{
    //                 System.out.print("0"+" ");
    //             }
            
    //         }
    //         System.out.println();
    //        }
    //     }
        //  public static void butterfly(int n){
        //     for(int i=1;i<=n;i++){
        //         for(int j=1;j<=i;j++){
        //             System.out.print("*");
        //         }
        //         for(int j=1;j<=(2*(n-i));j++){
        //             System.out.print(" ");
        //         }
        //         for(int j=1;j<=i;j++){
        //             System.out.print("*");
        //         }
        //         System.out.println();
        //     }
        //     for(int i=n;i>=1;i--){
        //         for(int j=1;j<=i;j++){
        //             System.out.print("*");
        //         }
        //         for(int j=1;j<=(2*(n-i));j++){
        //             System.out.print(" ");
        //         }
        //         for(int j=1;j<=i;j++){
        //             System.out.print("*");
        //         }
        //         System.out.println();
        //     }

        //  }
        // public static void SolidRhombus(int n){
        //     for(int i=1;i<=n;i++){
        //        for(int j=1;j<=(n-i);j++){
        //         System.out.print(" ");
        //        }
        //        for(int j=1;j<=n;j++){
        //         System.out.print("*");
        //        }
        //        System.out.println();
        //     }
        // }
        // public static void HollowRhombus(int n){
        //     for(int i=1;i<=n;i++){
        //         for(int j=1;j<=(n-i);j++){
        //             System.out.print(" ");
        //         }
        //         for(int j=1;j<=n;j++){
        //             if(i==1 || i==n || j==1 || j==n){
        //             System.out.print( "*");
        //             }
        //             else{
        //                 System.out.print(" ");
        //             }
        //         }
        //         System.out.println();

        //          }
        //     }
        public static void Diamond(int n){
           for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=i-1;j++){
                System.out.print("*");
            }
            System.out.println();
           }
             for(int i=n;i>=1;i--){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=i-1;j++){
                System.out.print("*");
            }
            System.out.println();
           }
        }
        
                 public static void main(String[] args) {
        // hollow_rectangle(4, 5);
        // printstar(4);
        int n=4;
        // Invertpyramind( 5);
        // floydtriangle(n);
        // zeroOne(n);
        // butterfly(n);
        // SolidRhombus(n);
        // HollowRhombus(n);
        Diamond(n);
    }
}