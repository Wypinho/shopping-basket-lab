import java.util.ArrayList;
import java.util.HashMap;

public class BOGOF implements IDiscount {
    private ArrayList<Item> items;
    private HashMap<String, Integer> itemCount;
    private HashMap<String, Integer> multipleItems;

    public BOGOF(){
        items = new ArrayList<Item>();
        itemCount = new HashMap<String, Integer>();
        multipleItems = new HashMap<String, Integer>();
    }

    public double calculateDiscount(ArrayList<Item> items) {
        this.items = items;
        this.createHashMap();
        this.findDuplicates();
        return 0;
    }

    private void findDuplicates() {
        for (Integer quantity : this.itemCount.values());
            if
    }

    private void createHashMap() {
        for (Item item : this.items){
            if (itemCount.containsKey(item.getName())){
                int itemNumber = itemCount.get(item.getName());
                itemNumber += 1;
                itemCount.put(item.getName(), itemNumber);
            } else {
                itemCount.put(item.getName(), 1);
            }
        }
    }
}
