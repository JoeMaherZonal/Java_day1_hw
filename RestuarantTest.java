import static org.junit.Assert.assertEquals;
import org.junit.*;

public class RestuarantTest{
  Restaurant restaurant;
  Table table1;
  Table table2;
  Party party1;
  Party party2;
  Party party3;

  @Before 
  public void before() {
    table1 = new Table(2);
    table2 = new Table(2);
    restaurant = new Restaurant(10);
    party1 = new Party("Smith", 2);
    party2 = new Party("Brown", 2);
    party3 = new Party("Maher", 2);
  }

  @Test
  public void hasCapacityForTables(){
    assertEquals(10, restaurant.getMaxTableCapacity()); 
  }

  @Test
  public void checkThereAreNoTablesAtInit(){
    assertEquals(0, restaurant.getAmountOfTables());
  }

  @Test 
  public void canAddTable(){
    restaurant.addTable(table1);
    assertEquals(1, restaurant.getAmountOfTables());
  }

  @Test
  public void cannotAddMoreTablesThanMax(){
    for(int i = 0; i < 12 ; i++){
      restaurant.addTable(table1);
    }
    assertEquals(10, restaurant.getAmountOfTables());
  }

  @Test
  public void canCheckoutCorrectParty(){
    table1.addParty(party1);
    table2.addParty(party2);
    restaurant.addTable(table1);
    restaurant.addTable(table2);
    String partyName = restaurant.getTables()[0].currentParty().getName();
    assertEquals("Smith", partyName);
    //table 1 is index 0
    restaurant.checkOutPartyonTable(1);
    restaurant.getTables()[0].addParty(party3);
    String partyName2 = restaurant.getTables()[0].currentParty().getName();
    assertEquals("Maher", partyName2);
  }


}
