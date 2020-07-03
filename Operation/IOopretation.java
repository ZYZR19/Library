package Operation;

import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: asus
 * Date: 2020-04-06
 * Time: 16:18
 */
//因为所有操作都在BookList里面 所以增加一个接口
public interface IOopretation {
    void work (BookList bookList);//抽象
}
