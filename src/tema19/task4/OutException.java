package tema19.task4;

public class OutException extends RuntimeException {
    public OutException(String message) {
        super(message);
    }
    public OutException(){
        super("OutException!");
    }
}
