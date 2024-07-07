public class Myntra{
 public static void search(){
 System.out.println("the user searching for the Dresses in myntra");
 }
 
 public static void name(String type){
	 if(type=="kurtha"){
		 System.out.println("You are searching for:" + " "+ type);
	 }else{
		 System.out.println("you are searching for different");
	 }
 }

     public static String color(){
    String color[]={"blue", "red", "black", "purple"};
       for(int index=0; index< color.length; index++){
            System.out.println("The dress color is:" + " " + color[index]);
	   
	   }         
	   return "green is not available";
	
	 }
	

     public static double price(int rate){
		 if(rate<10000){
			 System.out.println("the dress is available:" + " " + rate+ ", "+ "gst is:");
		 return 0.18;
		 } else{
			 System.out.println("the dress is not available");
			 return 0.0;
		 }
	 }


    	  
 }