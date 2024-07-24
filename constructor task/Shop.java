public class Shop{

    String shopnames[]=new String[4];
	int index=0;
	
	 public int getnames(){
		 System.out.println(" ");
	  return shopnames.length;
	  
	   }
	   
	 public String getdetails(String names){
		 if(this.index<this.getnames()){
			 shopnames[index]=names;
			 index++;
			 System.out.println("Shops name:" + names);
			 return "available";
		 }else{
			 System.out.println("Shops are not available");
			 return "not available";
		 }
		 
	}
	 public void read(){
		 for(int index=0;index<this.getnames(); index++){
			 System.out.println("The index:" + index);
		 }
	 }
	 
	
}


     

	 