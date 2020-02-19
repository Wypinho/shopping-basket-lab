import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShoppingBasketTest {
    ShoppingBasket shoppingBasket;

    @Before
    public void before(){
        shoppingBasket = new ShoppingBasket();
    }

    @Test
    public void startsEmpty(){
        assertEquals(0, shoppingBasket.getNumberItems());
    }

    @Test
    public void subTotalStartsAt0(){
        assertEquals(0, shoppingBasket.getSubTotal(), 0.01);
    }
}
