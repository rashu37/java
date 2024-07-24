public class Alphabets{


   char elements[]= new char[10];
   int index=0;
   
   public int getlength(){
     return elements.length;
	 }
	
    public String getalpha(char values){
		if(this.index<this.getlength()){
			elements[index]=values;
			index++;
			System.out.println("the alphabets:" + values);
			return "Available";
		}else{
			System.out.println("Not alphabets:");
			return "not available";
		}
    	
    }
	
	public void read(){
		for(int index=0; index<this.getlength(); index++){
			System.out.println(" the index:" + index);
		}
	}
}
   