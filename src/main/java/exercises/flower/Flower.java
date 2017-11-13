package exercises.flower;

import static jdk.nashorn.internal.objects.Global.print;

public class Flower {
    int petalCount = 0;
    String s = "initial value";

    Flower(int petals) {
        petalCount = petals;
        print("Constructor w/ int arg only, petalCount= " + petalCount);
    }

    Flower(String ss) {
        print("Constructor w/ arg only, s= " + ss);
    }

    Flower(String s, int petals) {
        this(petals);
        this.s = s;
        print("Strings and int args");

    }

    Flower() {
        this("hi", 47);
        print("default constructor(no args)");
    }

    void printPetalCount() {
        print("petalCount = " + petalCount + "s = " + s);

    }
}
