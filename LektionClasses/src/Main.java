import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Book newBook = new Book("Harry Potter and the Chambers of Secrets", "J.K Rowling", 341, 25, "Fantasy");
        Book newBook1 = new Book("The Shining", "Stephen King", 447, 25, "Fantasy");
        Book newBook2 = new Book("Journey to the west", "Wu Cheng'en", 2400, 25, "Roman");
        Book newBook3 = new Book("Lord of The Rings", "J.R.R. Tolkien", 1178, 25, "Fantasy");

        newBook.readTime();
        newBook1.readTime();
        newBook2.readTime();
        newBook3.readTime();


        System.out.println(newBook);
        newBook.checkGenre();
        System.out.println("-------------------------------");
        System.out.println(newBook1);
        newBook1.checkGenre();
        System.out.println("-------------------------------");
        System.out.println(newBook2);
        newBook2.checkGenre();
        System.out.println("-------------------------------");
        System.out.println(newBook3);
        newBook3.checkGenre();
        System.out.println("-------------------------------");

        // Detta var sjukt svårt jag blanda ihop metod och konstruktion
        compare(newBook, newBook2);



    }
    // Understanding what static meant
    // https://stackoverflow.com/questions/2649213/in-laymans-terms-what-does-static-mean-in-java
    // Detta var sjukt svårt jag blanda ihop metod och konstruktor så vart fel väldigt länge
    //Men tills slut löste det sig.

    public static void compare(Book aBook, Book aBook2){
    if (aBook.pages > aBook2.pages)
    {
        System.out.println(aBook.title + " has more pages than " + aBook2.title);
    } else if (aBook.pages < aBook2.pages) {
        System.out.println(aBook.title + " has fewer pages than " + aBook2.title);
    }
    else {
        System.out.println("Somethings went wrong...");

    }
    }
}