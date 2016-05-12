package src.com.clouway.collections.pagebean;

import java.util.LinkedList;
import java.util.List;

public class PageBean {
  private List<Page> list = new LinkedList<>();
  private int size = 0;
  private int current;

  /**
   * Create pages and add the to a list.
   *
   * @param str
   * @param size
   */
  public void add(String str, int size) {
    int begin = 0, i = 0;
    while (i < (str.length() + size - 1) / size) {
      add(str.substring(begin, Math.min(begin + size, str.length())));
      begin += size;
      i++;
    }
  }

  /**
   * Returns the next page.
   * @return
   * @throws NextPageNotFoundException
   */
  public String next() throws NextPageNotFoundException {
    if (!hasNext()) {
      throw new NextPageNotFoundException();
    }
    current--;
    return show();
  }

  /**
   * Returns the previous page
   * @return
   * @throws PreviousPageNotFoundException
   */
  public String previous() throws PreviousPageNotFoundException {
    if (!hasPrevious()) {
      throw new PreviousPageNotFoundException();
    }
    current++;
    return show();
  }

  /**
   * Returns the first page.
   *
   * @return
   */
  public String firstPage() {
    current = size;
    return show();
  }

  /**
   * Returns the last page.
   *
   * @return
   */
  public String lastPage() {
    current = 1;
    return show();
  }

  /**
   * Returns the number of the current page.
   *
   * @return
   */
  public int getCurrentPageNumber() {
    return list.get(size - current).getNumber();
  }

  /**
   * Add new page to the list.
   *
   * @param str
   */
  private void add(String str) {
    Page p = new Page(str, size);
    list.add(p);
    size++;
    current = size + 1;
  }

  /**
   * Checks if the current page has a page after it.
   *
   * @return
   */
  private boolean hasNext() {
    if (current == 1) return false;
    else return true;
  }

  /**
   * Check if the current page has a page before it.
   *
   * @return
   */
  private boolean hasPrevious() {
    if (current == size) return false;
    else return true;
  }

  /**
   * Returns the current page.
   *
   * @return
   */
  private String show() {
    return list.get(size - current).getContent();
  }
}