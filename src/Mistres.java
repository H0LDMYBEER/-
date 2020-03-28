public class Mistres extends Human {

    void putTable () {
        money -= 250;
        System.out.println(Adjectives.Специальный + " столик установлен. Монет осталось: " + money);
    }

    void expandVeranda () {
        money -= 1750;
        System.out.println("Веранда и кухня расширены. Монет осталось: " + money);
    }

    void makeExtension () {
        money -= 2500;
        System.out.println("Пристройка установлена. Монет осталось: " + money);
    }

    void canopyWithTables () {
        money -= 2250;
        System.out.println("Навес из брезента установлен. Монет осталось: " + money);
    }

    void buyAll () {
        System.out.println("Хохяйка стала покупать весь запас соли у Пончика");
    }

}
