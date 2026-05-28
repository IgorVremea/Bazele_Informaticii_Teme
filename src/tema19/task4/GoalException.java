package tema19.task4;

public class GoalException extends RuntimeException {
    public GoalException(String message) {
        super(message);
    }
    public GoalException(){
        super("GOAAAAAAAAAAAAAL!");
    }
}
