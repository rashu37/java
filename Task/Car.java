public class Car{

 public static void property(String type){
 if(type=="Rolls royce"){
 System.out.println("the car type is:"+ " " + type);
 }else{
 System.out.println("the car is not available");
 }
 }
 
   public static int price(int rate){
   if(rate>100000){
   System.out.println("the car price is:" + " " + rate + " ," + "advance is:");
   return 10000;
   }else{
   System.out.println("the car is not available");
   return 00;
   }
   }
   
   public static double size(String location[]){
	   for(int index=0; index<location.length; index++){
		   System.out.println("Avaliable in:" + " " +location[index]+ ","+ "price is in cr:");
	   }
	   return 6.25;
   }
   }
   