public class App {
    public static void main(String[] args) throws Exception {
        /*Write a Java program to swap two variables. */
        int a, b, swap;
        a=1;
        b=2;
        swap=0;
        System.out.println("A = "+a+"\nB = "+b);
        swap = a;
        a = b;
        b = swap;
        System.out.println("A = "+a+"\nB = "+b);
    }
}
