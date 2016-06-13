package firsttask;

/**
 * Created by clouway on 06.06.16.
 */
public class NoNextPagesFoundException extends Exception
{
    public NoNextPagesFoundException(){
        super("You was at last Page SORRY !");
    }
}
