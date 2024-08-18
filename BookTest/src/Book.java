public class Book {
    String title;
    String author;
    long ISBN;
    boolean available;

    public Book(String title,String author,long ISBN,boolean available){
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
        this.available=available;
    }

    public void borrowingBooks(){
        if(available==true){
            available=false;
            System.out.println("The  book has been borrowed successfully");
        }
        else{
            System.out.println("Book not available");
        }
    }
    public void ReturningBook(){
        if(available==false){
            available=true;
            System.out.println("The book has been returned to the library");
        }
        else{
            System.out.println("The book is already available in the library");
        }

    }
    public void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("ISBN: "+ISBN);
        System.out.println("Availability status: "+available);
    }
}
