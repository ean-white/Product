import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    Product p1;
 @BeforeEach
 void setUp()
 {
     p1 = new Product( "Test", "Test Product", "1234", 100);
 }

    @Test
    void SetProductName()
    {
        p1.setProductName("Adidas");
        assertEquals("Adidas", p1.getProductName());
    }

    @Test
    void SetProductDesc()
    {
        p1.setProductDesc("Sports Products");
        assertEquals("Sports Products", p1.getProductDesc());
    }

    @Test
    void SetCost()
    {
        p1.setCost(200);
        assertEquals(200, p1.getCost());
    }
}