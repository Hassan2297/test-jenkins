/**
 * @author Hassan Wael
 */
public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {
    @Override
    public int visitMobileCost(Mobile mobile) {
        int cost = mobile.getPrice()*10;
        System.out.println(mobile.getMobileType() + " cost = "+cost);
        return cost;
    }

    @Override
    public int visitBookCost(Book book) {
        int cost=0;
        if(book.getPrice() > 50){
            cost = book.getPrice()-5;
        }else cost = book.getPrice();
        System.out.println("Book ISBN::"+book.getIsbnNumber() + " cost ="+cost);
        return cost;
    }
}
