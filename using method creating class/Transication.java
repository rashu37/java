public class Transication{
	public static final int extrapaid= 200; 
public static void name(){

System.out.println("The transication done to person: XXX");
}
public static void id(){
String transid="TSID987365472";
System.out.println("The transication id is:" + transid);
}

public static void getpaid(int price){
	int totalprice=price+(Transication.extrapaid);
	System.out.println("the total amount paid:" + totalprice);
	
}
}