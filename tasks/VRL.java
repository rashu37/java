public class VRL{

   public static void details(String type){
   System.out.println("the type of bus is:" + " " + type);
   }
   
   public static void details(int price){
   if(price > 1000){
   System.out.println("the type of bus is sleeper coach" + " " + price);
   }else{
   System.out.println("the type of bus is normal" + " " + price);
   }
   }
   
    public static boolean details(float time, String day){
    System.out.println("the time and day of bus:" + time + day);
	return true;
	}
	
	public static void details(double rate,String from){
	System.out.println("the ratings of bus and from:" + rate+ ", " + from);
	}
	}
	
 	
  
  
   
   