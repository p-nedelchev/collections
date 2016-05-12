package pagebean;

/**
 * @author Vasil Mitov (v.mitov.clouway@gmail.com)
 */
public class NoPreviousPage extends Exception {
  public NoPreviousPage(){
    super("There is no previous page.");
  }
  }

