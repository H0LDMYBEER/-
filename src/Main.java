public class Main {

    public static void main(String[] args) {
        Ponchik P = new Ponchik();
        Mistres M = new Mistres();
        Dish Potato = new Dish("пюре", "второе блюдо");
        Dish Soap = new Dish("уха", "первое блюдо");
        Citizen Inhabitants = new Citizen();
        P.getSalt();
        P.sellSalt();
        Potato.Cook();
        P.toSalt();
        M.reciveMoney(7000);
        M.putTable();
        P.sitTable();
        Soap.Cook();
        P.toSalt();
        Inhabitants.discover();
        M.canopyWithTables();
        M.expandVeranda();
        M.makeExtension();
        M.buyAll();
    }
}
