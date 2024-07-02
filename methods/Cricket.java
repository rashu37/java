public class Cricket{
   public static void rate(int runs, int overbowled, String name, int score){
   double runrate=( runs/overbowled);
   System.out.println(" The total Runrate is:" + runrate + " ," + "The player name is:" + name + " ," + "Totalscore is:" + score);
   }
   public static void results(boolean result){
	   if(result){
		   System.out.println("The result of match is win:" + result);
	   }else
	   {
		   System.out.println("The team loss the match");
	   }
   }
   public static void details(String name, int age, double height, float weight, String education, int matches, int score){
   System.out.println("The player name:" + name + "," + "Age is:" + age + "," + "height:" + height + "," + "weight:" + weight + ","+
             "Education :"+ education+ "," + "Total matches:"+ matches+ "," + " total score:"+ score);
}			 
}