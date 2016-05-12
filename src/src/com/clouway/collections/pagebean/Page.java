package src.com.clouway.collections.pagebean;

public class Page {
  private String content;
  private int number;

  public Page(String content, int number) {
    this.content = content;
    this.number = number;
  }

  public String getContent() {
    return content;
  }

  public int getNumber() {
    return number;
  }
}
