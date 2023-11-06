import java.util.Scanner;

public class SimpleOrComposite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean composite = true;

        System.out.println("Введите число");
        int num = input.nextInt();

        if(num < 2){
            System.out.println("Введите число больше 1");
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                composite = false;
            }
        }
        if (composite) {
            System.out.println("Число простое");
        } else {
            System.out.println("Число составное");
        }
    }
}
