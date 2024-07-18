public class Shopping{

  public String name;
  public int price;
  public byte extra;
  public short totalamount;
  public String brand;
  public char size;
  public double gst;

  
  public Shopping(String name){
  this.name=name;
  System.out.println("shopping for dress:"+ name);
  }
  
  public Shopping(String name,int price){
  this.name=name;
  this.price=price;
  System.out.println("shopping for dress:"+ name+"," + "the price of dress:" + price);
  }
  
  public Shopping(String name,int price,byte extra){
  this.name=name;
  this.price=price;
  this.extra=extra;
  System.out.println("shopping for dress:"+ name+"," + "the price of dress:" + price+"," +"the amount extra:"+ extra);
  }
  
  public Shopping(String name,int price,byte extra,short totalamount){
  this.name=name;
  this.price=price;
  this.extra=extra;
  this.totalamount=totalamount;
  System.out.println("shopping for dress:"+ name+"," + "the price of dress:" + price+"," +"the amount extra:"+ extra
  +"," + "the totalamount is to paid:"+ totalamount);
  }
  
  public Shopping(String name,int price,byte extra,short totalprice,String brand,char size){
  this.name=name;
  this.price=price;
  this.extra=extra;
  this.totalamount=totalamount;
  this.brand=brand;
  this.size=size;
  System.out.println("shopping for dress:"+ name+"," + "the price of dress:" + price+"," +"the amount extra:"+ extra
  +"," + "the totalamount is to paid:"+ totalamount+","+ "brand of dress:"+ "," + "Size of dress:"+ size);
  }
  
  public Shopping(String name,int price,byte extra,short totalprice,String brand,char size,double gst){
  this.name=name;
  this.price=price;
  this.extra=extra;
  this.totalamount=totalamount;
  this.brand=brand;
  this.size=size;
  this.gst=gst;
  System.out.println("shopping for dress:"+ name+"," + "the price of dress:" + price+"," +"the amount extra:"+ extra
  +"," + "the totalamount is to paid:"+ totalamount+","+ "brand of dress:"+ "," + "Size of dress:"+ size+"," + "Including gst:"+gst);
  }
  
}
  
  
  