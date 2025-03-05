package task01;

public class Rectangle {
double width;
double height;
public Rectangle(){
    this.height =1;
    this.width =1;
}

public Rectangle(double width,double height){
    this.height=height;
    this.width= width;
}
double getArea(){
    return  height*width;
}
double getPerimeter(){
    return 2*(height+width);
}

}
