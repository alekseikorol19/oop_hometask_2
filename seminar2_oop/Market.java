package seminar2_oop;

import java.util.ArrayList;
import java.util.List;

public class Market implements MakretBehaviour, QueueBehoviour {

    List<Actor> queue = new ArrayList<>();

    @Override
    public void takeInQueue(Actor actor) {
        queue.add(actor);
        System.out.println(actor.getName() + " встал в очередь");
    }

    @Override
    public void takeOrders() {
        for (Actor actor : queue) {
            if (actor.isMakeOrder() == false) {
                actor.isMakeOrder = true;
                System.out.println(actor.getName() + " сделал заказ");
            }
        }
    }

    @Override
    public void giveOrders() {
        for (Actor actor : queue) {
            if (actor.isMakeOrder() == true) {
                actor.isTakeOrder = true;
                System.out.println(actor.getName() + " получил заказ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseQueue = new ArrayList<>();
        for (Actor actor : queue) {
            if (actor.isTakeOrder == true) {
                releaseQueue.add(actor);
            }
        }
        releaseFromMarket(releaseQueue);
    }

    @Override
    public void acceptToMaket(Actor actor) {
        System.out.println(actor.getName() + " попал в магазин");
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            queue.remove(actor);
        }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }
    
}
