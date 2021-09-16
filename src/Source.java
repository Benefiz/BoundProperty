import java.util.ArrayList;

/**
 * @author ekkasit.tan
 */
public class Source {
    private String score;
    private final ArrayList<Listener> listeners;
    public Source() {
        listeners = new ArrayList<>();
    }
    public void setScore(String score) {
        this.score = score;
        fireEvent(new Event(this, score));
    }
    public String getScore() {
        return this.score;
    }
    public void addListener(Listener l) {
        listeners.add(l);
    }
    public void removeListener(Listener l) {
        listeners.remove(l);
    }
    public void fireEvent(Event e) {
        for (Listener l : listeners) {
            l.changeScore(e);
        }
    }
}
