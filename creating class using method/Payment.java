public class Payment{
	public static final double extra=1.2;

public static void name(){

System.out.println("The paid by person is: someone");
}

public static void paid(){
	
	System.out.println("The payment mode is online");
	System.out.println("The extra paid is:" +Payment.extra);
}
public static void getextra(int payment){
double totalpaid= payment+Payment.extra;	
	System.out.println("The total amount paid is:" + totalpaid);
}
} 