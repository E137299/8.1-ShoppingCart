import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest {

    private ShoppingCart cart;

    @BeforeEach
    public void setUp() {
        cart = new ShoppingCart();
    }

    // --------------------
    // addItem tests
    // --------------------

    @Test
    public void testAddOneItem() {
        Item apple = new Item("Apple", 1.00, 3);
        cart.addItem(apple);

        assertEquals(3.00, cart.getTotalCost(), 0.001);
    }

    @Test
    public void testAddMultipleItems() {
        cart.addItem(new Item("Apple", 1.00, 2));   // $2.00
        cart.addItem(new Item("Banana", 0.50, 4));  // $2.00

        assertEquals(4.00, cart.getTotalCost(), 0.001);
    }

    // --------------------
    // removeItem tests
    // --------------------

    @Test
    public void testRemoveSomeQuantity() {
        cart.addItem(new Item("Apple", 1.00, 5));
        cart.removeItem("Apple", 2);

        assertEquals(3.00, cart.getTotalCost(), 0.001);
    }

    @Test
    public void testRemoveAllQuantity() {
        cart.addItem(new Item("Apple", 1.00, 3));
        cart.removeItem("Apple", 3);

        assertEquals(0.00, cart.getTotalCost(), 0.001);
    }

    @Test
    public void testRemoveMoreThanExists() {
        cart.addItem(new Item("Apple", 1.00, 2));
        cart.removeItem("Apple", 5);

        assertEquals(0.00, cart.getTotalCost(), 0.001);
    }

    @Test
    public void testRemoveItemNotInCart() {
        cart.addItem(new Item("Apple", 1.00, 2));
        cart.removeItem("Banana", 1);

        assertEquals(2.00, cart.getTotalCost(), 0.001);
    }

    // --------------------
    // getTotalCost tests
    // --------------------

    @Test
    public void testEmptyCartTotal() {
        assertEquals(0.00, cart.getTotalCost(), 0.001);
    }

    @Test
    public void testAddAndRemoveSequence() {
        cart.addItem(new Item("Apple", 1.00, 4));   // $4.00
        cart.addItem(new Item("Banana", 0.50, 2));  // $1.00
        cart.removeItem("Apple", 1);                // -$1.00

        assertEquals(4.00, cart.getTotalCost(), 0.001);
    }
}
