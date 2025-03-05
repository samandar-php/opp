package task04;

public class RegularPolygon {
    private final int n;
    private final double side;


    public RegularPolygon() {
        this(3, 1, 0, 0);
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
    }
    public double getPerimeter() {
        return n * side;
    }
    public double getArea() {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }

}
