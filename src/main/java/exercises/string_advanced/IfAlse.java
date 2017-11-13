package exercises.string_advanced;


import static java.lang.Integer.compare;
import static jdk.nashorn.internal.objects.Global.print;

public class IfAlse {
    private static int result = 0;

    /**
     * @param testval
     * @param target
     */
    private static void test(int testval, int target) {
//        switch (result = compare(testval, target)) {
        if (testval > target) result = +1;
        else if (testval < target)
            result = -1;
        else
            result = 0;
    }

    public static void main(String[] args) {
        test(10, 5);
        print(result); //todo: replace print import to solve nullpointerexcepltion
        test(11, 12);
        print(result);
        test(8, 8);
        print(result);
    }
}
