import static org.junit.Assert.*;
import org.junit.*;


public class DriverSpec {
  
  Driver driver;

  @Before 
  public void before(){
    driver = new Driver("sam");
  }

  @Test
  public void hasName(){
    assertEquals("sam", driver.getName());
  }
}