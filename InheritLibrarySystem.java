class LibraryItem {
    private String title;
    protected String author;
    private String itemId;

    public void setTitle(String title) 
    {
        this.title = title;
    }
    public void setItemId(String itemId)
    {
        this.itemId = itemId;
    }

   
    public String getTitle() 
    {
        return title;
    }

    public String getItemId() 
    {
        return itemId;
    }
}


class Book extends LibraryItem 
{
    private int pages;

    public void setPages(int pages) 
    {
        this.pages = pages;
    }

    public void displayDetails() 
    {
        System.out.println(" Book Title: " + getTitle());
        System.out.println(" Author: " + author);
        System.out.println(" Book ID: " + getItemId());
        System.out.println(" Pages: " + pages);
    }
}


public class InheritLibrarySystem
{
    public static void main(String[] args) 
    {
        Book b1 = new Book();

        b1.setTitle("Veera Java");
        b1.author="veera Narayana";
        b1.setItemId("B10109");
        b1.setPages(300);

        b1.displayDetails();
    }
}
