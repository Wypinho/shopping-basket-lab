import java.util.ArrayList;

public class PercentOffTotal implements IDiscount {
    private double discount;
    private double triggerAmount;

    public PercentOffTotal(double discount, double triggerAmount){
        this.discount = discount / 100;
        this.triggerAmount = triggerAmount;
    }

    public double calculateDiscount(ArrayList<Item> items) {
        double total = 0;
        double discount = 0;
        for (Item item : items){
            total += item.getPrice();
        }
        if (total > this.triggerAmount){
            discount = total * this.discount;
        }
        return discount;
    }
}
