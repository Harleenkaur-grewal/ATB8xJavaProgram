package Oct.ex_14102024;

// Concrete class that extends Book
public class PrintMyBook extends Book{
    public PrintMyBook(String name, String author, int price) {
        super(name, author, price); //calling the parent Book class
    }
    // Implementation of the abstract method to print book details
    @Override
    void getDetails() {
        System.out.println("Book Name =" +name+ ", Author Name =" +author+ ", Price =" +price);
    }
}
