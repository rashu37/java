public class Payment{

  public String type;
  public int amount;
  public short employees[];
  public int bouns;
  public long id;
  public float perbouns;
  public boolean recived;
  
  public Payment(String type){
  this.type=type;
  System.out.println("the type of payment is:"+ type);
  }
  
  public Payment(String type,int amount){
  this.type=type;
  this.amount=amount;
  System.out.println("the type of payment is:"+ type+ "," + "Amount transfered:" + amount);
  }
  
  public Payment(String type,int amount,short employees[]){
  this.type=type;
  this.amount=amount;
  
  for(int i=0; i<employees.length;i++){
  System.out.println("the type of payment is:"+ type+ "," + "Amount transfered:" + amount+ "," +
  "amount transfered to employee:"+employees[i]);
  }
  }
  
  public Payment(String type,int amount,long id){
  this.type=type;
  this.amount=amount;
  this.id=id;
  System.out.println("the type of payment is:"+ type+ "," + "Amount transfered:" + amount+"," + "employees id:" + id);
  }
  
   public Payment(String type,int amount,long id,float perbouns){
  this.type=type;
  this.amount=amount;
  this.id=id;
  this.perbouns=perbouns;
  System.out.println("the type of payment is:"+ type+ "," + "Amount transfered:" + amount+"," + "employees id:" + id
  +"," + "bouns given percent"+ perbouns);
  }
  public Payment(String type,int amount,long id,float perbouns,boolean recived){
  this.type=type;
  this.amount=amount;
  this.id=id;
  this.perbouns=perbouns;
  this.recived=recived;
  System.out.println("the type of payment is:"+ type+ "," + "Amount transfered:" + amount+"," + "employees id:" + id
  +"," + "bouns given percent"+ perbouns+ "," + "Recevied bouns to employee:" + recived);
  }
  
}
  
  
  
  