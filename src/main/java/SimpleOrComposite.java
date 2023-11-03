public class SimpleOrComposite {
    public static void main(String[] args) {
        int a = 15;
        boolean isComposite = false;
        for (int i = 15; i < a; i++) {
            if (a % i == 0) {
                isComposite = true;
                break;
            }
        }
        if (isComposite) {
            System.out.println("число составное ");
        } else {
            System.out.println("число  простое ");
        }
    }
}
