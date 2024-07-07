public class RealEstate{

 public static void property(String type){
 if(type=="Hotel"){
 System.out.println("the property type is:"+ " " + type);
 }else{
 System.out.println("the property is not available");
 }
 }
 
   public static int price(int rate){
   if(rate>100000){
   System.out.println("the property price is:" + " " + rate + " ," + "advance is:");
   return 10000;
   }else{
   System.out.println("the property is not available");
   return 00;
   }
   }
   
   public static double size(String location[]){
	   for(int index=0; index<location.length; index++){
		   System.out.println("Avaliable in:" + " " +location[index]+ ","+ "size:");
	   }
	   return 25.25;
   }
   }
   