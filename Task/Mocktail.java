public class Mocktail{

public static void type(){
System.out.println("the type of mocktail is orange juice");
}
   public static void price(int rate){
   if(rate>1000){
    System.out.println("the price is:" + " " + rate);
	}else{
	System.out.println("the mocktail is not available");
	}
	}
	
	public static boolean varity(String type){
		if(type=="mocktail"){
			System.out.println("the served mocktail is good"+ " " + type);
			return true;
		}else{
			System.out.println("the served mocktail is bad");
			return false;
		}
	}
	}
   