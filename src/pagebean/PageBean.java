package pagebean;

import java.util.ArrayList;
import java.util.List;

public class PageBean<T> {
    private List<T> list;
    private int currentPage;
    private int pageSize;
    private int index;

    public PageBean(int pageSize) {
        list = new ArrayList<T>();
        this.pageSize = pageSize;
        currentPage = 0;
    }

    public void add(T element) {
        list.add(element);

    }

    private List<T> callNextPage() {
        List<T> next;
        index = currentPage * pageSize;
        if (list.size() - index > pageSize) {
            next = list.subList(index, index + pageSize);
            currentPage += 1;
        }
        next = lastPage();
        index = list.size() + 1;

        return next;
    }

    public List<T> firstPage() {
        index = 0;
        currentPage = 1;
        return list.subList(index, pageSize);
    }

    public List<T> lastPage() {
        if (list.size() % pageSize == 0) {
            index = list.size() - pageSize;
            currentPage = list.size() / pageSize;
            return list.subList(index, list.size());
        }
        index = (list.size() / pageSize) * pageSize;
        currentPage = list.size() - pageSize + 1;
        return list.subList(index, list.size());


    }

    public List<T> next() throws NoMorePagesException {
        List<T> next;
        if (currentPage == 0) {
            next = firstPage();
        }
        if (list.size() > index) {
            next = callNextPage();
        } else

            throw new NoMorePagesException("No more pages!");

        return next;
    }

    public List<T> previous() throws NoMorePagesException {
        List<T> previous;
        if (currentPage >= 2) {
            index -= pageSize * 2;
            currentPage -= 2;
            previous = callNextPage();
        } else
            throw new NoMorePagesException("No more pages!");

        return previous;
    }


    public boolean hasNext() {

        return index < list.size();
    }

    public boolean hasPrevious() {

        return currentPage >= 2;
    }

    public int getCurrentPage() {

        return currentPage;
    }

}
