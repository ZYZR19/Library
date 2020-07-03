package User;

import Operation.*;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: asus
 * Date: 2020-04-06
 * Time: 16:35
 */
public class Normal extends User {
    public Normal(String name) {
        super(name);
        //数组存储普通用户的对应操作
        this.Operations =new IOopretation[] {
                new Exit() ,
                new Find(),
                new Borrow(),
                new Return(),

        };
    }

    public int menu () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hello"+this.name+"欢迎来到小图书系统");
        System.out.println("1.查找");
        System.out.println("2.借阅");
        System.out.println("3.归还");
        System.out.println("0.退出");
        int choice = scanner.nextInt();
        return choice;

    }
}
