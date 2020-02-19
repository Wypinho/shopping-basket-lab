import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {
    Item item;

    @Before
    public void before(){
        item = new Item("Beans", 0.80);
    }

    @Test
    public void itemHasName(){
        assertEquals("Beans", item.getName());
    }

    @Test
    public void itemHasPrice(){
        assertEquals(0.80, item.getPrice(), 0.01);
    }
}
