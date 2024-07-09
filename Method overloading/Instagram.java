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
  
  public static String info(float rate, int no_of_profile){
    if(rate==4.5F && no_of_profile==23){
       System.out.println("the ratings of item:" + " ," + "the no of profile are:" + no_of_profile);
     return "correct";
	}else{
      System.out.println("Not correct");
     return "not correct";
	}
  }
  
  public static void info(String story, long password){
  if(story=="Seetha" || password==98765432345L){
  System.out.println("The story from user:" + story+ "," + "password is:"+ password);
  }else{
  System.out.println("the information is wrong");
}
}  
  
  }