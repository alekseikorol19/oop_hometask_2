package seminar2_oop;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Ivan");
        Human human2 = new Human("Stanislav");

        market.acceptToMaket(human1);
        market.acceptToMaket(human2);
        market.update();

    }
}
