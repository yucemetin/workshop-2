package polymorphism_demo;

public class EmailLogger extends BaseLogger {
    public void log(String message) {
        System.out.println("Logged to email : " + message);
    }
}
