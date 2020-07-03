package User;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: asus
 * Date: 2020-04-06
 * Time: 16:49
 */
public class Main {
    public static User login () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入姓名");
        String name = scanner.nextLine();
        System.out.println("您的身份是？  1： 管理员  0：用户");
        int num = scanner.nextInt();
        if (num ==1) {
            return new Admin(name);
        }else {
            return new Normal(name);
        }

    }
    public static void main(String[] args) {
        BookList bookList = new BookList();

        User user = login();
        while (true) {
            int choice = user.menu();

            user.doOperation(choice, bookList);
        }
    }

}
