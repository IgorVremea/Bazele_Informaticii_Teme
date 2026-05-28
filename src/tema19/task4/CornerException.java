package tema19.task4;

public class CornerException extends RuntimeException {
    public CornerException(String message) {
        super(message);
    }
    public CornerException(){
        super("CornerException");
    }
}
