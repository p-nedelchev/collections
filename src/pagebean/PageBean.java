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

    public PageBean(List<T> list, int pageSize) {
        this.list = list;
        this.pageSize = pageSize;
    }

    public List<T> next() {
        if (hasNext()){
            currentPage++;
            return getCurrentPageNumber();
        } else {
            throw new LastPageException();
        }
    }

    public List<T> previous() {
        if (hasPrevious()){
            currentPage--;
            return getCurrentPageNumber();
        } else {
            throw new FirstPageException();
        }
    }

    public List<T> firstPage() {
        currentPage = 0;
        return getCurrentPageNumber();
    }

    public List<T> lastPage() {
        if (list.size() % pageSize == 0){
            currentPage = list.size() / pageSize - 1;
        } else {
            currentPage = list.size() / pageSize;
        }
        return getCurrentPageNumber();
    }

    public List<T> getCurrentPageNumber() {
        if (currentPage * pageSize + pageSize > list.size()) {
            return list.subList(currentPage * pageSize, list.size());
        } else {
            return list.subList(currentPage * pageSize, currentPage * pageSize + pageSize);
        }
    }
    private boolean hasNext() {
        if (currentPage * pageSize + pageSize < list.size()){
            return true;
        } else {
            return false;
        }
    }

    private boolean hasPrevious() {
        if (currentPage > 0){
            return true;
        } else {
            return false;
        }
    }
}
