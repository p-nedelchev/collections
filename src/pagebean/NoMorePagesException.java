package pagebean;

public class NoMorePagesException extends RuntimeException{
    public NoMorePagesException(String message){
        super(message);
    }
}
