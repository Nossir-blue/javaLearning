import java.util.Scanner;

public class App {
    static void soma(int a, int b)
    {
        int s = a + b;
        System.out.println("A soma é "+s);
    }
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Start");
        soma(2,3);
    }
}
