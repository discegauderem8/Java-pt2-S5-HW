import Controller.Controller;
import View.ConsoleView;

public class Main {
    public static void main(String[] args) {

        Controller c = new Controller(new ConsoleView());
        c.execute();
    }
}