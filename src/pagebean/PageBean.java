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

    public List next () {
        currentPage ++;
        if (currentPage*pageSize > arlist.size()) {
            return lastPage();
        }
        return getCurrentPage();
    }

    public List previous () throws RuntimeException {
        currentPage --;
        if (currentPage <= 0) {
            throw new PageNotFoundException("There is no previous page.");
        }
        return getCurrentPage();
    }

    public boolean hasNext () {
        return !arlist.subList(currentPage*pageSize, (currentPage + 1)*pageSize).isEmpty();
    }

    public boolean hasPrevious () {
        return !arlist.subList((currentPage - 2)*pageSize,(currentPage - 1)*pageSize).isEmpty();
    }

    public List firstPage () {
        return this.arlist.subList( 0, pageSize );
    }

    public List lastPage () {
        return this.arlist.subList(pageSize*(this.arlist.size()/pageSize), arlist.size());
    }

    public int getCurrentPageNumber () {
        return currentPage;
    }

    public List getCurrentPage () {
        return this.arlist.subList((currentPage - 1)*pageSize, currentPage*pageSize);
    }
}
