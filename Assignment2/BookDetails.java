package Assignment2;
class Book{
    int bookId;
    String bookTitle;
    String author;
    public Book(int bookId,String bookTitle,String author){
        this.bookId=bookId;
        this.bookTitle=bookTitle;
        this.author=author;
    }
    public void getDetails(){
        System.out.println("Book id:"+bookId);
        System.out.println("Book title:"+bookTitle);
        System.out.println("Author:"+author);
    }
}
public class BookDetails {
    public static void main(String[] args) {
        Book book1=new Book(1,"Books Lovers","Emily Henry");
        book1.getDetails();
    }
}
