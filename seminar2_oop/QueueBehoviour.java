package seminar2_oop;

public interface QueueBehoviour {
    void takeInQueue (Actor actor);
    void takeOrders();
    void giveOrders();
    void releaseFromQueue();
}
