package Operation;

import book.Book;
import book.BookList;
import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;
import sun.nio.cs.ext.ISO2022_CN_CNS;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: asus
 * Date: 2020-04-06
 * Time: 16:13
 */
//实现接口并重写work方法
public class Add implements IOopretation{
    @Override
    public void work(BookList bookList) {
        System.out.println("新增图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入图书的名字");
        String name = scanner.nextLine();
        System.out.println("请输入图书的作者");
        String author = scanner.nextLine();
        System.out.println("请输入图书的价格");
        int price = scanner.nextInt();
        System.out.println("请输入图书的类型");
        String type = scanner.next();

        Book book = new Book(name,author,price,type);

        int curSize = bookList.getUsedSize();
        bookList.setBooks(curSize,book);
        bookList.setUsedSize(curSize+1);

        System.out.println("新增图书成功！！");
    }
}
