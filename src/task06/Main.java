package task06;

public class Main {
    public static void main(String[] args) {
        LinearEquation linearEquation = new LinearEquation(2, 3, 4, 5, 6, 7);
        if (linearEquation.isSolvable()){
            System.out.println("X: "+linearEquation.getX());
            System.out.println("Y: "+linearEquation.getY());
        }else{
            System.out.println("Error");
        }
    }
}
