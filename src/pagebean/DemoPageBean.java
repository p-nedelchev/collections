package pagebean;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Vasil Mitov (v.mitov.clouway@gmail.com)
 */
public class DemoPageBean {
  public static void main(String[] args) throws NoPreviousPage, NoNextPage {
    LinkedList<Object> people = new LinkedList<>();
    Person p1 = new Person("Vasil", 25);
    Person p2 = new Person("Denis", 22);
    Person p3 = new Person("Sasho", 26);
    Person p4 = new Person("Martin", 23);
    Person p5 = new Person("Ivan", 25);
    Person p6 = new Person("Sasho", 24);
    Person p7 = new Person("Krasimir", 24);
    Person p8 = new Person("Kristian", 25);
    people.add(p1);
    people.add(p2);
    people.add(p3);
    people.add(p4);
    people.add(p5);
    people.add(p6);
    people.add(p7);
    people.add(p8);
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of elements on a page:");
    Integer numberofelementsonpage = sc.nextInt();
    PageBean demo = new PageBean(numberofelementsonpage, people);

    while (true) {
      Scanner choicesc = new Scanner(System.in);
      System.out.println("Enter choice or help for help:");
      String choise = choicesc.nextLine();
      if (choise.equals("help")) {
        System.out.println("Choices \n next:  Displays next page(If there is one)\n previous:  Displays previous page(If there is one)\n first:  Displays first page\n last:  Displays last page\n page:  Displays page number\n exit:  End for the program");
      }
      if (choise.equals("next")) {
        if (demo.hasNext()) {
          System.out.println(demo.next());
        } else throw new NoNextPage();
      }
      if (choise.equals("previous")) {
        if (demo.hasPrevious()) {
          System.out.println(demo.previous());
        } else {
          throw new NoPreviousPage();
        }
        continue;

      }
      if (choise.equals("first")) {
        System.out.println(demo.firstPage());
      }
      if (choise.equals("last")) {
        System.out.println(demo.lastPage());
      }

      if (choise.equals("page")) {
        System.out.println(demo.getCurrentPageNumber());
      }
      if (!choise.equals("help") && !choise.equals("next") && !choise.equals("previous") && !choise.equals("first") && !choise.equals("last") && !choise.equals("page")) {
        System.out.println("Invalid choice. Reenter: ");
      }
      if (choise.equals("exit")) {
        break;
      }
    }
  }
}


