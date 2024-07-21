public class Human{
  public String name;
  public int bones;
  public byte organs;
  public String coverd;
 
  
  public Human(String name,int bones){
  this.name=name;
  this.bones=bones;
  System.out.println("About:"+ name+ ", " + "total bones:"+ bones);
  }
  
  public Human(byte organs){
  this.organs=organs;
  System.out.println("Organs are:"+ organs);
  }
  
  public Human(String coverd){
  this.coverd=coverd;
  System.out.println("Body covered by:" + coverd);
   }
  }   