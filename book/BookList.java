package book;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: asus
 * Date: 2020-04-06
 * Time: 16:00
 */
//书架 实质是顺序表
public class BookList {
    private Book[] books ;
    private  int usedSize;
//设置get set方法
    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    public  Book getBook(int pos) {
        return books[pos];
    }
    public void setBooks(int pos,Book book) {
        this.books[pos] = book;
    }
//初始化 放进去四本书
    public BookList () {//构造方法
        this.books = new Book[10];
        this.usedSize = 0;
        this.books[0] = new Book("小学数学","数学老师1",10,"初级学习");
        this.books[1] = new Book("中学数学","数学老师2",20,"中级学习");
        this.books[2] = new Book("大学数学","数学老师3",30,"高级学习");
        this.books[3] = new Book("数学","数学老师4",50,"学习");
        this.usedSize = 4;
    }
}
