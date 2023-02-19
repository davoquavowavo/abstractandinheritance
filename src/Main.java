import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Initiated");

        Parrot timmy = new Parrot("Timmy", 2, false);
        timmy.makeSound();

        Cat todd = new Cat("Todd", 4, true);
        todd.makeSound();

        ArrayList<Class> animals = new ArrayList<Class>();

        animals.add(timmy.getClass());
        animals.add(todd.getClass());




        System.out.println(animals);

        Rectangle r1 = new Rectangle(4.4,8.8);

        r1.calculateArea();

        r1.calculatePerimeter();

        Triangle t1 = new Triangle(2.2, 4.4,8.8,10.10);

        t1.calculateArea();
        t1.calculatePerimeter();

        Rectangle c1 = new Rectangle(7.2, 6.8);

        c1.calculateArea();
        c1.calculatePerimeter();


        System.out.println(todd.nrOfLegs);
    }

}