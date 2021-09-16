import java.util.Scanner;

/**
 * @author ekkasit.tan
 */
public class Main {
    public static void main(String[] args) {
        Source src = new Source();
        Listener listener1 = new Listener();
        Listener listener2 = new Listener();
        src.addListener(listener1);
        src.addListener(listener2);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter score: ");
            String score = sc.nextLine();
            if (score.isEmpty())
                break;
            src.setScore(score);
        }
    }
}
