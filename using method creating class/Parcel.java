public class Parcel{
public static final int extra=50;
public static void name(){
System.out.println("The Parcel from Myntra");
}
public static void day(){
String day= "Sunday";
System.out.println("The parcel came on :" + day);
}

public static void price(){
 int price=120000;
 int totalprice=price+ Parcel.extra;
System.out.println("The salary for employee is " + totalprice );
}

public static void gst(){
float gst= 0.18f;
double amount=(gst*Parcel.extra)+Parcel.extra;
System.out.println("The total extra charges is:" + amount);
}
} 