package pagebean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class PageBean {
    private ArrayList<String> arlist;
    private int pageSize;
    private int currentPage = 0;

    public PageBean (List<String> list, int size) {
        arlist = new ArrayList<>(list);
        pageSize = size;
    }

    /**
     * Gets the next page from the page bean
     * @return List a list containing the next page
     */
    public List<String> next () {
        currentPage ++;
        if (currentPage*pageSize > arlist.size()) {
            return lastPage();
        }
        return getCurrentPage();
    }

    /**
     * Gets the previous page of the page bean
     * @return List a list containing the previous page
     * @throws RuntimeException throw exception when method is called on the first page
     */
    public List<String> previous () throws RuntimeException {
        currentPage --;
        if (currentPage <= 0) {
            throw new PageNotFoundException("There is no previous page.");
        }
        return getCurrentPage();
    }

    /**
     * Checks if it exists a next page
     * @return boolean true if exists otherwise fault
     */
    public boolean hasNext () {
        return !arlist.subList(currentPage*pageSize, (currentPage + 1)*pageSize).isEmpty();
    }

    /**
     * Checks if it exists a previous page
     * @return boolean true if exists otherwise fault
     */
    public boolean hasPrevious () {
        return !arlist.subList((currentPage - 2)*pageSize,(currentPage - 1)*pageSize).isEmpty();
    }

    /**
     * Gets the first page of the page bean
     * @return List a list containing the first page
     */
    public List<String> firstPage () {
        return this.arlist.subList( 0, pageSize );
    }

    /**
     * Gets the last page of the page bean
     * @return List a list containing the last page
     */
    public List<String> lastPage () {
        return this.arlist.subList(pageSize*(this.arlist.size()/pageSize), arlist.size());
    }

    /**
     * Gets the current page number
     * @return int current page number
     */
    public int getCurrentPageNumber () {
        return currentPage;
    }

    /**
     * Gets the current page
     * @return List a list containing the current page
     */
    public List<String> getCurrentPage () {
        return this.arlist.subList((currentPage - 1)*pageSize, currentPage*pageSize);
    }
}
