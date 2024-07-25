public class Country{

    String statename[]= new String[5];
	int index=0;
	
	public int getlength(){
	 return statename.length;
	 }
	 
	 public String savedetails(String names){
		 if(this.index<this.getlength()){
			 statename[index]=names;
			 index++;
			 System.out.println("State names:" + names);
			 return "Saved succesfully";
		 }else{
			 System.out.println(" ");
			 return "not saved";
		 }
	 }
	 
	 public void readdetails(){
		 for(int index=0; index<this.getlength(); index++){
			 System.out.println("Read Details:" + statename[index]+ ", " + "in index:" + index);
		 }
	 }
	 
	 public String update(String oldname, String newname){
		 for(int index=0; index<this.getlength(); index++){
			 if(statename[index]==oldname){
				 statename[index]=newname;
				  System.out.println(" " + statename[index]);
				 return "Updated done";
		 }else{
			     System.out.println(" "+ statename[index]);
			     
		      }
		 
	    }
		return " not updated";
	 
	    }
		
		public String delete(String name){
			for(int index=0; index<this.getlength(); index++){
				if(this.statename[index]==name){
					statename[index]=null;
					System.out.println(" " + statename[index]);
					return "Deleted done";
				}else{
					  System.out.println(" " + statename[index]);
				}
			}
			return "Detelted succesfully";
			
			
}


        public void search(String statename1){
			for(String statename2:statename){
				if(statename2==statename1){
				System.out.println("state is found");
			}
		}
		}
}
	 
	 