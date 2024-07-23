public class Cosmatics{

   public String name;
   public int price;
   public String brand;
   public float gst;
   public double ratings;
   
   public Cosmatics(String name,int price,String brand,float gst,double ratings){
      this.name=name;
	  this.price=price;
	  this.brand=brand;
	  this.gst=gst;
	  this.ratings=ratings;
	   double totalprice=price+(price*gst); 
	  System.out.println("Cosmatic name:" + name+ ", " + " Price:" + price + ", " + "Cosmatic brand:" + brand+ "," +
	  "Including gst:" +totalprice + ", " + "Ratings of cosmatics:" + ratings);
	  
	  }
	  public void details(String name){
		  if(this.name==name){
			  System.out.println("the product name:" + name);
		  }else{
			  System.out.println("the product is not available");
		  }
	  }		  
	     public void details1(String name,int price){
		 if(this.name==name || this.price>=price){
			  System.out.println("the product name:" + name+ "," + "Price:" + price);
		  }else{
			  System.out.println("the product is not available");
		  }
	  }		
	  
	  public String details1(String name,int price,String brand){
		 if(this.name==name || this.price>=price || this.brand==brand){
			  System.out.println("the product name:" + name+ "," + "Price:" + price+ "," + "Brand is:" + brand);
			  return "product is available";
		  }else{
			  System.out.println("the product is not available");
			  return "product is not available";
		  }
	  }		
	  
	   public boolean details2(String name,int price,String brand,float gst){
		 if(this.name==name && this.price>=price && this.brand==brand && this.gst==gst){
			  System.out.println("the product name:" + name+ "," + "Price:" + price+ "," + "Brand is:" + brand+ "," +
			  "Including gst:" + gst);
			  return true;
		  }else{
			  System.out.println("the product is not available");
			  return false;
		  }
	  }		
	  }