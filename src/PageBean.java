import java.util.*;

/**
 * Created by clouway on 31.05.16.
 */
public class PageBean {

    private int currentPage = 1;
    private int pageSize = 0;
    private List<String> lnklist;

//    private List<String> formula() {
//        List<String> secondlist = new ArrayList<String>();
//        int next = (currentPage - 1) * pageSize;
//        int nextone = ((currentPage - 1) * pageSize) + pageSize;
//        for (int i = next; i < nextone; i++) {
//            // secondlist.add(lnklist.get(i));
//        }
//
//        int previous = (currentPage - 1) / pageSize;
//
//        int previousone = ((currentPage - 1) / pageSize) + pageSize;
//        return secondlist;
//    }

    public PageBean(List<String> lnklist, int pageSize) {
        this.lnklist = lnklist;
        this.pageSize = pageSize;

    }

    public List<String> next() {
        int next = (currentPage - 1) * pageSize;
        int nextone = ((currentPage - 1) * pageSize) + pageSize;
        currentPage += 1;
        if (nextone > lnklist.size()) {
            nextone = lnklist.size();
        }
        return lnklist.subList(next, nextone);

    }


    public List<String> previous() throws NoPreviousPages {
        int previous = (currentPage - 1) * pageSize - pageSize;
        int previousone = ((currentPage - 1) * pageSize) - (pageSize + pageSize);
        currentPage -= 1;
        if (previousone > lnklist.size()) {
            previousone = lnklist.size();
            return lnklist.subList(previousone, previous);
        } else throw  new NoPreviousPages();
    }


    private String hasNext() {
        String str1 = "We have next elements";
        String str = "We dont have next elements";
        if (pageSize < lnklist.size()) {
            return str1;
        } else {
            return str;
        }

    }


    public String hasPrevious() {
        String str1 = "We have previous elements";
        String str = "There is no previous elements";
        if (lnklist.size() < pageSize) {
            return str1;
        } else {
            return str;
        }
    }

    public List<String> firstPage() {
        currentPage = 1;
        return lnklist.subList(0, pageSize);
    }

    public List<String> lastPage() {
        if (pageSize > lnklist.size()) {
            return lnklist.subList(0, lnklist.size());
        }
        currentPage = lnklist.size() / pageSize;
        if (lnklist.size() % pageSize == 0) {
            return lnklist.subList(currentPage * pageSize - pageSize, lnklist.size());
        } else {
            return lnklist.subList(currentPage * pageSize, lnklist.size());
        }
    }

    public int getCurrentPageNumber() {
        return 2;
    }
}
