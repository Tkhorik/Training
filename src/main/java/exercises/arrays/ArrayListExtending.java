package exercises.arrays;

/*Метод Add добавление в массив расширяя его
 * примерная реализация ArrayList*/
public class ArrayListExtending {

    private int array[];
    private int element;
    private int arrayLength = array.length;
    private int currentLength;
    private Object src;
    private Object dest;

    ArrayListExtending(int element) {
        if (currentLength < arrayLength) {
            incrase();
        } else
            array[currentLength - 1] = element;
    }

    private void incrase() {
        arrayLength = (int) (array.length * 1.5 + 1);
        System.arraycopy(src, 3, dest, 8, 100);
    }
}
