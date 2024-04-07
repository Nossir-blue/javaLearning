public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Write a Java program to print the area and perimeter of a rectangle.
            Test Data:
            Width = 5.5 Height = 8.5

            Expected Output
            Area is 5.6 * 8.5 = 47.60
            Perimeter is 2 * (5.6 + 8.5) = 28.20
         */
        float width = 5.6f, height = 8.5f;
        float area = width * height;
        float perimeter = 2 * (width+height);
        System.out.println("Area = "+area+"\nPerimeter = "+perimeter);
    }
}
