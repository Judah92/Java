import java.util.ArrayList;
import java.util.Scanner;



public class Main_Book
{
    public static void main(String[]args)
    {
        Book firstBook = new Book(); //default constructor.
        Book secondBook = new Book("Supernatural: What the Bible Teaches About the Unseen World - and Why It Matters", "Michael Heiser");//Value Pass Constructor: BookTitle, BookAuthor
        TheLibrary moreBooks = new TheLibrary(); //TheLibrary object instantiated 
        Book thirdBook = new TheLibrary(); //Book object instantiated as TheLibrary allowing for default overriding of Class Book return values.

        System.out.println("Book Title: " + firstBook.get_title() + ". And the " + "Book Author: " + firstBook.get_author());//Printing  Book Object 1 firstBook with default values returns
        System.out.println("Book Title: " + secondBook.get_title() + ". And the " + "Book Author: " + secondBook.get_author());//Printing Book Object 2 secondBook with Value Pass returns
        System.out.println("Book Title: " + moreBooks.get_title() + ". And the " + "Book Author: " + moreBooks.get_author()); //Printing TheLibrary Object 1 moreBooks which returns the subclass (TheLibrary) return values.
        System.out.println("Book Title: " + thirdBook.get_title() + ". And the " + "Book Author: " + thirdBook.get_author()); //Printing Book object 3 thirdBook using overriding to return the subclass (TheLibrary) return values.

        ArrayList<Book> bookList = new ArrayList<Book>();//New ArrayList to object of Book to.
        bookList.add(firstBook);//Adding firstBook to indice 0 because using bookList.add(1, firstBook) throws an error.
        
    }
}