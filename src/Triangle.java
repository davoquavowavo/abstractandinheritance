public class Triangle extends GeometricalFigure {
    double firstSide;

    double secondSide;

    double height;
    double width;

     public Triangle(double firstSide, double secondSide, double height, double width) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        System.out.println("The area has been calculated: " + (0.5 * (height * width)));
    }
        @Override
        public void calculatePerimeter() {
            System.out.println("The perimeter has been calculated: " + (firstSide + secondSide + width));
    }
}

