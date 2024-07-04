public class Movies{

 public static void name(String type){
 if(type=="Horror"){
 System.out.println("the movie type is:"+ " " + type);
 }else{
 System.out.println("the movie is not available");
 }
 }
 
   public static int price(int rate){
   if(rate>1000){
   System.out.println("the movie price is:" + " " + rate + " ," + "extra is:");
   return 100;
   }else{
   System.out.println("the movie is not available");
   return 00;
   }
   }
   
  // public static String varites(String types[]){
	   //for(int index=0; index<types.length; index++){
		   //System.out.println("Movies available:" + " " +types[index]);
	   //}
	   //return "in any language";
   //}
   }
   