public class Snacks{

   String names[]=new String[4];
   int index=0;
   
   public int getlength(){
    return names.length;
	}
	
	public String savedetails(String name){
		if(this.index<this.getlength()){
			names[index]=name;
			index++;
			System.out.println("saved snacks:"+ name);
			return "Saved successfully";
		}else{
			System.out.println("not saved: "+name);
			return "not saved";
		}
	}
	
	public void read(){
		for(int index=0; index<this.getlength(); index++){
			System.out.println("Snacks name:"+ names[index]);

		}
	}

    public String update(String oldname, String newname){
         for(int index=0; index<this.getlength(); index++){
             if(names[index]==oldname){
                 names[index]=newname;
                System.out.println(" " + oldname +" " + "to" + " " + newname);
                return "Updated successfully";
			 }else{
                 System.out.println(" ");
			 }
		 }
          return "not updated";
	}		  

		public void search(String name1){
          for(String name2:names){
            if(name1==name2){
			System.out.println(" " + name1);
			}
		  }
		}
		
		
		public String delete(String snacknames){
			for(int index=0;index<getlength(); index++){
				if(names[index]==snacknames){
					names[index]=null;
					System.out.println(" " );
					return "Deleted successfully";
				}else{
					System.out.println(" ");
				}
			}
			return "not deleted";
		}
			
	
	}
   