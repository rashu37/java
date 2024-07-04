public class Malls{
 public static void search(){
 System.out.println("the searching for the brands in malls");
 }
 
 public static void name(String type){
	 if(type=="zara"){
		 System.out.println("You are searching for:" + " "+ type);
	 }else{
		 System.out.println("you are searching for different");
	 }
 }

     public static String types(){
    String types[]={"shops", "therter", "cafe", "jewellary shops"};
       for(int index=0; index< types.length; index++){
            System.out.println("The types are:" + " " + types[index]);
	   }
         return " Everything available";
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
 