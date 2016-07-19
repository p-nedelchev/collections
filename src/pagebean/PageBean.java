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

    //add new page
    public void add(T element) {
        list.add(element);
        size++;

    }
    // return first page
    public T firstPage() {
        currentPage = 0;
        return list.get(0);

    }

    // return last page
    public T lastPage() {
        currentPage = list.size() - 1;
        return list.get(list.size() - 1);

    }
    // return next page from pagebean
    public T next() throws NoMorePagesException {
        if (currentPage < list.size() - 1) {
            currentPage++;
            return list.listIterator(currentPage).next();
        } else
            throw new NoMorePagesException("No more pages left");

    }

    //return previous page from pagebean
    public T previous() throws NoMorePagesException {
        if (currentPage == 1) {
            currentPage--;
            return list.listIterator(currentPage).next();
        } else
            throw new NoMorePagesException("No more pages left");

    }

    //if pagebean has next page return true else return false
    public boolean hasNext() {
        if (currentPage >= -1 && currentPage < list.size() - 1) {
            return true;
        } else {
            return false;
        }
    }

    //if pagebean has previous page return true else return false
    public boolean hasPrevious() {
        if (currentPage >= 1) {
            return true;
        }
        return false;
    }

    //return current page number
    public int getCurrentPage() {

        return currentPage + 1;

    }

}
