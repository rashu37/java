public class GooglepayRunner{

public static void main(String args[]){

Googlepay.name();
Googlepay.balance(9000);
System.out.println(Googlepay.transferd(5000));

String returnvalue=Googlepay.used();
System.out.println(" " + returnvalue);
}
}