
import com.google.common.collect.Lists;

import java.util.List;
import java.util.Scanner;


/**
 * Created by clouway on 06.06.16.
 *
 * @author alexandervladimirov1902@gmail.com
 *         (Alexander Vladimirov)
 */
public class Demo {
  public static void main(String[] args) {
    List<Object> list = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
    Scanner input = new Scanner(System.in);
    System.out.println("Input size of page: ");
    input.hasNext();
    PageBean pageBean = new PageBean(list, input.nextInt());
    System.out.println("Type hlp for help: ");
    while (true){

      String executeSymbol = input.nextLine();
      if(executeSymbol.equals("hlp")){
        System.out.println("fst = first page.\nlst = last page.\nnxt = next page.\nprvs = previous page.\n" +
                "hsnxt = has next page.\nhsprvs = has previous page.\nkll = to exit program.");
      }
      if(executeSymbol.equals("fst")){
        System.out.println(pageBean.firstPage());
      }
        if (executeSymbol.equals("lst")){
          System.out.println(pageBean.lastPage());
        }
          if(executeSymbol.equals("nxt")){
            System.out.println(pageBean.next());
      }
      if( executeSymbol.equals("prvs")){
        System.out.println(pageBean.previous());
      }
      if (executeSymbol.equals("hsnxt")){
        System.out.println(pageBean.hasNext());
      }
      if(executeSymbol.equals("hsprvs")){
        System.out.println(pageBean.hasPrevious());
      }
      if(executeSymbol.equals("kll")){
        break;
      }
    }
  }
}
