public class Employee{

  public String type;
  public int amount;
  public long id;
  public float perbouns;
  public boolean recived;
  
  public Employee(String type){
  this("Geetha",(int)2222);
  this.type=type;
  System.out.println("the type of payment is:"+ type);
  return;
  }
  
  public Employee(String type,int amount){
  this(465678398l,9.8f);
  this.type=type;
  this.amount=amount;
  System.out.println("to employee:"+ type+ "," + "Amount transfered:" + amount);
  return;
  }
  
  public Employee(long id,float perbouns){
  this(true);
  this.id=id;
  this.perbouns=perbouns;
  System.out.println("employees id:" + id +"," + "bouns given percent:"+ perbouns);
  return;
  }
  
  public Employee(boolean recived){
  this.recived=recived;
  System.out.println("Recevied bouns to employee:" + recived);
  return;
  }
  
  public void paymenttype(){
	  System.out.println("type of payment:"+ amount);
  }

   public void employeeid(long id,float perbouns){
    System.out.println("Employee id:" + id + ", " + " Bouns in percentage:" + perbouns);
}	
  public void paymentreceived(boolean recived){
	  System.out.println("Payment recived to employee:" + recived);
  }
}
  
  
  
  