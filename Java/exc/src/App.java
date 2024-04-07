import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /**
         * Write a Java program to add two binary numbers.
            Input Data:
            Input first binary number: 10
            Input second binary number: 11
            Expected Output

            Sum of two binary numbers: 101
         */
        long b1, b2;
        int i = 0, transporte = 0;
        int[] soma = new int[20];

        Scanner in = new Scanner(System.in);

        System.out.print("Primeiro número binário: ");
        b1 =  in.nextLong();
        System.out.print("Segundo número binário: ");
        b2 = in.nextLong();

        while(b1 != 0 || b2 != 0)
        {
            soma[i++] = (int)((b1%10 + b2%10 + transporte)%2);
            transporte = (int)((b1%10 + b2%10 + transporte)/2);
            b1 = b1/10;
            b2 = b2/10;
        }
        if(transporte != 0)
        {
            soma[i++] = transporte;
        }
        i--;
        System.out.print("A soma dos binários é: ");
        while(i>=0)
        {
            System.out.print(soma[i--]);
        }
        System.out.println("\n");
    }
}