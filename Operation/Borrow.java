package Operation;

import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: asus
 * Date: 2020-04-06
 * Time: 16:15
 */
public class Borrow implements IOopretation{
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅图书");
    }
}
