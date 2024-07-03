public class College{

public static boolean name(String namee){
if(namee=="PDIT"){
System.out.println("The college name is:" + namee);
return true;
}else{
System.out.println("The college name is wrong:");
return false;
}
}
 public static String address( int id){
	 if(id==273){
	 System.out.println("the college address is:" + " " + id);
	 return "Hospet";
	 }else{
		 System.out.println("the college address");
	return "None";
	 }
 }
 
 public static long num( String type){
	 if(type=="degree"){
		 System.out.println("the college is:" + " "+ type);
		 return 87635456278L;
 }else{
	 System.out.println("The college is:" + " " + type);
	 return 5367836L;
 }
 }
 
}
