package src.com.clouway.collections.pagebean;

import java.util.Scanner;

public class Demo {
  public static void main(String[] args) throws PreviousPageNotFoundException, NextPageNotFoundException {
    PageBean pb = new PageBean();
    String str = "Not to mention rumours which agitated the maritime population and excited the public mind.";
    System.out.println("Enter Page size.");
    Scanner sc = new Scanner(System.in);
    int pageSize = sc.nextInt();
    pb.add(str, pageSize);
    System.out.println(pb.next());
    System.out.println("\"x\" - exit,\"n\" - next, \"p\" - previous,\"f\" - first page, \"l\" - last page, \"#\" - page number.");
    while (true) {
      String s = sc.nextLine();
      if (s.equals("n")) {
        System.out.println(pb.next());
      }
      if (s.equals("p")) {
        System.out.println(pb.previous());
      }
      if (s.equals("f")) {
        System.out.println(pb.firstPage());
      }
      if (s.equals("l")) {
        System.out.println(pb.lastPage());
      }
      if (s.equals("#")) {
        System.out.println("Page " + pb.getCurrentPageNumber());
      }
      if (s.equals("x")) {
        break;
      }
    }
  }
}


