import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShoppingBasketTest {
    ShoppingBasket shoppingBasket;
    Item item;
    Item item2;
    PercentOffTotal percentOffTotal;

    @Before
    public void before(){
        shoppingBasket = new ShoppingBasket();
        item = new Item("Biscuits", 1.50);
        item2 = new Item("Whisky", 20.01);
        percentOffTotal = new PercentOffTotal(10, 20.00);
    }

    @Test
    public void startsEmpty(){
        assertEquals(0, shoppingBasket.getNumberItems());
    }

    @Test
    public void subTotalStartsAt0(){
        assertEquals(0, shoppingBasket.getSubTotal(), 0.01);
    }

    @Test
    public void canAddItem(){
        shoppingBasket.addItem(item);
        assertEquals(1, shoppingBasket.getNumberItems());
    }

    @Test
    public void canRemoveItem(){
        shoppingBasket.addItem(item);
        shoppingBasket.addItem(item);
        shoppingBasket.removeItem(item);
        assertEquals(1, shoppingBasket.getNumberItems());
    }

    @Test
    public void canClearBasket(){
        shoppingBasket.addItem(item);
        shoppingBasket.addItem(item);
        shoppingBasket.emptyBasket();
        assertEquals(0, shoppingBasket.getNumberItems());
    }

    @Test
    public void canUpdateSubTotal(){
        shoppingBasket.addItem(item);
        shoppingBasket.addItem(item);
        shoppingBasket.calculateSubTotal();
        assertEquals(3.00, shoppingBasket.getSubTotal(), 0.01);
    }

    @Test
    public void canAddNewDiscount(){
        shoppingBasket.addNewDiscount(percentOffTotal);
        assertEquals(1, shoppingBasket.getNumberOfDiscounts());
    }

    @Test
    public void canRetrieve10PercentDiscount(){
        shoppingBasket.addItem(item2);
        shoppingBasket.addNewDiscount(percentOffTotal);
        assertEquals(2.00, shoppingBasket.calculateApplicableDiscounts(), 0.01);
    }

}
