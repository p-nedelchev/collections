package pagebean;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PageBean<Page> page = new PageBean<>(2);
        page.add(new Page("page1", 1));
        page.add(new Page("page2", 2));
        page.add(new Page("page3", 3));
        page.add(new Page("page4", 4));
        page.add(new Page("Page5", 5));
        page.add(new Page("Page6", 6));
        page.add(new Page("Page7", 7));

        String enter;
        System.out.println("Available commands: next, previous, first, last, hasNext, hasPrevious, currentPage!"
                + "\n" + "Enter command: ");
        /**
         * here start the loop when we enter commands to call respectively
         * methods for command
         */

        while (scan.hasNextLine()) {
            enter = scan.nextLine();
            if (enter.equals(".")) {
                break;
            }
            if (enter.equals("next")) {
                try {
                    System.out.println(page.next());
                } catch (NoMorePagesException e) {
                    System.out.println("No more pages left!");
                }

            }
            if (enter.equals("previous")) {
                try {
                    System.out.println(page.previous());
                } catch (NoMorePagesException ex) {
                    System.out.println("No more pages left!");
                }
            }
            if (enter.equals("first")) {
                System.out.println(page.firstPage());
            }
            if (enter.equals("last")) {
                System.out.println(page.lastPage());
            }
            if (enter.equals("hasNext")) {
                System.out.println(page.hasNext());
            }
            if (enter.equals("hasPrevious")) {
                System.out.println(page.hasPrevious());
            }
            if (enter.equals("currentPage")) {
                System.out.println(page.getCurrentPage());
            }
        }
    }
}


