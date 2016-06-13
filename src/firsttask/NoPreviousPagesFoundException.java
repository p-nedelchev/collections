package firsttask;

/**
 * Created by clouway on 02.06.16.
 */

public class NoPreviousPagesFoundException extends Exception {
    public NoPreviousPagesFoundException() {
        super("You was at page 1!");
    }
}

