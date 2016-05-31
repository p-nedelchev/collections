import javax.swing.text.html.HTMLDocument;
import java.util.*;

/**
 * Created by clouway on 31.05.16.
 */
public class PageBean {


    private int pageSize = 0;
    private List<String> lnklist;
    private int offset = 0;


    public PageBean(List<String> lnklist, int pageSize, int offset) {
        this.lnklist = lnklist;
        this.pageSize = pageSize;
        this.offset = offset;
    }

    public List<String> next(int page) {
        List<String> secondlist = new ArrayList<String>();
        if (((page - 1) * pageSize) + pageSize > lnklist.size()) {
            lnklist.size();
        }
        for (int i = (page - 1) * pageSize; i < ((page - 1) * pageSize) + pageSize; i++) {
            secondlist.add(lnklist.get(i));
        }
        return secondlist;
    }

    public List<String> previous(int page) {
        List<String> secondlist = new ArrayList<String>();
        for (int i = (page - 1) / pageSize; i < ((page - 1) / pageSize) + pageSize; i++) {
            secondlist.add(lnklist.get(i));

        }
        return secondlist;
    }

    public String hasNext() {
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
        if (offset < pageSize) {
            return str1;
        } else {
            return str;
        }
    }

    public String firstPage() {
        String PageNumber = null;
        if(PageNumber == null) {
            PageNumber = "1";
        }
        return PageNumber;
    }
    public String lastPage(){
       String lastPage = String.valueOf(lnklist.subList(0,lnklist.size()/5));
        return lastPage;
    }
    public int getCurrentPageNumber(){
        int PageNumber = 0;

        if(PageNumber == 0) {
        }
        return 0;
    }

}
