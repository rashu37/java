public class AgeDetails{

  int info[]=new int[10];
  int index=0;
  
  public int getlength(){
   return info.length;
   }
   
   public void getage(int age){
   if(this.index<this.getlength()){
      info[index]=age;
	  index++;
	  System.out.println("Ages are:" + age);
	  }else{
	  System.out.println("Ages not found");
	  }
	  }
	  
	  public void read(){
		  for(int index=0; index<this.getlength(); index++){
			  System.out.println(" the index:" + index);
		  }
	  }
	  
	  }
	  
	 
	 
	  
     
   