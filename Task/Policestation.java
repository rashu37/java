public class Policestation{

  public static void name(){
  System.out.println("the name of the policestaion");
  }
      public static void complient(String reg){
	  if(reg=="name"){
	     System.out.println("the complient is taken");
		 }else{
		 System.out.println("the complient is not taken");
		 }
		 }
		

     public static String type(int id){
        if(id==62){
          System.out.println("the complient is registerd");
		  return "Taken";
		}else{
		  System.out.println("the complient is not registerd");
		  return "not taken";
		}
	}
	
	public static void taken(String take[]){
		for(int index=0; index<take.length; index++){
			System.out.println("the complients are taken like:" + " " + take[index]);
		}
	}
}