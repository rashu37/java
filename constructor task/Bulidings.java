public class Bulidings{
  
  public String address;
  public int numofrooms;
  public byte floor;
  
  public Bulidings(String address){
	  Bulidings buliding1=new Bulidings("Bengaluru",200);
   this.address=address;
   System.out.println("Address:" + address);
   }
   
   public Bulidings(String address,int numofrooms){
	   Bulidings buliding2=new Bulidings("Bengaluru",200,(byte)5); 
   this.address=address;
   this.numofrooms=numofrooms;
   System.out.println("Address:" + address + ", " + "Number of rooms:"+ numofrooms);
   }
   public Bulidings(String address,int numofrooms,byte floor){
   this.address=address;
   this.numofrooms=numofrooms;
   this.floor=floor;
   System.out.println("Address:" + address + ", " + "Number of rooms:"+ numofrooms+ ", " + "Floors:" + floor);
   }
}
   