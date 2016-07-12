package pagebean;

import java.util.List;

/**
 * Created by clouway on 08.07.16.
 *
 * @author Denis Dimitrov(@denis.k.dimitrov@gmail.com)
 */
public class PageBean<T> {
    private int currentPage = -1;
    private int pageSize;
    private List<T> list;
    private String noPages = "No more pages left!";

    public PageBean(List<T> list, int pageSize) {
        this.list = list;
        this.pageSize = pageSize;
    }

    public List<T> next() {
        if (hasNext()) {
            currentPage++;
            return getPageElements();
        }
        throw new PageBeanException(noPages);
    }

    public List<T> previous() {
        if (hasPrevious()) {
            currentPage--;
            return getPageElements();
        }
        throw new PageBeanException(noPages);
    }

    public List<T> firstPage() {
        currentPage = 0;
        return getPageElements();
    }

    public List<T> lastPage() {
        if (list.size() % pageSize == 0) {
            currentPage = list.size() / pageSize - 1;
        } else {
            currentPage = list.size() / pageSize;
        }
        return getPageElements();
    }

    public int getCurrentPageNumber() {
        return currentPage;
    }

    private List<T> getPageElements() {
        if (currentPage * pageSize + pageSize > list.size()) {
            return list.subList(currentPage * pageSize, list.size());
        }
        return list.subList(currentPage * pageSize, currentPage * pageSize + pageSize);
    }

    private boolean hasNext() {
        return (currentPage < pageSize - 1);
    }

    private boolean hasPrevious() {
        return (currentPage > 0);
    }
}
