package src.com.clouway.collections.pagebean;

public class PreviousPageNotFoundException extends Exception {
  public PreviousPageNotFoundException() {
    super("\nYou are on the first page.");
  }
}
