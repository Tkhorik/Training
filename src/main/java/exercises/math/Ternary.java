package exercises.math;

public class Ternary {

    void calculateTernary(int number) {

        String text = (number % 2 == 0) ? "четное" : "не четное";
        System.out.println("число " + number + " - " + text);
    }

    public static void sayYes(String wordYes) {
        wordYes = "Yes";
        System.out.println(wordYes);
    }

    int max(int one, int two) {
        return one > two ? one : two;
    }
}