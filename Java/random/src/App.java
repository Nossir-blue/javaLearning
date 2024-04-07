public class App {
    public static void main(String[] args) throws Exception {
        Circle c1 = new Circle();
        System.out.println("The circle has a radius of "+c1.getRadius()+" and area of "+c1.getArea());

        Circle c2 = new Circle(2.0);
        System.out.println("The circle has a radius of "+c2.getRadius()+" and area of "+c2.getArea());

        Circle c3 = new Circle(3.0, "black");
        System.out.println("The circle has a radius of "+c3.getRadius()+", area of "+c3.getArea()+" with the color "+c3.getColor());
    }
}
