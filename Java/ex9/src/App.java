public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Write a Java program to compute the specified expressions and print the output.
            Test Data:
            ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
            Expected Output
            2.138888888888889
         */
        float a = 25.5f, b = 3.5f, c = 40.5f, d = 4.5f, expectedOutput;
        expectedOutput = ((a*b) - (b*b)) / (c - d);
        System.out.println("Expected output: "+expectedOutput);
    }
}
