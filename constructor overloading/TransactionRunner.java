public class TransactionRunner{

  public static void main(String args[]){
  
  Transaction transaction=new Transaction("online");
  Transaction transaction1=new Transaction((int)30000, 5435678293L);
  Transaction transaction2=new Transaction(5F,true);
   /*Transaction transaction3=new Transaction("offline");
  Transaction transaction4=new Transaction((int)25000, 8765434663L);
  Transaction transaction5=new Transaction(5F,false);*/
  }
  }