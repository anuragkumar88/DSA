package oops;

public class BookModels {
    public static void main(String[] args) {
        System.out.println("book 1");

        BookClass book1 = new BookClass("The Alchemist", " Paulo Coelho", 350.00, "A journey of self-discovery", 1998, "HarperCollins");
        System.out.println(book1.title);
        System.out.println(book1.author);
        System.out.println(book1.description);
        System.out.println(book1.price);
        System.out.println(book1.publish_year);
        System.out.println(book1.publisher_name);

        BookClass book2 = new BookClass("To Kill a Mockingbird", " Harper Lee", 390.00, "A novel on racial injustice", 1960, "J.B. Lippincott & Co.");
        System.out.println(book2.title);
        System.out.println(book2.author);
        System.out.println(book2.description);
        System.out.println(book2.price);
        System.out.println(book2.publish_year);
        System.out.println(book2.publisher_name);

        BookClass book3 = new BookClass("1984", " George Orwell", 350.00, "A dystopian social science fiction novel", 1949, " Secker & Warburg.");
        System.out.println(book3.title);
        System.out.println(book3.author);
        System.out.println(book3.description);
        System.out.println(book3.price);
        System.out.println(book3.publish_year);
        System.out.println(book3.publisher_name);

        BookClass book4 = new BookClass(" The Da Vinci Code", " Dan Brown", 450.00, "A mystery-detective thriller", 2003, " Doubleday.");
        System.out.println(book4.title);
        System.out.println(book4.author);
        System.out.println(book4.description);
        System.out.println(book4.price);
        System.out.println(book4.publish_year);
        System.out.println(book4.publisher_name);

        BookClass book5 = new BookClass(" Wings of Fire","Dr. A.P.J. Abdul Kalam",299.00,"Autobiography of India's Missile Man",1999,"Universities Press");
        System.out.println(book5.title);
        System.out.println(book5.author);
        System.out.println(book5.description);
        System.out.println(book5.price);
        System.out.println(book5.publish_year);
        System.out.println(book5.publisher_name);


    }
    public BookModels(){

    }
}
