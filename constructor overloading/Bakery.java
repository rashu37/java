public class Bakery{

  public String name;
  public int price;
  public String address;
  public short workers;
  public String items[];
  public String location;
  public boolean veg;
  
  public Bakery(String name){
  this.name=name;
  System.out.println("the bakery name is:" + name);
  }
  
  public Bakery(String name, int price){
  this.name=name;
  this.price=price;
  System.out.println("the bakery name is:" + name+ "," + "Minimum price of bakery:" + price);
  }
   public Bakery(String name, int price,String address){
  this.name=name;
  this.price=price;
  this.address=address;
  System.out.println("the bakery name is:" + name+ "," + "Minimum price of bakery:" + price+ "," + "Bakery address is:"+ address);
  }
  
   public Bakery(String name,short workers){
  this.name=name;
  this.workers=workers;
  System.out.println("the bakery name is:" + name+ "," + "workers work in bakery:"+ workers);
  }
    public Bakery(String name, int price,String items[]){
  this.name=name;
  this.price=price;
   for(int i=0; i<items.length; i++){
  System.out.println("the bakery name is:" + name+ "," + "Minimum price of bakery:" + price+ "," + "Bakery items are:" + items[i]);
  } 
	}  
	
	public Bakery(String name, int price,String items[],String location){
  this.name=name;
  this.price=price;
  this.location=location;
   for(int i=0; i<items.length; i++){
  System.out.println("the bakery name is:" + name+ "," + "Minimum price of bakery:" + price+ "," + "Bakery items are:" + items[i]+"," + 
  "location of bakery:"+ location);
  } 
	}  
	public Bakery(String name,int workers,boolean veg){
  this.name=name;
  this.veg=veg;
	System.out.println("the bakery name is:" + name+ "," + "workers work in bakery:"+ workers+"," + "Is bakery is veg:"+ veg);
  }
  
}  
  