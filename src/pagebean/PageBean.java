package pagebean;

import java.util.*;


public class PageBean<T> {
    private List<T> list;
    private ListIterator<T> it;
    private int currentPage = -1;
    private int size = 0;

    public PageBean() {
        list = new ArrayList<T>(10);
        it = list.listIterator();
    }

    /**
     * this method add new page to pagebean
     * @param element is a page to add
     */
    public void add(T element) {
        list.add(element);
        size++;

    }

    /**
     * this method return first page
     * @return first page
     */
    public T firstPage() {
        currentPage = 0;
        return list.get(0);

    }

    /**
     * this method return last page
     * @return last page
     */
    public T lastPage() {
        currentPage = list.size() - 1;
        return list.get(list.size() - 1);

    }

    /**
     * this method check for if have next page return the next page
     * @return next page from pagebean
     * @throws NoMorePagesException
     */
    public T next() throws NoMorePagesException {
        if (currentPage < list.size() - 1) {
            currentPage++;
            return list.listIterator(currentPage).next();
        } else
            throw new NoMorePagesException("No more pages left");

    }

    /**
     * this method check if have precious page return previous page
     * @return previous page
     * @throws NoMorePagesException
     */
    public T previous() throws NoMorePagesException {
        if (currentPage == 1) {
            currentPage--;
            return list.listIterator(currentPage).next();
        } else
            throw new NoMorePagesException("No more pages left");

    }

    /**
     * this method check if has next page return true else return false
     * @return false
     */
    public boolean hasNext() {
        if (currentPage >= -1 && currentPage < list.size() - 1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * this method check if has previous page return true else return false
     * @return
     */
    public boolean hasPrevious() {
        if (currentPage >= 1) {
            return true;
        }
        return false;
    }

    /**
     * this method return current page number
     * @return current page number
     */
    public int getCurrentPage() {

        return currentPage + 1;

    }

}
