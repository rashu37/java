public class Meshoo{
 public static void search(){
 System.out.println("searching for the Dresses in Meshoo");
 }
 
 public static void name(String type){
	 if(type=="tops"){
		 System.out.println("You are searching for:" + " "+ type);
	 }else{
		 System.out.println("you are searching for different");
	 }
 }

     public static String color(){
    String color[]={"black", "purple", "white", "green"};
       for(int index=0; index< color.length; index++){
            System.out.println("The dress color is:" + " " + color[index]);
	   }
         return "purple is not available";
	}

     public static double price(int rate){
		 if(rate<10000){
			 System.out.println("the dress is available:" + " " + rate+ ", "+ "extra is:");
		 return 120.78;
		 } else{
			 System.out.println("the dress is not available");
			 return 0.0;
		 }
	 }


    	  
 }
 