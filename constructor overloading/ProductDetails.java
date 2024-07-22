public class ProductDetails{
   

   public String name;
   public float discount;
   public int price;
   
     public ProductDetails(){
     System.out.println("Product Details:");
	 
	 }
	 
	 public ProductDetails(String name,float discount,int price){
	 this.name=name;
	 this.discount=discount;
	 this.price=price;
	 float totalprice=price-(price*discount);
	 System.out.println("Product name:" + name + ", " + "Discount price:" + discount + ", " + "Product price:" + price+
	 ", " + "Total price product:" + totalprice);
	 }
	 
	 
	 /*public void details(String name,int price,float discount){
         if(name=="Laptop" || name=="Paints" || name=="Chair" || name=="Bag" || name=="Pen" || name=="Cloth"){
			 float totalprice=price-(price*discount);
               System.out.println("the product name:" + name + ", " +"Discount price:" + discount + ", " + "Product price" + price+
	 ", " + "Total price of product:" + totalprice);
		 }else{
            System.out.println("the product is out of stock" + name);
		 }
	 		 
	 }*/
	 }
	 
	 

   