import java.util.Iterator;

public class Main{
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBooks(new Book("book1"));
        bookShelf.appendBooks(new Book("book2"));
        bookShelf.appendBooks(new Book("book3"));
        bookShelf.appendBooks(new Book("book3"));
        bookShelf.appendBooks(new Book("book3"));
        bookShelf.appendBooks(new Book("book3"));
        bookShelf.appendBooks(new Book("book3"));
        
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()){
            Book book = it.next();
            System.out.println(book.getName());
        }
        System.out.println();
    
        for (Book book: bookShelf){
            System.out.println(book.getName());
        }
        System.out.println();
    }
}