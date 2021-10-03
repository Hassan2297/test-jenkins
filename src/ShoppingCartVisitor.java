/**
 * @author Hassan Wael
 */
public interface ShoppingCartVisitor {
    int visitMobileCost(Mobile mobile);
    int visitBookCost(Book book);
}
