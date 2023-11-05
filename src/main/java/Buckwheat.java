public class Buckwheat {
    public static void main(String[] args) {
        int month = 36;
        int pricePerKilogramPerMonth = 100;
        int pricePerStoragePerMonth;
        int numberOfKilogramsEaten = 0;
        int finalPrice = 0;
        for (int i = 1; i <= month; i++) {
            pricePerStoragePerMonth = pricePerKilogramPerMonth * 6;
            numberOfKilogramsEaten = numberOfKilogramsEaten + 6;
            finalPrice += pricePerStoragePerMonth;
            if (numberOfKilogramsEaten < 100) {
                System.out.println("За " + i + " месяц, Вася потратит " + finalPrice + " рублей, и съест всего " + numberOfKilogramsEaten + " кг");
            }
        }
    }
}
