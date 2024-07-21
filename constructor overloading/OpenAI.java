public class OpenAI{
  
  
  public String name;
  public String find;
  public byte rating;
  public int permium;
  public boolean result;
  
   public OpenAI(String name){
   this.name=name;
   System.out.println("the opening app:" + name);
   }
   
   public OpenAI(String find,byte rating){
   this.find=find;
   this.rating=rating;
   System.out.println("Finding for:" + find+"," + "Ratings for app:" + rating);
   }

   public OpenAI(int permium){
   this.permium=permium;
   System.out.println("the permium for month:" + permium);
   }
   
   public OpenAI(boolean result){
   this.result=result;
   System.out.println("Is result found:" + result);
    }

}	
