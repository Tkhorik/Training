package exercises.arrays;


public class ArraySumViaLoop {
    public static void main(String[] args) {
        int bucky[] = {1, 2, 3, 12, 2, 2, 1, 3, 1, 4};
        int total = 0;
        for (int x : bucky) {
            total += x;
        }
        System.out.println(total);
        int arrayAverege = total / bucky.length;
        System.out.println("среднее значение массива = " + arrayAverege);

    }
}
