/**
 * @author Hassan Wael
 */
public class Book {
    private int price;
    private String isbnNumber;

    public Book() {
    }

    public Book(int cost, String isbn){
        this.price=cost;
        this.isbnNumber=isbn;
    }

    public int getPrice() {
        return price;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    @Override
    public String toString() {
        return "Book{" +
                "price=" + price +
                ", isbnNumber='" + isbnNumber + '\'' +
                '}';
    }


}
