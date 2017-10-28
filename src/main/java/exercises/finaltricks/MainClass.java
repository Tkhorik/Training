package exercises.finaltricks;


public class MainClass {
    public static void main(String[] args) {
        exercises.finaltricks.FinalTricksLession finalTricksLession;
        finalTricksLession = new exercises.finaltricks.FinalTricksLession(1);
        for (int i = 0; i <  50; i++) {
            finalTricksLession.add();
            System.out.println(finalTricksLession);
        }
    }
}
