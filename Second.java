import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите а: ");
        rectangle.a = in.nextInt();
        System.out.print("Введите b: ");
        rectangle.b = in.nextInt();
        rectangle.Rectangle();
    }
}

class Rectangle {
    int a = 0;
    int b = 0;

    void Rectangle() {
        int p = (a + b) * 2;
        double s = a * b;
        System.out.println("A: " + a + "\n" + "B: " + b + "\n" + "S: " + s + "\n" + "P: " + p);
    }
}