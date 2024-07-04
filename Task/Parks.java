public class Parks{

public static void name(){

System.out.println("the park name is Playground");
}
     
	 public static void location(String area){
	 if(area=="btm"){
	 System.out.println("the location is correct"+ " "+ area);
	 }else{
	 System.out.println("the location is wrong");
	 }
	 }
	 
	 public static boolean type(double size){
	 if(size==20.96){
	 System.out.println("the area of park is:" + size+ " ,"+ "is playground there");
	 return false;
	 }else{
	 System.out.println("the information is wrong");
	 return true;
	 }
	 }
	
	 
	 
	 }