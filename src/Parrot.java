public class Parrot extends Animal{

    public Parrot(String name, int nrOfLegs, boolean isMammal) {
        super(name, nrOfLegs, isMammal);
        this.name = name;
        this.nrOfLegs = nrOfLegs;
        this.isMammal = isMammal;
        System.out.println("My name is " + name);
    }

    @Override
    public void makeSound() {
        System.out.println("Hello!");
    }
}
