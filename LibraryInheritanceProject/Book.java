
public class Book
{
    private String bookTitle; //declaring variables
    private String bookAuthor;

    public Book() //default constructor
    {             //Initializing variables with default values
        bookTitle = "The Unseen Realm: Recovering the Supernatural Worldview of the Bible";//initializing variables
        bookAuthor = "Michael Heiser";
    }
    public Book(String title, String author)//value pass constructor
    {
        bookTitle = title;
        bookAuthor = author;
    }
    public void bookMutator(String title, String author)//Mutator to adjust values
    {
        bookTitle = title;
        bookAuthor = author;
    }
    public String get_title()//Accessor
    {
        return bookTitle;
    }
    public String get_author()//Accessor
    {
        return bookAuthor;
    }
}