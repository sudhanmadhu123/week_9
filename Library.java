import java.util.*;
class Book{
  private String title,author,publisher;
  private int bookNo;
Book(String title,String author,String opublisher,int bookNo){
  setTitle(title);
  setAuthor(author);
  setPublisher(publisher);
  setBookNo(bookno);
}
  void setTitle(String title){
    this.title=title;
  }
  void setAuthor(String author){
    this.author=author;
  }
  void setPublisher(String publisher){
    this.publisher=publisher;
  
  }
  void setBookNo(int bookNo){
        this.bNo = bNo;
    }

 

    String getTitle() {
        return title;
    }

 

    String getAuthor() {
        return author;
    }

 

    String getPublisher() {
        return publisher;
    }

 

    int getBNo() {
        return bNo;
    }
}

 

public class Library {
    public static void main(String[] ars) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<Book>();

 

        for (int i = 0; i < 5; i++) {
            books.add(new Book(sc.next(), sc.next(), sc.next(), sc.nextInt()));
        }

 

        for (Book book : books) {
            System.out.println(
                    book.getBNo() + " " + book.getTitle() + " " + book.getAuthor() + " " + book.getPublisher());
        }
    }
  }
}

}