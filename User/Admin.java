package User;

import Operation.*;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: asus
 * Date: 2020-04-06
 * Time: 16:37
 */
public class Admin extends User {
    public Admin (String name) {
        super(name);

        this.Operations =new IOopretation[] {
                new Exit(),
                new Find(),
                new Add(),
                new Del(),
                new Display(),

        };
    }

    public int menu () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hello"+this.name+"欢迎来到小图书系统");
        System.out.println("1.查找");
        System.out.println("2.新增");
        System.out.println("3.删除");
        System.out.println("4.打印");
        System.out.println("0.退出");
        int choice = scanner.nextInt();
        return choice;

    }
}
