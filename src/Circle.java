public class Circle extends GeometricalFigure {


double radius;

double pi = 3.14;







public Circle(double radius) {
this.radius = radius;
}



    @Override
    public void calculateArea() {
        System.out.println("The area has been calculated: " + (pi * (radius * radius)));
    }
        @Override
        public void calculatePerimeter() {
            System.out.println("The perimeter has been calculated: " + (2 * pi * radius));

        }
    }
