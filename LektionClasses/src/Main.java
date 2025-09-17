//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Book newBook = new Book("Harry Potter and the Chambers of Secrets", "J.K Rowling", 341, 25, "Fantasy");
        Book newBook1 = new Book("The Shining", "Stephen King", 447, 25,"Fantasy");
        Book newBook2 = new Book("Journey to the west", "Wu Cheng'en", 2400, 25, "Roman");
        Book newBook3 = new Book("Lord of The Rings", "J.R.R. Tolkien", 1178, 25,"Fantasy");

        newBook.readTime();
        newBook1.readTime();
        newBook2.readTime();
        newBook3.readTime();


        System.out.println(newBook);
        newBook.checkGenre();

        System.out.println(newBook1);
        newBook1.checkGenre();

        System.out.println(newBook2);
        newBook2.checkGenre();

        System.out.println(newBook3);
        newBook3.checkGenre();


    }
}