public class Theater{

   public static void name(){
   System.out.println("The name of theater is PVR");
   Theater.movie();
   Theater.price();
   }
   
   public static void price(){
   System.out.println("the price of the theater is 2000");
   Theater.name();
   
   }
   
   public static void movie(){
   System.out.println("the movie relesed in theater is Sita Ram");
   Theater.name();
   }
   
   }