package pagebean;

import java.util.ArrayList;
import java.util.List;

public class PageBean<T> {
    private List<T> list;
    private int currentPage;
    private int pageSize;
    private int size;

    public PageBean(int pageSize) {
        list = new ArrayList<T>(10);
        this.pageSize = pageSize;
        currentPage = 0;
    }

    /**
     * this method add new page to pagebean
     *
     * @param element is a page to add
     */
    public void add(T element) {
        list.add(element);

    }

    /**
     * this method return first page
     *
     * @return first page
     */
    public List<T> firstPage() {
        List<T> first = new ArrayList<>(pageSize);
        size = pageSize;
        for (int i = 0; i < size; i++) {
            first.add(list.get(i));
        }
        currentPage = 1;
        return first;
    }

    /**
     * this method return last page
     *
     * @return last page
     */
    public List<T> lastPage() {
        List<T> last = new ArrayList<>(pageSize);
        if (list.size() % pageSize == 0) {
            size = list.size() - pageSize;
            for (int i = size; i < list.size(); i++) {
                last.add(list.get(i));
            }
            currentPage = list.size() / pageSize;
            size += pageSize;
        } else {
            for (int i1 = list.size() - (list.size() % pageSize); i1 < list.size(); i1++) {
                last.add(list.get(i1));
            }
            currentPage = list.size() / pageSize + 1;
            size = currentPage * pageSize;
        }
        return last;
    }

    /**
     * this method check for if have next page return the next page
     *
     * @return next page from pagebean
     * @throws NoMorePagesException
     */
    public List<T> next() throws NoMorePagesException {
        List<T> next = new ArrayList<>(pageSize);
        if (currentPage == 0) {
            size = pageSize;
            currentPage = 1;
            for (int i = 0; i < size; i++) {
                next.add(list.get(i));
            }
        } else {
            if (size < list.size()) {
                if (list.size() - size < pageSize){
                    for (int i1 = list.size() - (list.size() % pageSize); i1 < list.size(); i1++) {
                        next.add(list.get(i1));
                    }
                    currentPage = list.size() / pageSize + 1;
                    size = currentPage * pageSize;
                } else {
                    for (int i = size; i < size + pageSize; i++) {
                        next.add(list.get(i));
                    }
                    size += pageSize;
                    currentPage++;
                }
            } else {
                throw new NoMorePagesException("No more pages!");
            }
        }
        return next;
    }


    /**
     * this method check if have previous page return previous page
     *
     * @return previous page
     * @throws NoMorePagesException
     */

    public List<T> previous() throws NoMorePagesException {
        List<T> previous = new ArrayList<>(pageSize);
        if (currentPage >= 2) {
            for (int i = size - (2 * pageSize); i < size - pageSize; i++) {
                previous.add(list.get(i));
            }
            currentPage--;
            size -= pageSize;
        } else {
            throw new NoMorePagesException("No more pages!");
        }
        return previous;
    }

    /**
     * this method check if has next page return true else return false
     *
     * @return false
     */
    public boolean hasNext() {
        if (size < list.size()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * this method check if has previous page return true else return false
     *
     * @return
     */
    public boolean hasPrevious() {
        if (currentPage >= 2) {
            return true;
        }
        return false;
    }

    /**
     * this method return current page number
     *
     * @return current page number
     */
    public int getCurrentPage() {

        return currentPage;

    }

}
