import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class App  {
    public static void main(String[] args) throws Exception 
    {
        /*Write a Java program to print the results of the following operations.
        Test Data:
        a. -5 + 8 * 6
        b. (55+9) % 9
        c. 20 + -3*5 / 8
        d. 5 + 15 / 3 * 2 - 8 % 3
        Expected Output :
        43
        1
        19
        13*/
        int a = -5, b = 8, c = 6, d = 55, e = 9, f = 20, g = -3, h = 5, i = 15, j = 3, k = 2;
        int aA = a + (b*c);
        float bB = (d+e) % e;
        float cC = f + ((g*h)/b);
        float dD = h + i / (j*k) - (b%g);

        System.out.println("a. "+aA+"\nb. "+bB+"\nc. "+cC+"\nd. "+dD);

    }
    
}
