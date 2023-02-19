public class Rectangle extends GeometricalFigure{

    double height;
    double width;


    @Override
    public void calculateArea(){
        System.out.println("The area has been calculated: " + (height * width));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("The perimeter has been calculated: " + (height * 2) + (width * 2));
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }


}
