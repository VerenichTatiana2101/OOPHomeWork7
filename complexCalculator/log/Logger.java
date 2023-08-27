package complexCalculator.log;

public class Logger implements Loggable{
    public Logger() {
    }

    @Override
    public void log(String message) {
        System.out.println("\nLog: " + message + "\n");
    }
}
