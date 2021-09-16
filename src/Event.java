import java.util.EventObject;

/**
 * @author ekkasit.tan
 */
public class Event extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    private String score;
    public Event(Object source,String score) {
        super(source);
        this.score = score;
    }

    public String getScore() {
        return score;
    }
}
