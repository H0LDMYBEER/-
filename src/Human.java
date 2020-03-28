public abstract class Human {
    int money = 0;

    void reciveMoney (int profit) {
        money += profit;
        System.out.println("Получено " + profit + " монет. Всего: " + money);
    }
}
