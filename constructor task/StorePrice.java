public class StorePrice{
   
   
   int prices[]=new int[5];
   int index=0;
   
   public int getlength(){
      System.out.print(" ");
	  return prices.length;
	  
	  }
	
   public String getprices(int rates){
     if(this.index<this.getlength()){
        prices[index]=rates;
          index++;
		  System.out.println("Prices are:" + rates);
		  return "Rates";
   }else{
	   System.out.println("Prices are not found");
	   return "out of rates";
   }
   }

      public void read(){
       for(int index=0; index<getlength(); index++){
       System.out.println("the index:" + index);
	   }
	  }
	  
	  
}