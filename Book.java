package Program4;

public class Book {
    String bookname,author,publisher,yr_of_published;
    float price;

    Book(String bookname,String author,String publisher,String yr_of_published,float price){
        this.bookname=bookname;
        this.author=author;
        this.publisher=publisher;
        this.yr_of_published=yr_of_published;
        this.price=price;
    }
    void display(){
        System.out.println("book name:"+bookname);
        System.out.println("book author:"+author);
        System.out.println("book published:"+publisher);
        System.out.println("book year of published:"+yr_of_published);
        System.out.println("book price:"+price);
    }
    public static void main(String[] args) {
        Book b=new Book("two stangers","misbha","khanpagadi","12-04-2009",500);
        b.display(); 
    }
}
