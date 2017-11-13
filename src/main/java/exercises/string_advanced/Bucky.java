package exercises.string_advanced;

import java.util.ArrayList;
import java.util.List;

public class Bucky {
    public static void main(String[] args) {
  /*      String[] things = {"egs", "tomato", "chicken","pie"};
        List<String> list  = new ArrayList< String >;
        for (String x: things)
            list.add(x);

        String[] morethings ={ "tomato","pie" };*/
        System.out.println("return from storage method: " + storage("99879879700[pojhgghjkmnmbghjnbhjhj"));

     }

    public static int storage(String m) {
        return m.length();
    }


}


