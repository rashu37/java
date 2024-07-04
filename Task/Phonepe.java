public class Phonepe{
 public static void name(){
 System.out.println("the user name is Ram");
 }
 
 public static void balance(int type){
	 if(type<100000){
		 System.out.println("The available balance is:" + " "+ type);
	 }else{
		 System.out.println("The balance not available");
	 }
 }

     public static String transferd(int rate){
		 if(rate<10000){
			 System.out.println("the transferd money is:" + " " + rate);
		 return "thank you";
		 } else{
			 System.out.println("the transferr is not done");
			 return "thank you";
		 }
	   
	 }
	    public static String used(){
        String used[]={"shop", "credit", "debit"};
         for(int index=0; index< used.length; index++){
            System.out.println("Phonepe can be used in:" + " " + used[index]);
	   }
         return "phonepe is available";
		}

}
 