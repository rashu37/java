public class Camera{

public static int name(String brand){
if(brand=="canon"){
System.out.println("The camera brand name is:"+ " " + brand+ ", " + "lens is:" );
return 50;
}else{
System.out.println("The camera brand name is:"+ " " + brand+ ", " + "lens is:");
return 100;
}
}

public static int brand(int rate){
	if(rate>10000){
		System.out.println("the price of camera is:" + " " + rate + ", " + "extra charge:");
		return 1000;
	}else{
		System.out.println("the price of the camera is:" + " " + rate+ " ," + "extra charge:");
		return 2000;
	}
}
}