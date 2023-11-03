import java.util.Scanner;

public class SimpleOrComposite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean composite = true;

        System.out.println("Введите число");
        int num = input.nextInt();
        for (int i = 2; i < 10; i++) {
            if (num % i == 0) {
                composite = false;
                break;
            }
        }
        if (!composite) {
            System.out.println("Число простое");
        } else {
            System.out.println("Число составное");
        }
    }
}
