package firsttask;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by clouway on 30.05.16.
 */
public class Demo {
    public static void main(String[] args) throws NoPreviousPagesFoundException ,NoNextPagesFoundException{
        List<String> lnklist = new LinkedList<String>();

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
        PageBean pageBean = new PageBean(lnklist, 7);

        Scanner in = new Scanner(System.in);
        while (true) {
            if (!in.hasNextInt()) {
                if (in.next().equals("n")) {
                    System.out.println(pageBean.next());

                }
            } else {

            }
            if (in.next().equals("p")) {
                System.out.println(pageBean.previous());
            } else {

            }
        }
    }


}

