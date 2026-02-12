public class main {
    public static void main(String[] args) {

        int amount = 13676; // сумма покупки

        int rub = 20; // каждые 20 руб дают 1 бонус

        int bonus = amount / rub; // сумма бонусов

        System.out.println(bonus);

    }
}
