public class Shopping{
	
	public static final double gst=0.18;
    public static void type(String shoptype){
		System.out.println("The shopping type is: " + shoptype);
	}
	public static void price(int pricee){
		double totalprice=(Shopping.gst*pricee)+ pricee;
		System.out.println("the total price is :" + totalprice);
	}
	public static void item(String itemname, String type){
		System.out.println("The shopping item name is:" + itemname+ " ," +  "the shopping type:" + type);
	}
	public static void details(String type, String item, int totalprice){
		
		double gstprice= (totalprice*Shopping.gst)+ totalprice;
	System.out.println("The shopping type is: " + type+ ", " + "The shopping item is:"+ item + " ," + "The shopping totalprice is:" + gstprice);
	}	
	
	

}