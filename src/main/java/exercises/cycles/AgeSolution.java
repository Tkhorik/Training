package exercises.cycles;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AgeSolution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.readLine();
        String age = reader.readLine();
        int nage = Integer.parseInt(age);

        if (nage < 18) {
            System.out.println("Подрасти еще");
        }
    }
}