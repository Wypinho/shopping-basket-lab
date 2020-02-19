import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShoppingBasketTest {
    ShoppingBasket shoppingBasket;
    Item item;

    @Before
    public void before(){
        shoppingBasket = new ShoppingBasket();
        item = new Item("Biscuits", 1.50);
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

}
