package pagebean;


import java.util.List;


/**
 * Created by clouway on 10.05.16.
 */
public class PageBean {
  public Integer currentpage = 0;
  private Integer pagesize;
  private List<Object> pages;

  public PageBean(Integer pagesize, List<Object> pages) {
    this.pagesize = pagesize;
    this.pages = pages;
  }


  public String next() {
    Integer from;
    Integer to;
    currentpage += 1;
    from = (currentpage - 1) * pagesize;
    to = ((currentpage - 1) * pagesize)  + pagesize;
    if (to > pages.size()) {
      to = pages.size();
    }
    return pages.subList(from, to).toString();
  }

  public String previous() {
    currentpage -= 2;
    return next();
  }

  public boolean hasNext() {
    if (currentpage < pages.size() / pagesize) {
      return true;
    }
    return false;
  }

  public boolean hasPrevious() {
    if (currentpage > 1) {
      return true;
    }
    return false;
  }

  public String firstPage() {
    currentpage = 0;
    return next();
  }

  public String lastPage() {
    currentpage = pages.size() / pagesize;
    return next();
  }

  public Integer getCurrentPageNumber() {
    return currentpage;
  }
}