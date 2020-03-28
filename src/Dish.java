public class Dish {
    String name;
    String type;

    public Dish(String n, String t) {
        name = n;
        type = t;
    }

    void Cook () {
        System.out.println(Adjectives.Новомодное + " блюдо " + name + " готово");
    }
}
