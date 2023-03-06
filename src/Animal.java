abstract class Animal {
    String name;

    String testtilgit;

    int nrOfLegs;

    boolean isMammal;

    public Animal(String name, int nrOfLegs, boolean isMammal){
        this.name = name;
        this.nrOfLegs = nrOfLegs;
        this.isMammal = isMammal;
    }

    public abstract void makeSound();

}
