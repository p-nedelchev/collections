import java.util.LinkedList;
import java.util.List;

/**
 * Created by clouway on 30.05.16.
 */
public class Demo {
    public static void main(String[] args) {
        List<String> lnklist = new LinkedList<String>();
        lnklist.add("-1");
        lnklist.add("0");
        lnklist.add("1");
        lnklist.add("2");
        lnklist.add("3");
        lnklist.add("4");
        lnklist.add("5");
        lnklist.add("6");
        lnklist.add("7");
        lnklist.add("8");
        lnklist.add("9");
        lnklist.add("10");
        PageBean pageBean = new PageBean(lnklist,5,3);
        System.out.println(pageBean.next(2));
        System.out.println(pageBean.previous(2));
        System.out.println(pageBean.hasPrevious());
        System.out.println(pageBean.hasNext());
        System.out.println(pageBean.firstPage());
        System.out.println(pageBean.getCurrentPageNumber());
        System.out.println(pageBean.lastPage());







    }
}
