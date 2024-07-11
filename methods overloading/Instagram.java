public class Instagram{

  public static void info(String name){
  System.out.println("the user name is:" + name);
  }
  
  public static void info(String name, int date){
  System.out.println("the user name is:" + name + " " + "date is:" + date);
  }
  
  public static boolean info(int followers){
  System.out.println("the followers are:" + followers);
  return true;
  }
  
  public static void info(String name, byte unfollow){
  System.out.println("the profile name is:" + name+ ", " + "unfollowing profile:"+ unfollow );
  }
 
  public static void info(String story, long password){
  System.out.println("The story from user:" + story+ "," + "password is:"+ password);
 

}  
  
  }