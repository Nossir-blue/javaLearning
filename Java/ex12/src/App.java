import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
         */
        int a,b,c;
        float average;
        Scanner input = new Scanner(System.in);
        System.out.print("Input 3 number to calculate the average of the numbers\nInput 1: ");
        a = input.nextInt();
        System.out.print("Input 2: ");
        b = input.nextInt();
        System.out.print("Input 3: ");
        c = input.nextInt();

        average = (a + b + c) / 3;
        System.out.println("The average of the numbers is: "+average);
    }
}
