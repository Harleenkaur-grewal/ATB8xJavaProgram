package Oct.ex_14102024;

/*Book class which has an abstract method getDetails(),name, author, price.
PrintMyBook class that inherits from the Book class.
abstract Book myBook = new PrintMyBook("Harry Potter", "J.k. Rowling", "120");
Output "Harry Potter, J.k. Rowling, 100"*/
abstract class Book {
    String name;
    String author;
    int price;

    public Book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
   /* declaring a method as abstract, means
    subclasses must provide the specific implementation of that method.*/
    abstract void getDetails();


}
