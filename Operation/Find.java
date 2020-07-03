package Operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: asus
 * Date: 2020-04-06
 * Time: 16:13
 */
public class Find implements IOopretation {
    @Override
    public void work(BookList bookList) {
        System.out.println("寻找图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入书籍名称");
        String name = scanner.nextLine();
        for (int i = 0;i<bookList.getUsedSize();i++) {
            Book book = bookList.getBook(i);
           if (bookList.getBook(i).getName().equals(name)) {
               System.out.println(book);
               System.out.println("找到了！！");
               return;
           }
        }
        System.out.println("不好意思，没有这本书！");
    }
}
