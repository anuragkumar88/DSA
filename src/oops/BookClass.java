//Create a Book Class
//
//title, author, price, description,
//published year, publisher name
package oops;

public class BookClass {
    String title;
    String author;
    Double price;
    String description;
    int publish_year;
    String publisher_name;


public BookClass(String title , String author , Double price , String description , int publish_year, String publish_name) {
    this.title = title;
    this.author=author;
    this.price=price;
    this.description= description;
    this.publish_year=publish_year;
    this.publisher_name= publish_name;

}
public BookClass(){

}
}
