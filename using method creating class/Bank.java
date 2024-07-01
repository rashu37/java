public class Bank{
	
	public static final String holdername= "XYZ";
    public static final long accnum=36456272763L;	
	public static final int amount=2;
public static void name(){

System.out.println("the bank name is Canara.");
}

public static void holdername(){
String holdername= Bank.holdername;
System.out.println("The holder name is:" + holdername);	
}

public static void accnum(){
	long accnum=Bank.accnum;
	System.out.println("The account number is:" + accnum);
}
public static void getamount(int total){
System.out.println("The daily deposit amount from bank:" + Bank.amount);
int totalamount = total+Bank.amount;
System.out.println("The total balance is:" + totalamount);
}

 }


