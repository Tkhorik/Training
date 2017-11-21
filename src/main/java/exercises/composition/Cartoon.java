package exercises.composition;

import static jdk.nashorn.internal.objects.Global.print;

public class Cartoon extends Drowing {
    private Cartoon() {
        print("Cartoon constructor");
    }

    public static void main(String[] args) {
        Cartoon cartoon = new Cartoon();
    }
}
