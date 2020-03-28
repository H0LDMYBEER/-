public class Ponchik extends Human {
    int salt = 0;

    void toSalt () {
        salt -= 1;

        System.out.println("Блюдо посолено. Соли осталось: " + salt);
    }

    void getSalt () {
        salt += 5;
        System.out.println(Adjectives.Сказочная + " соль набрана" + ". Соли стало: " + salt);
    }

    void sellSalt () {
        money += 10;
        salt -= 1;
        System.out.println("Соль продана. Соли стало: " + salt + ". Монет получено: 10. Всего: " + money);
    }

    void sellAll () {
        money += salt * 10;
        System.out.println("Вся соль продана. Монет получено: " + salt * 10 + ". Всего: " + money);
        salt = 0;
    }

    void sitTable () {
        System.out.println("Пончик сел за " + Adjectives.удобный + " стол ");
    }
}
