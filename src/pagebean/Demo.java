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
        String next = "next";
        String prev = "prev";
        String first = "first";
        String last = "last";
        String curr = "curr";
        List<String> list = new LinkedList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        list.add("Fifth");
        list.add("Sixth");
        list.add("Seventh");
        list.add("Eighth");
        PageBean pb = new PageBean(list,3);
        while (true){
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            if (s.equals(next)){
                System.out.println(pb.next());
            }
            if (s.equals(prev)){
                System.out.println(pb.previous());
            }
            if (s.equals(first)){
                System.out.println(pb.firstPage());
            }
            if (s.equals(last)){
                System.out.println(pb.lastPage());
            }
            if (s.equals(curr)){
                System.out.println(pb.getCurrentPageNumber());
            }
        }
    }
}
