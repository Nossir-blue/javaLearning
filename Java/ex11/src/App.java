public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Write a Java program to print the area and perimeter of a circle.
            Test Data:
            Radius = 7.5
            Expected Output
            Perimeter is = 47.12388980384689
            Area is = 176.71458676442586
         */
        double radius = 7.5f, Perimeter, Area;
        Perimeter = (2*3.14f)*radius;
        Area = 3.14f * (radius*radius);
        System.out.println("Perimeter: "+Perimeter+"\nArea: "+Area);
    }
}
