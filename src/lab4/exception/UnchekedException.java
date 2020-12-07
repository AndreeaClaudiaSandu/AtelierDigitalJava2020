package lab4.exception;

public class UnchekedException extends RuntimeException{
    public UnchekedException(String description){
        super("Unchecked " + description);
    }
}
