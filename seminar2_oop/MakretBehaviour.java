package seminar2_oop;
import java.util.List;

public interface MakretBehaviour {
    void acceptToMaket(Actor actor);
    void releaseFromMarket(List<Actor> actors);
    void update();
}
