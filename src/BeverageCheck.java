import static org.junit.jupiter.api.Assertions.*;  
  
import org.junit.jupiter.api.Test;  
  
class BeverageCheck {  
  
    @Test  
    void Object_create_check() {  
        Beverage bvg = new Beverage("Large", 2);  
    }  
      
    @Test  
    void set_price_check() {  
        Beverage bvg = new Beverage("Large", 2);  
        assertEquals(0.0, bvg.getPrice());  
    }  
      
    @Test  
    void get_amount_check() {  
        Beverage bvg = new Beverage("Large", 2);  
        assertEquals(2, bvg.getAmount());  
    }  
      
    @Test  
    void get_size_check() {  
        Beverage bvg = new Beverage("Large", 2);  
        assertEquals("Large", bvg.getSize());  
    }  
      
    @Test  
    void message_check() {  
        Beverage bvg = new Beverage("Large", 2);  
        assertEquals("2 Large quantity of ", bvg.toString());  
    }  
      
}