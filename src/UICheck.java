import static org.junit.jupiter.api.Assertions.*;  
  
import org.junit.jupiter.api.Test;  
  
class UICheck {  
  
    Main_Page p = new Main_Page();  
  
      
    @Test  
    void Make_Bill_check()  
    {  
        assertEquals(false, Main_Page.btnMakeBill.isEnabled());  
    }  
      
    @Test  
    void Drinks_Quantity_check()  
    {  
        p.initialize();  
        assertNotEquals(0, Main_Page.drinkquan);  
    }  
      
    @Test  
    void Fries_Quantity_check()  
    {  
        assertNotEquals(0, Main_Page.friesquan);  
    }  
      
    @Test  
    void SW_Quantity_check()  
    {  
        assertNotEquals(0, Main_Page.swquan);  
    }  
      
    @Test  
    void Dessert_Quantity_check()  
    {  
        assertNotEquals(0, Main_Page.dessertquan);  
    }  
      
    @Test  
    void Clear_check()  
    {  
        assertEquals(null, Main_Page.Drinksgroup.getSelection());  
        assertEquals(null, Main_Page.Friesgroup.getSelection());  
        assertEquals(null, Main_Page.SWgroup.getSelection());  
        assertEquals(null, Main_Page.Dessertgroup.getSelection());    
    }  
  
}  