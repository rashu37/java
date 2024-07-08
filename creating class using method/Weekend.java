public class Weekend{
	
	public static final double gst=0.18;
public static void sleep(){

System.out.println("sleeping hours is 12");
}


public static void shopping(){
	
	String name="Clothes";
	int price= 1000;
	float totalprice=price+(price*0.18f);
	System.out.println(" total price is:" + totalprice);
	
}

    public static void  getgst(int price){
	System.out.println("get gst for price:" +price);
	double totalprice=(Weekend.gst*price)+price;
	System.out.println("Total price is:"+ totalprice);
	
}
	
	

}