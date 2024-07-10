public class LinkedIn{

  public static void profileDetails(){
   System.out.println("Available profile Details");
   LinkedIn.educationDetails();
   LinkedIn.personalDetails();
   LinkedIn.skills();
   LinkedIn.percentageofdegree();
   }
   
   public static void educationDetails(){
   System.out.println("Completed B.E");
   LinkedIn.profileDetails();
   }
   
   public static void personalDetails(){
   System.out.println("leaving in Bengaluru");
   LinkedIn.personalDetails();
   }
   
   public static void skills(){
   System.out.println("java,c,html,css");
   LinkedIn.personalDetails();
   }
   
   public static void percentageofdegree(){
   System.out.println("7.23 cgpa");
   LinkedIn.personalDetails();
   }
   
   }