public class Election{

  public String name;
  public int date;
  public byte particpents;
  public short votings;
  public boolean result;
  
  
  public Election(String name, int date){
  this.name=name;
  this.date=date;
  System.out.println("It is:" + name +"," + "on date:" + date);
  }
  
  public Election(byte particpents,short votings){
  this.particpents=particpents;
  this.votings=votings;
  System.out.println("the total particpents in election:" + particpents+ "," + "total votings:" + votings);
  }
  
  public Election(boolean result){
  this.result=result;
  System.out.println("the result is won:" + result);
  }
  }