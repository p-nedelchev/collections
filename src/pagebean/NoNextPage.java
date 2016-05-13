package pagebean;

/**
 * @author Vasil Mitov (v.mitov.clouway@gmail.com)
 */
public class NoNextPage extends Exception {
  public NoNextPage() {
    super("No next page in the list.");
  }
}
