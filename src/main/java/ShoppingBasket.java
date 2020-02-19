import java.util.ArrayList;

public class ShoppingBasket {
    private ArrayList<Item> items;
    private ArrayList<IDiscount> discounts;
    private double subTotal;

    public ShoppingBasket(){
        this.items = new ArrayList<Item>();
        this.discounts = new ArrayList<IDiscount>();
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

    public void addNewDiscount(IDiscount discount) {
        this.discounts.add(discount);
    }

    public int getNumberOfDiscounts() {
        return this.discounts.size();
    }

    public double calculateApplicableDiscounts() {
        double totalDiscount = 0;
        for (IDiscount discount : this.discounts){
            totalDiscount += discount.calculateDiscount(this.items);
        }
        return totalDiscount;
    }
}
