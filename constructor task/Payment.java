public class Payment{

   int payments[] = new int[5];
   int index=0;

   public int getlength(){
     return payments.length;
	 }
	 
	 
	 public String savedetails(int prices){
		 
		 if(this.index<this.getlength()){
			 payments[index]=prices;
			 index++;
			 System.out.println("Save details");
			 return "saved succesfully";
		 }else{
			 System.out.println("Not saved");
			 return "not Saved";
		 }
	 }
		
       public void read(){
			for(int index=0; index<this.getlength(); index++){
				System.out.println("Payments:" + payments[index]);
			}
	   }
	 
	 
	  public String update(int oldpayment,int newpayment){
		  for(int index=0; index<this.getlength(); index++){
			  if(payments[index]==oldpayment){
				  payments[index]=newpayment;
				  System.out.println(" " + payments[index]);
				  return "Updated succesfully";
			  }else{
				  System.out.println(" " + payments[index]);
			  }
		  }
		  return "not upadated";
		  
	  }
	  
	    public String delete(int paymentprice){
			for(int index=0; index<this.getlength(); index++){
				if(payments[index]==paymentprice){
					payments[index]=0;
					System.out.println(" " + payments[index]);
					return "deleted succesfully";
				}else{
					System.out.println(" " + payments[index]);
				}
			}
			return "not deleted";
		}
		  
		  public void search(int amount1){
			  for(int amount2:payments){
				  if(amount2==amount1){
					  System.out.println("is found " + amount2);
				  }
			  }
		  }
	}