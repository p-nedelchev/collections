package pagebean;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        list.add("5");
        list.add("4");
        list.add("2");
        list.add("52");
        list.add("12");
        list.add("6");
        list.add("89");
        list.add("32");
        list.add("65");
        list.add("16");
        list.add("9");
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
