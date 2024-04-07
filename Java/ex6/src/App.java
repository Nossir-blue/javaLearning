import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /* Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
            Test Data:
            Input first number: 125
            Input second number: 24
            Expected Output :
            125 + 24 = 149
            125 - 24 = 101
            125 x 24 = 3000
            125 / 24 = 5
            125 mod 24 = 5 
            */
            Scanner t = new Scanner(System.in);
            int a,b,sum,sub,prod;
            float div,modul;

            System.out.print("Input first number: ");
            a = t.nextInt();
            System.out.print("Input second number: ");
            b = t.nextInt();

            sum = a + b;
            sub = a - b;
            prod = a * b;
            div = a / b;
            modul = a%b;
            
            System.out.println("Sum = "+sum+"\nSub = "+sub+"\nProd = "+prod+"\nDiv = "+div+"\nModul = "+modul);
    }
}
