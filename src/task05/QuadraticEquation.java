package task05;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class QuadraticEquation {
    private final int a;
    private final int b;
    private final int c;

    QuadraticEquation(int a,int b,int c){
        this.a =a;
        this.b = b;
        this.c = c;
    }
    double getDiscriminant(){
        return  pow(b,2) - 4*a*c;
    }

    double getRoot1(){
        return (-b + sqrt(pow(b,2) - 4*a*c))/(2*a);
    }

    double getRoot2(){
        return (-b - sqrt(pow(b,2) - 4*a*c))/(2*a);
    }
}
