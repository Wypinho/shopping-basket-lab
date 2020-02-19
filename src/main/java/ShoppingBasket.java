import java.util.HashMap;

public class ShoppingBasket {
    private HashMap<String, Double> items;
//    refactor to subtotal
    private double total;

    public ShoppingBasket(){
        this.items = new HashMap();
        this.total = 0;
    }


    public int getNumberItems() {
        return this.items.size();
    }
}
