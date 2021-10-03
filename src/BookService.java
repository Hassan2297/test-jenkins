/**
 * @author Hassan Wael
 */
public class BookService implements ItemElement {

    private Book book = null;

    public void createBookItem(Book book){
        this.book = new Book(book.getPrice(),book.getIsbnNumber());
    }

    @Override
    public int accept(ShoppingCartVisitor cartVisitor) {
        return cartVisitor.visitBookCost(book);
    }
}
