public class Main {

    public static void main(String[] args) {

        int initialBalance = 100;
        int addend = 1100;

        int bonus = 0;
        if (addend > 1000) {
            bonus = addend / 100;
        }

        int finalbalance = initialBalance + addend + bonus;
        System.out.println("Итоговый счет :" + finalbalance);
        System.out.println("Бонус:" + bonus);


    }


}
