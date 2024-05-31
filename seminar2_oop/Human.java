package seminar2_oop;

public class Human extends Actor {

    public Human(String name) {
        super(name);
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean takeOrder) {
        super.isTakeOrder = takeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    String getName() {
        return super.name;

    }
    
}
