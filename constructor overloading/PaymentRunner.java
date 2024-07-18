public class PaymentRunner{

  public static void main(String args[]){
  
  Payment payment=new Payment("Online through phonepe");
  Payment payment1=new Payment("Online through phonepe",(int)60000);
  
  short employees[]={31000,29000,28000,30000};
  Payment payment2=new Payment("Online through phonepe",(int)60000,employees);
  Payment payment3=new Payment("Online through phonepe",(int)60000,654473572L);
    Payment payment4=new Payment("Online through phonepe",(int)60000,654473572L,4.56F);
	   Payment payment5=new Payment("Online through phonepe",(int)60000,654473572L,4.56F,true);
  }
  }