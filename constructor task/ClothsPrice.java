public class ClothsPrice{
   
   
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
       System.out.println("the prices:" + prices[index]);
	   }
	  }
	  
       public String update(int oldprice, int newprice){
          for(int index=0; index<this.getlength(); index++){
               if(prices[index]==oldprice){
					prices[index]=newprice;
					System.out.println("updated" + " " + oldprice+ " "+"to" + " " + newprice);
					}
					}
					return "Updated successfully";
					}
					
	    public void search(int prices1){
			for(int prices2:prices){
				if(prices1==prices2){
					System.out.println("found: "+  prices1);
				}
			}
		}
	
}