import java.util.EventListener;

/**
 * @author ekkasit.tan
 */
public class Listener implements EventListener {

    public void changeScore(Event e) {
        System.out.println("live result: " + e.getScore());
    }
}
