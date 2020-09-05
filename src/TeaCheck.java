import static org.junit.jupiter.api.Assertions.*;  
  
import org.junit.jupiter.api.Test;
class TeaCheck {  
  
    @Test  
    void Object_create_check() {  
        Beverage bvg = new Tea("Large", 2, null);  
    }  
      
    @Test  
    void set_price_check() {  
        Beverage bvg = new Tea("Large", 2, null);  
        assertEquals(5.0, bvg.getPrice());  
    }  
     
    @Test  
    void get_amount_check() {  
        Beverage bvg = new Tea("Large", 2, null);  
        assertEquals(2, bvg.getAmount());  
    }  
      
    @Test  
    void get_size_check() {  
        Beverage bvg = new Tea("Large", 2, null);  
        assertEquals("Large", bvg.getSize());  
    }  
      
    @Test  
    void message_check() {  
        Beverage bvg = new Tea("Large", 2, null);  
        assertEquals("2 Large quantity of Tea", bvg.toString());  
    }  
      
      
  
}  