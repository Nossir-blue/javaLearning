import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Write a Java program that takes a number as input and prints its multiplication table up to 10.
            Test Data:
            Input a number: 8
            Expected Output :
            8 x 1 = 8
            8 x 2 = 16
            8 x 3 = 24
            ...
            8 x 10 = 80
         */
        Scanner t = new Scanner(System.in);
        int a, i, prod;
        System.out.print("Input a number: ");
        a = t.nextInt();
        for (i = 1;i<=10; i++) 
        {
            prod = a * i;
            System.out.println(a+" * "+i+" = "+ prod);
        }
    }
}
