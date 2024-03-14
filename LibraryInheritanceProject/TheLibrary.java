//This one was hard had to do reading in PDF 482-495 (Chapter 9)
//and looking at method overriding in Oracle Documentation: https://docs.oracle.com/javase/tutorial/java/IandI/override.html
public class TheLibrary extends Book
{
    public TheLibrary()
    {
        super();
    }
    public TheLibrary(String title, String author)
    {
        super(title, author);
    }
    public void bookMutator(String title, String author)
    {
        super.bookMutator(title, author);
    }
    public String get_title()
    {
        return "Reversing Hermon: Enoch, the Watchers, and the Forgotten Mission of Jesus Christ";//Overriding title return;
    }
    public String get_author()
    {
        return "Michael S. Heiser";//Overriding author return;
    }

}