import java.util.Arrays;

public class massiv {
    private static Integer mas[]= {1, 34, 12, 67, 12, 75, 2, 56, 787, 2};

    private static <T> void onePrint(T[] tempMas, int number) {
        System.out.println(number + " эллемент массива " + tempMas[number]);
    }

    private static <T> void change(T[] tempMas, int i, int j){
        if (i < tempMas.length && j < tempMas.length && i != j) {
            T temp = tempMas[i];
            tempMas[i] = tempMas[j];
            tempMas[j] = temp;
        }
        System.out.println(Arrays.toString(tempMas));
    }
    private static <T> void reverse(T[] tempMas) {
        System.out.print(" Массив в обратном порядке: ");
        for (int i = tempMas.length-1; i >= 0; i--) {
            System.out.print(tempMas[i] + " ");
        }
    }
    public static void main(String[] args) {
        onePrint(mas, 5);
        change(mas, 1, 5);
        reverse(mas);
    }

}
