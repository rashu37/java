public class Bank{
public static void id(){
int id=10;
if(id==10){
System.out.println("the person id is:" + id);
}else{
System.out.println("the person id is wrong:" + id);
}
}
public static void name(){
System.out.println("The person name is xxx");
}

public static void balance(){
	int balance =1500;
	if(balance<15000){
		System.out.println("the bank balance is:" + balance);
	}else{
		System.out.println("the bank balance is more:" + balance);
	}
}

public static void credit(){
	int credit=1000;
	if(credit==10000){
		System.out.println("The credited amount is :" + credit);
	}else{
		System.out.println("The amount is not credited");
	}
}	
}