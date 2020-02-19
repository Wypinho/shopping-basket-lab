import java.util.HashMap;

public class ShoppingBasket {
    private HashMap<String, Double> items;
    private double subTotal;

    public ShoppingBasket(){
        this.items = new HashMap();
        this.subTotal = 0;
    }

    public int getNumberItems() {
        return this.items.size();
    }

    public double getSubTotal() {
        return this.subTotal;
    }
}
