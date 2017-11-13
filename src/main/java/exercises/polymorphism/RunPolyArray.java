package exercises.polymorphism;

public class RunPolyArray {
    public static void main(String[] args) {
        Animals[] theList = new Animals[3];

        Dog d = new Dog();
        Fish f = new Fish();
Animals animals = new Animals();
        theList[0] = d;
        theList[1] = f;
        theList[2] = animals;

        for (Animals x : theList) {
            x.noise();
        }
    }
}