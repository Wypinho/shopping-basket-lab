import java.util.ArrayList;
import java.util.HashMap;

public class ShoppingBasket {
    private ArrayList<Item> items;
    private double subTotal;

    public ShoppingBasket(){
        this.items = new ArrayList<Item>();
        this.subTotal = 0;
    }

    public int getNumberItems() {
        return this.items.size();
    }

    public double getSubTotal() {
        return this.subTotal;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public void emptyBasket() {
        this.items.clear();
    }

    public void calculateSubTotal(){
        for (Item item : this.items){
            this.subTotal += item.getPrice();
        }

    }
}
