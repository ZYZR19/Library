package User;

import Operation.IOopretation;
import book.BookList;
import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;

import javax.xml.namespace.QName;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: asus
 * Date: 2020-04-06
 * Time: 16:37
 */
abstract public class User {
    public String name;
    public IOopretation [] Operations;
    public User(String name) {
        this.name =name ;
    }
    public abstract int menu();
    public void doOperation(int choice, BookList bookList) {
        //通过点好调用对应的方法
        Operations[choice].work(bookList);

    }
}
