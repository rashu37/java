public class OneDrive{
 

  public static void tasks(String name, long num){
  System.out.println(" " + name + " " + "Number is:" + num);
  }  
  
  public static String tasks(String files, int no_of_need){
    if(files=="photos" && no_of_need==250){
       System.out.println("the files shared to drive:" + files+ " ," + "no of photos:" + no_of_need);
     return "uploaded to drive";
	}else{
      System.out.println("Not correct");
     return "not uploaded";
	}
  }
  
  public static void tasks( int size){
  System.out.println("The files size is:"+ size);
  }
  
  public static String tasks(int no_of_need, String gmail){
    if(no_of_need==500 || gmail=="seeth123"){
       System.out.println("the need to share:" +no_of_need + ", " + "Gmail id:" + gmail);
     return "mail id is conformed";
	}else{
      System.out.println("Not correct");
     return "mail id not conformed";
	}
  }  
      
	  public static boolean tasks(String id){
		  System.out.println("The id:" + id);
		  return true;
	  }
  }