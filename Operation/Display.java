package Operation;

import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: asus
 * Date: 2020-04-06
 * Time: 16:14
 */
public class Display implements IOopretation {
    @Override
    public void work(BookList bookList) {
        System.out.println("显示图书");
        for (int i = 0; i <bookList.getUsedSize() ; i++) {
            System.out.println(bookList.getBook(i));

        }
    }
}
