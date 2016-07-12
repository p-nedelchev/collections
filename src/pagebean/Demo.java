package pagebean;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by clouway on 08.07.16.
 *
 * @author Denis Dimitrov(@denis.k.dimitrov@gmail.com)
 */
public class Demo {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        list.add("Fifth");
        list.add("Sixth");
        list.add("Seventh");
        list.add("Eighth");
        PageBean pb = new PageBean(list, 3);
        System.out.println("Commands: next, prev, first, last, curr");
        System.out.println("'next' for the next page.");
        System.out.println("'prev' for the previous page.");
        System.out.println("'first' for the first page.");
        System.out.println("'last' for the last page.");
        System.out.println("'curr' for the current page number.");
        while (true) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            switch (s.toLowerCase()) {
                case "first":
                    System.out.println(pb.firstPage());
                    break;
                case "last":
                    System.out.println(pb.lastPage());
                    break;
                case "curr":
                    System.out.println("You are at page: " + (pb.getCurrentPageNumber() + 1) + " out of 3");
                    break;
                case "next":
                    System.out.println(pb.next());
                    break;
                case "prev":
                    System.out.println(pb.previous());
                    break;
                default:
                    System.out.println("Wrong command");
                    break;
            }
        }
    }
}
