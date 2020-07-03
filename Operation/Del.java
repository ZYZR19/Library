package Operation;

import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: asus
 * Date: 2020-04-06
 * Time: 16:13
 */
public class Del implements IOopretation{
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书");
        System.out.println("请输入你要删除的书籍：");

    }
}
