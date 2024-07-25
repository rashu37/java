public class Movies{

   String names[]=new String[5];
   int index=0;
   
   public int getlength(){
   return names.length;
   }
   
   public String savedetails(String moviename){
	   if(this.index<getlength()){
		   names[index]=moviename;
		   index++;
		   System.out.println("Movie:"+ moviename);
		   return "saved succesfully";
	   }else{
		   System.out.println("movie:" );
		   return "not saved";
	   }
}

     public void read(){
		 for(int index=0; index<this.getlength(); index++){
			 System.out.println("Movie: " + names[index]);
		 }
	 }
	 
	 public String update(String oldname, String newname){
		 for(int index=0; index<this.getlength(); index++){
			 if(names[index]==oldname){
				 names[index]=newname;
				 System.out.println(" " + oldname+" " + "to " + " " + newname);
			 }
		 }
		 return "updated succesfully";
	 }
			
	 public void delete(String name1){
		 for(int index=0; index<this.getlength(); index++){
			 if(names[index]==name1){
				 names[index]=null;
				 System.out.println("deleted " + name1);
			 }
		 }
	 }
				 
   }   
   