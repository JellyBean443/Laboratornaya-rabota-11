import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите а: ");
        triangle.a = in.nextInt();
        System.out.print("Введите b: ");
        triangle.b = in.nextInt();
        System.out.print("Введите с: ");
        triangle.c = in.nextInt();
        triangle.Treugolnik();
    }
}

class Triangle {
    int a = 0;
    int b = 0;
    int c = 0;

    void Treugolnik() {
        int p = (a + b + c);
        double s = Math.sqrt(p / 2 * (p / 2 - a) * (p / 2 - b) * (p / 2 - c));
        System.out.println("A: " + a + "\n" + "B: " + b  + "\n" + "C: " + c + "\n" + "S: " + s + "\n" + "P: " + p);
    }
}