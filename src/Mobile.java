/**
 * @author Hassan Wael
 */
public class Mobile {
    private String mobileType;
    private int price;

    public Mobile() {
    }

    public Mobile(String mobileType, int price) {
        this.mobileType = mobileType;
        this.price = price;
    }

    public String getMobileType() {
        return mobileType;
    }

    public void setMobileType(String mobileType) {
        this.mobileType = mobileType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "mobileType='" + mobileType + '\'' +
                ", price=" + price +
                '}';
    }
}
