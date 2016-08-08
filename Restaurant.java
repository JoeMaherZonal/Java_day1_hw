public class Restaurant {

  private Table[] tables;

  public Restaurant(int maxTables){
    this.tables = new Table[maxTables];
  }

  public int getMaxTableCapacity(){
    return tables.length;
  }

  public int getAmountOfTables(){
    int count = 0;
    for(int i = 0; i < tables.length; i++){
      if(tables[i] != null){
        count++;
      }
    }
    return count;
  }

  public Table[] getTables(){
    return tables;
  }

  public void addTable(Table newTable){
    if(isRestuarantFull()) return;
    int numberOfTables = getAmountOfTables();
    tables[numberOfTables] = newTable;
  }

  public boolean isRestuarantFull(){
    return getAmountOfTables() >= tables.length;
  }

  public void checkOutPartyonTable(int tableNo){
    //tables will be numbered starting from 1..
    for(int i = 0; i < tables.length; i++){
      if(i + 1 == tableNo){
        tables[i].checkPartyOut();
      }
    }
  }

  public void checkInPartyonTable(int tableNo, Party newParty){
    //tables will be numbered starting from 1..
    for(int i = 0; i < tables.length; i++){
      if(i + 1 == tableNo){
        tables[i].addParty(newParty);
      }
    }
  }



}