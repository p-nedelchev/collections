import com.google.common.collect.Lists;

import java.util.List;


/**
 * Created by clouway on 06.06.16.
 *
 * @author alexandervladimirov1902@gmail.com
 *         (Alexander Vladimirov)
 *  Using Google guava library.
 *  This code is for traversing list, devided by inputed size.
 *
 */
public class PageBean<T> {
  private final List<T> elements;
  private final int pageSize;
  private int cursor = 0;

  public PageBean(List<T> elements, int pageSize) {
    this.elements = elements;
    this.pageSize = pageSize;
  }

  /**
   * Returns next page of the list.
   * @return returns next list with elements, if last list is given then it returns empty list by default.
   */
  public List<T> next() {
    int end = cursor + pageSize;
    if (end > elements.size()) {
      end = elements.size();
    }
    return getElements(end);
  }

  /**
   * Return previous page of the list.
   * @return returns previous list with elements, if first list is given then it returns first list by default.
   */
  public List<T> previous() {
    int end = cursor - pageSize;
    this.cursor = end - pageSize;
    if (end == 0) {
      return firstPage();
    }
    return getElements(end);
  }

  /**
   * Returns first page  of the list.
   * @return list of fist elements in given list.
   */
  public List<T> firstPage() {
    this.cursor = 0;
    return getElements(cursor + pageSize);

  }

  /**
   * Return last page of the list.
   * @return list of last elements in given list.
   */
  public List<T> lastPage() {
    this.cursor = elements.size() - (elements.size() / pageSize);
    return getElements(elements.size());
  }

  /**
   * Checks if has next element.
   * @return true if has next, false if not.
   */
  public boolean hasNext() {
    if (cursor < elements.size()) {
      return true;
    }
    return false;
  }

  /**
   * Checks if has previous element.
   * @return true if has previous, false if not.
   */
  public boolean hasPrevious() {
    if (cursor/pageSize == 1) {
      return false;
    }
    return true;
  }

  /**
   * Return page from the list as list with limited content.
   * @param end is the end of the list that is made.
   * @return new list as page with limited content.
   */
  private List<T> getElements(int end) {
    List<T> result = Lists.newArrayList();
    for (int i = this.cursor; i < end; i++) {
      result.add(this.elements.get(i));
      this.cursor++;
    }
    return result;
  }
}
