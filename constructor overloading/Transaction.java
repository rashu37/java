public class Transaction{

  public String type;
  public int amount;
  public long id;
  public float perbouns;
  public boolean recived;
  
  public Transaction(String type){
	  this(1500,746563728L);
	  //this(6.8F,false);
  this.type=type;
  System.out.println("the type of payment is:"+ type);
  
  }
  
  public Transaction(int amount,long id){
	this(6.8F,false);
  this.amount=amount;
  this.id=id;
  System.out.println("Amount transfered:" + amount+"," + "Account id:" + id);
  }
  
   public Transaction(float perbouns, boolean recived){
	   //this("direct payment");
   this.perbouns=perbouns;
   this.recived=recived;
   System.out.println("Perbouns extra paid in percentage:" + perbouns+ "," + "Amount recived:" + recived);
   }
  
 
   
  
}
  
  
  
  