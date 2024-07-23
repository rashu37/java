public class Mouse{

    public String brand;
    public String model;
	public boolean wireless;
    public String colour;
    public double price;
	
	
	public Mouse(String brand,String model,boolean wireless,String colour,double price){
	  this.brand=brand;
	  this.model=model;
	  this.wireless=wireless;
	  this.colour=colour;
	  this.price=price;
	  
	  System.out.println("Brand:" + brand+ ", " + "Model:" + model + ", " + "Is wireless:" + wireless+ ", " +
	  "Mouse colour:" + colour+ ", " + " Price:" + price);
	  }
	  
	  public void info(String brand){
		  if(this.brand==brand){
			  System.out.println("Brand:" + brand);
		  }else{
			  System.out.println("Brand is not available");
		  }
	  }
	   public String info1(String brand,double price){
	     if(this.brand==brand || this.price>=price){
			  System.out.println("Brand:" + brand + ", " + "price is:" + price);
			  return "available";
		  }else{
			  System.out.println("Brand is not available");
			  return "Not available"; 
		  }
	  }
	  public boolean info2(String brand,double price,String colour){
	  if(this.brand==brand || this.price>=price || this.colour==colour){
			  System.out.println("Brand:" + brand + ", " + "price is:" + price+ ", " + "Colour is:" + colour);
			  return true;
		  }else{
			  System.out.println("Brand is not available");
			  return false; 
		  }
	  }
	  
	  } 
	  