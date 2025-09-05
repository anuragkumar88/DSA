package oops;

public class Book1 {
    public static void main(String[] args) {
      Book  Book1 = new Book ("dark_souls", "Miyazaki", 1999, "fictional story", 2014, "Fromsoftware");
        System.out.println(Book1.title);
        System.out.println(Book1.author);
        System.out.println(Book1.price);
        System.out.println(Book1.description);
        System.out.println(Book1.publish_year);
        System.out.println(Book1.publisher_name);
    }

}
