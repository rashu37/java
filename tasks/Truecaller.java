public class Truecaller{
      public static void details(String name){
      System.out.println("the name is:" + name);
	  }
	  
	  public static void search(int id, String message){
		  System.out.println("the id:" + id + ", " + "message is:"+ message);
	  }
	  
	  public static void search(long num){
		  System.out.println("the search number is:" +  num);
	  }
	  
	  public static void rate(int premium){
	  if(premium>1000){
	  System.out.println("the monthly premium is:" + premium);
	  }
	  else{
	  System.out.println("the monthly premium is not available");
	  }
	  }
	  }
