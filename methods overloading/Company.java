public class Company{

   public static void name(){
   System.out.println("The company name TATA");
   Company.job();
   Company.location();
   }
   
   public static void job(){
   System.out.println("the job role is FrontDeveloper");
   Company.name();
   
   }
   
   public static void location(){
   System.out.println("Location is Bengaluru");
   Company.name();
   }
   
   }