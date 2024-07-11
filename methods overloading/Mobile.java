public class Mobile{

    public static void type(String name){
	System.out.println("the type of mobile name:" + name);
	}
	
	public static void type(int price, double ram){
	System.out.println("the mobile price:" + price + ", "+ "RAM consist:"+ ram);
	}
	
	public static void type(long num, String brand, int price){
	System.out.println("the mobile number:"+ num +", " + "Brand is:" + brand+ ", " + "Price is:"+ price);
	}
	
	public static String type(String batteryhrs, int totalapps){
	System.out.println("the total battery hours:"+batteryhrs + ", "+ "Total apps in mobile:"+ totalapps);
	return "Mobile is good";
	}
}