package task05;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(1,-6,9);
        System.out.println("Discriminant: "+quadraticEquation.getDiscriminant());
        System.out.println("Root1: "+quadraticEquation.getRoot1());
        System.out.println("Root2: "+quadraticEquation.getRoot2());

    }
}
