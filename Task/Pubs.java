public class Pubs{

   public static void name(){
   System.out.println("the pub name is Happy hours");
   }
   
   public static void address(String area){
   if(area=="hubali"){
   System.out.println("the address is correct:" + " " + area);
   }else{
   System.out.println("the address is not correct");
   }
   }
   
   public static String limit(int allow){
   if(allow<100){
   System.out.println("the peoples allowed are:" + " "+ allow);
   return "only limited peoples are allowed";
   }else{
   System.out.println("the peoples more not allowed");
   return "only limited peoples are allowed";
   }
   }
   
}