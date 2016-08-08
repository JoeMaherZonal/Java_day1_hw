import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PartyTest{
  Party party;

  @Before 
  public void before() {
    party = new Party("Maher", 2);
  }

  @Test
  public void hasName(){
    assertEquals("Maher", party.getName()); 
  }

  @Test
  public void hasPartySize(){
    assertEquals(2, party.getPartySize());
  }

}
