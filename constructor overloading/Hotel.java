public class Hotel{

  public String name;
  public int price;
  public long num;
  public short workers;
  public boolean veg;
  
  public Hotel(String name){
  this.name=name;
  System.out.println("the Hotel name is:" + name);
  }
  
  public Hotel(int price){
  this.price=price;
  System.out.println( "Minimum price of bakery:" + price);
  }
   public Hotel(long num){
  this.num=num;
  System.out.println("Bakery address is:"+ num);
  }
  
   public Hotel(short workers){
  this.name=name;
  this.workers=workers;
  System.out.println("workers work in bakery:"+ workers);
  }
    
	public Hotel(boolean veg){
   this.veg=veg;
	System.out.println("Is Hotel is veg:"+ veg);
  }
  
}  
  