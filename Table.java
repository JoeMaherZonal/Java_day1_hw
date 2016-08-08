public class Table {

  private int covers;
  private Party party;

  public Table(int covers){
    this.covers = covers;
    this.party = null;
  }

  public int getCovers(){
    return covers;
  }

  public Party currentParty(){
    return party;
  }

  public void addParty(Party newParty){
    if(newParty.getPartySize() > covers) return;
    party = newParty;
  }

  public void checkPartyOut(){
    party = null;
  }
}