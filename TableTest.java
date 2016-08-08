import static org.junit.Assert.assertEquals;
import org.junit.*;

public class TableTest{
  Table table;
  Table table2;
  Party party;

  @Before 
  public void before() {
    table = new Table(2);
    table2 = new Table(4);
    party = new Party("Smith", 3);
  }

  @Test
  public void hasCovers(){
    assertEquals(2, table.getCovers()); 
  }

  @Test
  public void noPartyAtInit(){
    assertEquals(null, table.currentParty());
  }

  @Test
  public void canAddParty(){
    table2.addParty(party);
    assertEquals(party, table2.currentParty());
  }

  @Test
  public void cannotAddPartyLargerThanCoverMax(){
    table.addParty(party);
    assertEquals(null, table.currentParty());
  }

  @Test
  public void canCheckPartyOut(){
    table2.addParty(party);
    assertEquals(party, table2.currentParty());
    table2.checkPartyOut();
    assertEquals(null, table2.currentParty());
  }

}
