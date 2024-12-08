public class Main {
    public static void main(String[] args) {

        int firstBalance = 100;
        int deposit = 1400;


        int bonus = 0;
        if (deposit > 1000) {
            bonus = deposit / 100;
        }

        int finalBalance = firstBalance + deposit + bonus;

        System.out.println("Итоговый счёт: " + finalBalance);
        System.out.println("Бонусные рубли: " + bonus);
    }
}
