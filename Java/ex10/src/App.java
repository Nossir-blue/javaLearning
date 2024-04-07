public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Write a Java program to compute a specified formula.
            Specified Formula :
            4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
            Expected Output
            2.9760461760461765
         */
        float a = 4.0f, b = 1.0f, result;
        int c = 1, d = 3, e = 7, f = 9, g = 11, h = 5;
        result = a * ((c-(b/d)) + (b/h) - (b/e) + (b/f) - (b/g));
        System.out.println("Expected Output: "+result);
    }
}
