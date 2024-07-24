public class ShopRunner{

     public static void main(String args[]){
	
	Shop shop=new Shop(); 
	
	int result=shop.getnames();
	System.out.println(" " + result);
	
	String get=shop.getdetails("Shops");
	System.out.println(" " + get);
	 shop.getdetails("Dmart");
	 shop.getdetails("Realince");
	shop.getdetails("Hotel");
	 shop.getdetails("Malls");
	 //shop.getdetails("Jewellary");
	 shop.read();
	 
	 }
	 }