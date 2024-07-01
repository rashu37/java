public class Reservation{
public static final int extrapaid=1000;
public static void bus(){
int price=2000;
int totalprice=price+ (Reservation.extrapaid);
System.out.println("The reservation amount for bus:" + totalprice);
}

public static void train(){

int price=3000;
int totalprice=price+ (Reservation.extrapaid);
System.out.println("The reservation amount for train:" + totalprice);

}
}