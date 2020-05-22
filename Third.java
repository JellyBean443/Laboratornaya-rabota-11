import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Massiv massiv = new Massiv();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        massiv.n = in.nextInt();
        massiv.Massiv();
    }
}

class Massiv {
    int n = 0;
    int[] intArray;

    void Massiv() {
        intArray = new int[n];
        Scanner in = new Scanner(System.in);
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            intArray[i] = in.nextInt();
        }
        System.out.println("Массив:");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + intArray[i]);
        }
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    int tmp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = tmp;
                }
            }
        }
        System.out.println("\nОтсортированный массив: ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + intArray[i]);
        }
    }
}