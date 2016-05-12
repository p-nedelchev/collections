package pagebean;

import java.util.Scanner;

/**
 * @author Vasil Mitov (v.mitov.clouway@gmail.com)
 */
public class DemoPageBean {
  public static void main(String[] args) throws NoPreviousPage {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter string to be distributed to pages:");
    String string = sc.nextLine();
    System.out.println("Enter number of elements on a page:");
    Integer numberofelements = sc.nextInt();
    PageBean demo = new PageBean(numberofelements, string);
    demo.createPages();

    while (true) {
      Scanner choisesc = new Scanner(System.in);
      System.out.println("Enter choise or help for help:");
      String choise = choisesc.nextLine();
      if (choise.equals("help")) {
        System.out.println("Choises \n next:  Displays next page(If there is one)\n previous:  Displays previous page(If there is one)\n first:  Displays first page\n last:  Displays last page\n page:  Displays page number\n exit:  End for the program");
      }
      if (choise.equals("next")) {
        if (demo.hasNext()) {
          System.out.println(demo.next());
        } else System.out.println("No next page.Input another choise:");
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
        System.out.println("Invalid choise. Reenter:git ");
      }
      if (choise.equals("exit")) {
        break;
      }

    }
  }
}

