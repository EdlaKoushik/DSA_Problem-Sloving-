// BasicFundamentals.java: Combined all Java basics, fundamentals, and personal comments/programs
import java.util.*;

public class BasicFundamentals {
    // --- JavaBasics Section ---
    // 1. Hello World Program
    public static void helloWorld() {
        System.out.println("Hello world\nHello world\nHello world");
    }

    // 2. Variable Manipulation
    public static void variableManipulation() {
        int a = 10;
        int b = 5;
        System.out.println(a);
        System.out.println(b);
        String name = "Tony Stark";
        System.out.println(name);
        a = 50;
        a = b; // b value is assigned to a
        System.out.println(a);
    }

    // 3. Data Types
    public static void dataTypes() {
        byte b = 8;
        System.out.println(b);
        char ch = 'a';
        System.out.println(ch);
        boolean var = false;
        System.out.println(var);
        float price = 10.5f;
        System.out.println(price);
        int number = 25;
        System.out.println(number);
        short n = 240;
        System.out.println(n);
    }

    // 4. Sum of Two Numbers
    public static void sumOfTwoNumbers(Scanner sc) {
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum is: " + sum);
    }

    // 5. Area of a Circle
    public static void areaOfCircle(Scanner sc) {
        System.out.println("Enter radius:");
        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;
        System.out.println("Area: " + area);
    }

    // 6. ASCII Value Difference
    public static void asciiValueDifference() {
        char a = 'a';
        char b = 'b';
        System.out.println((int) b); // 98
        System.out.println((int) a); // 97
        System.out.println(b - a);
    }

    // 7. Arithmetic Operations
    public static void arithmeticOperations() {
        int a = 10;
        float b = 20.25f;
        long c = 25;
        double d = 30;
        double ans = a + b + c + d;
        System.out.println(ans);
        byte bi = 5;
        bi = (byte) (bi * 2);
        int dollar = 24;
        System.out.println(dollar);
    }

    // 8. Addition of float and int
    public static void floatIntAddition(Scanner sc) {
        float a = sc.nextFloat();
        int b = sc.nextInt();
        System.out.println(a + b);
    }

    // 9. Operators and Expressions
    public static void operatorsDemo() {
        int a = 20;
        int b = a++;
        System.out.println(b);
        System.out.println(a++);
        System.out.println(++a);
        int c = 20;
        int d = c--;
        int e = --c;
        System.out.println(d);
        System.out.println(e);
        int a$ = 10;
        a$ += 10;
        a$ -= 20;
        a$ *= 30;
        System.out.println(a$);
        int x = 2, y = 5;
        int exp1 = (x * y / x); // 5
        int exp2 = (x * (y / x)); // 4
        System.out.print(exp1 + ",");
        System.out.print(exp2);
    }

    // 10. Relational, Logical, and Assignment Operators
    public static void relationalLogicalAssignmentDemo() {
        int x = 200, y = 50, z = 100;
        if (x > y && y > z) {
            System.out.println("Hello");
        }
        if (z > y && z < x) {
            System.out.println("Java");
        }
        if ((y + 200) < x && (y + 150) < z) {
            System.out.println("Hello Java");
        }
        x = y = z = 2;
        x += y; // 4
        y -= z; // 0
        z /= (x + y); // 0
        System.out.println(x + " " + y + " " + z);
    }

    // 11. Age and Largest Number
    public static void ageAndLargest() {
        int age = 16;
        if (age >= 18) {
            System.out.println("adult: drive, vote");
        } else if (age > 13 && age < 18) {
            System.out.println("teenager");
        } else {
            System.out.println("not adult");
        }
        int a = 1, b = 3;
        if (a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("b is largest");
        }
    }

