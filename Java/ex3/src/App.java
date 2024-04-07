import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    {
        /*Write a Java program that takes two numbers as input and displays the product of two numbers.
            Test Data:
            Input first number: 25
            Input second number: 5
            Expected Output :
            25 x 5 = 125 
        */
        Scanner t = new Scanner(System.in);
        int a,b,produto;
        System.out.print("Input first number: ");
        a =  t.nextInt();
        System.out.print("Input second number: ");
        b = t.nextInt();
        produto = a * b;
        System.out.println("Expected Output: "+a+" x "+b+" = "+produto);
    }
}
