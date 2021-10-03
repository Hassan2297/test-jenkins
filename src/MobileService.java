/**
 * @author Hassan Wael
 */
public class MobileService implements ItemElement {

    private Mobile mobile = null;

    public void createMobileItem(Mobile mobile){
        this.mobile = new Mobile(mobile.getMobileType(), mobile.getPrice());
    }

    @Override
    public int accept(ShoppingCartVisitor cartVisitor) {
        return cartVisitor.visitMobileCost(mobile);
    }
}