    // 12. Even or Odd
    public static void evenOrOdd(Scanner sc) {
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println(a + " is even number");
        } else {
            System.out.println(a + " is odd number");
        }
    }

    // 13. Income Tax Calculation
    public static void incomeTaxCalculation(Scanner sc) {
        System.out.println("Enter the income:");
        int income = sc.nextInt();
        int tax;
        if (income < 500000) {
            tax = 0;
        } else if (income < 1000000) {
            tax = (int) (income * 0.2);
        } else {
            tax = (int) (income * 0.3);
        }
        System.out.println("Your tax is " + tax);
    }

    // 14. Largest of Three Numbers
    public static void largestOfThree() {
        int a = 1, b = 3, c = 6;
        if ((a >= b) && (a >= c)) {
            System.out.println("a");
        } else if (b >= c) {
            System.out.println("b is greater");
        } else {
            System.out.println("c is greater");
        }
    }

    // 15. Ternary Operator
    public static void ternaryOperatorDemo() {
        int larger = (5 > 3) ? 5 : 3;
        int marks = 400;
        String result = (marks > 500) ? "pass" : "fail";
        System.out.println(result);
    }

    // 16. Switch Case Example
    public static void switchCaseExample() {
        int number = 12;
        switch (number) {
            case 1:
                System.out.println("samosa");
                break;
            case 2:
                System.out.println("burger");
                break;
            case 3:
                System.out.println("mango shake");
                break;
            case 4:
                System.out.println("we wake up");
                break;
            default:
                System.out.println("dont sleep");
        }
    }

    // 17. Simple Calculator using Switch
    public static void simpleCalculator(Scanner sc) {
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        System.out.println("Enter operator:");
        char operator = sc.next().charAt(0);
        System.out.println("Your result is:");
        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("wrong operator");
        }
    }

    // 18. Fever Check
    public static void feverCheck() {
        double temp = 103.5;
        if (temp > 100) {
            System.out.println("You are suffering from fever please consult your doctor");
        } else {
            System.out.println("stay healthy");
        }
    }

    // 19. Leap Year Check
    public static void leapYearCheck(Scanner sc) {
        System.out.println("Enter a year:");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("year is leap year");
        } else {
            System.out.println("year is not a leap year");
        }
    }

    // --- Fundamentals Section ---
    // Print numbers from 1 to 1000 using while loop
    public static void print1To1000() {
        int counter = 1;
        while (counter <= 1000) {
            System.out.println(counter);
            counter++;
        }
    }

    // Print numbers from 1 to n (user input)
    public static void print1ToN(Scanner sc) {
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int counter = 1;
        while (counter <= n) {
            System.out.println(counter);
            counter++;
        }
    }

    // Sum of first n natural numbers
    public static void sumOfN(Scanner sc) {
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum is: " + sum);
    }

    // Print "Hello World" 100 times
    public static void printHelloWorld100() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + " Hello world");
        }
    }

    // Print a rectangle using asterisks (*)
    public static void printRectangle() {
        for (int line = 1; line <= 4; line++) {
            System.out.println("* * * *");
        }
    }

    // Print the last digit of a number
    public static void printLastDigit() {
        int n = 345;
        while (n > 0) {
            int lastDigit = n % 10;
            System.out.println(lastDigit);
            n = n / 10;
        }
    }

    // Reverse a number
    public static void reverseNumber() {
        int number = 209;
        int rev = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            rev = (rev * 10) + lastDigit;
            number = number / 10;
        }
        System.out.println("Reversed Number: " + rev);
    }

    // Factorial of a number
    public static void factorial() {
        int n = 10;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial: " + fact);
    }

    // Multiplication table for 2
    public static void multiplicationTable() {
        int n = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + "=" + n * i);
        }
    }

    // Prime number check
    public static void primeCheck() {
        int n = 10;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }

    // Print numbers from a given number up to 5 (while loop demo)
    public static void printUpTo5(Scanner sc) {
        System.out.println("Enter the starting number:");
        int count = sc.nextInt();
        while (count <= 5) {
            System.out.println(count);
            count++;
        }
    }

    // --- Koushik Section (personal comments and extra logic) ---
    // Loops, break/continue, patterns, etc. (from Koushik.java)
    // All your commented code and logic is preserved below as reference and for further extension.

    /*
    // while loop example
    // int counter=1;
    // while (counter <= 1000){
    //   System.out.print(counter+" ");
    //   counter++;
    // }
    // Print numbers from 1 to n (user input)
    // Scanner sc=new Scanner(System.in);
    // System.out.println("enter a number n:");
    // int n=sc.nextInt();
    // int counter=1;
    // while(counter<=n){
    //     System.out.println(counter);
    //     counter++;
    // }
    // Sum of first n natural numbers (while loop)
    // System.out.println("enter n :");
    // int n=sc.nextInt();
    // int sum=0,i=1;
    // while(i<=n){
    //     sum+=i;
    //     i++;
    // }
    // System.out.println(sum);
    // Print "Hello world" 100 times (for loop)
    // for (int i=1;i<=100;i++){
    //     System.out.println("Hello world");
    // }
    // Print a rectangle using asterisks (*), 4 lines
    // for (int line=1;line<=4;line++){
    //     System.out.println("* * * *");
    // }
    // Printing the last digit of a number
    // for(int n=345;n>0;n=n/10){
    //     int last_digit=n %10;
    //     System.out.print(last_digit);
    // }
    // Reversing a number
    // int rev=0;
    // for(int number=209;number>0;number=number/10){
    //     int last_digit=number%10;
    //     rev=(rev*10)+last_digit;
    // }
    // System.out.print(rev);
    // do-while loop example
    // int n=1;
    // do{    //first execution then next condition
    //     System.out.println("Hello microsoft");
    //     n++;
    // }while(n<=10);
    // break Statement example
    // int n=1;
    // do{
    //     System.out.println(n);
    //     if(n==3){
    //         break;
    //     }
    //     n++;
    // }while(n<=5);
    // System.out.println("You jumped out of the loop");
    // break on multiple of 10
    // do{
    //     System.out.println("enter n value :");
    //     int n=sc.nextInt();
    //     System.out.println(n);
    //     if(n%10==0){
    //         System.out.println(n+"value is multiple of 10");
    //         break;
    //     }
    // }while(true);
    // continue statement in for loop
    // for(int i=1;i<=5;i++){
    //     if(i==3){
    //         continue;
    //     }
    //     System.out.println(i);
    // }
    // continue on multiple of 10
    // do{
    //     System.out.println("enter n value :");
    //     int n=sc.nextInt();
    //     if(n%10==0){
    //         // System.out.println(n+"value is multiple of 10");
    //         continue;
    //     }
    //     System.out.println(n);
    // }while(true);
    // while(true) with continue
    // while(true){
    //     System.out.println("enter n");
    //     int n=sc.nextInt();
    //     if(n%10==0){
    //         continue;
    //     }
    //     System.out.println(n);
    // }
    // Prime number check (count divisors)
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
    // Even/Odd sum for n numbers
    // Scanner sc=new Scanner(System.in);
    // System.out.println("enter the number of integers you want to enter :");
    // int n=sc.nextInt();
    // int evensum=0;
    // int oddsum=0;
    // int n1;
    // for(int i=0;i<n;i++){
    //     System.out.println("enter the "+i+"number:");
    //     n1=sc.nextInt();
    //     if(n1%2==0){
    //         evensum=evensum+n1;
    //     }else{
    //         oddsum=oddsum+n1;
    //     }
    // }
    // System.out.println("even sum is :"+evensum);
    // System.out.println("odd sum :"+oddsum);
    // Factorial of a number (user input)
    // Scanner sc=new Scanner(System.in);
    // System.out.println("enter the number :");
    // int n=sc.nextInt();
    // int fact=1;
    // for(int i=1;i<=n;i++){
    //     fact=fact*i;
    // }
    // Multiplication table for 2
    // int n=2;
    // for(int i=1;i<=10;i++){
    //     System.out.println(n+"*"+i+"="+n*i);
    // }
    */

    // Example method from Koushik.java
    public static void koushikExample() {
        System.out.println("koushik");
        int n = 10;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        helloWorld();
        variableManipulation();
        dataTypes();
        sumOfTwoNumbers(sc);
        areaOfCircle(sc);
        asciiValueDifference();
        arithmeticOperations();
        floatIntAddition(sc);
        operatorsDemo();
        relationalLogicalAssignmentDemo();
        ageAndLargest();
        evenOrOdd(sc);
        incomeTaxCalculation(sc);
        largestOfThree();
        ternaryOperatorDemo();
        switchCaseExample();
        simpleCalculator(sc);
        feverCheck();
        leapYearCheck(sc);
        print1To1000();
        print1ToN(sc);
        sumOfN(sc);
        printHelloWorld100();
        printRectangle();
        printLastDigit();
        reverseNumber();
        factorial();
        multiplicationTable();
        primeCheck();
        printUpTo5(sc);
        koushikExample(); // Example from Koushik.java
        // You can add more calls or logic as needed
        sc.close();
    }
}
// --- End of BasicFundamentals.java ---

