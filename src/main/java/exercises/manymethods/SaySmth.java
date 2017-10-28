package exercises.manymethods;


import java.util.Scanner;

public class SaySmth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        exercises.manymethods.SayGirlName tuna = new exercises.manymethods.SayGirlName();
        String temp = scanner.nextLine();
        tuna.setGirlName(temp);
        tuna.saying();

    }
}
