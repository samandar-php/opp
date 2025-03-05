package task01;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle =new Rectangle(10,20);
        System.out.println("Perimeter: "+rectangle.getPerimeter());
        System.out.print("Yuzi: "+rectangle.getArea());
        System.out.println();
        Rectangle rectangle2 =new Rectangle();
        System.out.println("Perimeter: "+rectangle2.getPerimeter());
        System.out.print("Yuzi: "+rectangle2.getArea());
    }
}
