public class Book {
    String title;
    String author;
    int pages;
    int pageDay;
    int time;
    String genre;


    Book(String title, String author, int pages, int pageDay, String genre) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.pageDay = 25;
        this.genre = genre;
    }

    void readTime() {
        time = pages / pageDay;
    }
    void checkGenre(){
    if (genre == "Fantasy")
    {
        System.out.println("It's not a Fantasy book");
    }
    else {
        System.out.println("Genre: Fantasy");
    }
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", pageDay=" + pageDay +
                ", time=" + time + " Day" +
                ", genre='" + genre + '\'' +
                '}';
    }
}
