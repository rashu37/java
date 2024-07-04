public class Googlepay{
 public static void name(){
 System.out.println("the user name is seetha");
 }
 
 public static void balance(int type){
	 if(type<10000){
		 System.out.println("The available balance is:" + " "+ type);
	 }else{
		 System.out.println("The balance not available");
	 }
 }

     public static String transferd(int rate){
		 if(rate<10000){
			 System.out.println("the transferd money is:" + " " + rate);
		 return "money is transferd";
		 } else{
			 System.out.println("the transferr is not done");
			 return "money is not transferd";
		 }
	   
	 }
	    public static String used(){
        String used[]={"malls", "hotels", "hospital"};
         for(int index=0; index< used.length; index++){
            System.out.println("Googlepay used in:" + " " + used[index]);
	   }
         return "Googlepay is in service";
		}

}
 