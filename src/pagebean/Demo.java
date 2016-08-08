package pagebean;

import java.util.ArrayList;
import java.util.Scanner;
import com.google.common.collect.Lists;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list;
        list = Lists.newArrayList("5","13","51","8","34","15","14","98","10","26");
        PageBean pageBean = new PageBean(list, 3);
        while (true){
            String command = scanner.nextLine();
            if(command.equals("next")) {
                pageBean.next().stream().forEach(e -> System.out.println(e));
            }
            if(command.equals("previous")){
                pageBean.previous().stream().forEach(e -> System.out.println(e));
            }
        }
    }
}
