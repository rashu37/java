public class Station{

  public String name;
  public byte price;
  public int workers;
  public String location;
  public double length;
  public float area;
  public boolean available;
  
  public Station(String name){
  this.name=name;
  System.out.println("the station name is:" + name);
  }
  
   public Station(String name,byte price){
  this.name=name;
  this.price=price;
  System.out.println("the station name is:" + name+ "," + "Price of ticket in station:" + price);
  }
  
  public Station(String name,byte price,int workers){
  this.name=name;
  this.price=price;
  this.workers=workers;
  System.out.println("the station name is:" + name+ "," + "Price of ticket in station:" + price+ "," + "Workers in station:" + workers);
  }
  
  
  public Station(String name,byte price,int workers,String location){
  this.name=name;
  this.price=price;
  this.workers=workers;
  this.location=location;
  System.out.println("the station name is:" + name+ "," + "Price of ticket in station:" + price+ "," + "Workers in station:" + workers+
  "," + "Location of station:" + location);
  }
  
  public Station(String name,byte price,int workers,String location, double length){
  this.name=name;
  this.price=price;
  this.workers=workers;
  this.location=location;
  this.length=length;
  System.out.println("the station name is:" + name+ "," + "Price of ticket in station:" + price+ "," + "Workers in station:" + workers+
    "," + "Location of station:" + location+ "," + "Length of station:" + length);
  }
  
   public Station(String name,byte price,int workers,String location, double length,float area){
  this.name=name;
  this.price=price;
  this.workers=workers;
  this.location=location;
  this.length=length;
  System.out.println("the station name is:" + name+ "," + "Price of ticket in station:" + price+ "," + "Workers in station:" + workers+
    "," + "Location of station:" + location+ "," + "Length of station:" + length+ "," + "area of station:" + area);
  }
  
  public Station(String name,byte price,int workers,String location, double length,float area,boolean available ){
  this.name=name;
  this.price=price;
  this.workers=workers;
  this.location=location;
  this.length=length;
  System.out.println("the station name is:" + name+ "," + "Price of ticket in station:" + price+ "," + "Workers in station:" + workers+
    "," + "Location of station:" + location+ "," + "Length of station:" + length+ "," + "area of station:" + area+ "," +"In station train is available:"+ available);
  }
  
  
  
}
   