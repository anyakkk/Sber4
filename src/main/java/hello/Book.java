package hello;

class Book{
    private String nameAuthor;
    private String nameBook;
    private String year;
    private static int maxId = 0;
    private int id = maxId++;

    public Book(String nameAuthor, String nameBook, String year) {
        this.nameAuthor = nameAuthor;
        this.nameBook = nameBook;
        this.year = year;

    }

    public Integer getId() {
        return id;
    }



    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}