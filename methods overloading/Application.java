public class Application{

  public static void apply(String name){
  System.out.println("the applicant name:" + name);
  }
  
  public static boolean apply(String birthplace, long num){
  System.out.println("Birth place:"+ birthplace + "," + "applicant number:" + num);
  return true;
  }
  
  public static void apply(int date, String dateofbirth){
  System.out.println("applying date is:" + date + "," +"date of birth:" + dateofbirth);
  }
  
  
   public static boolean apply(String address, int no, long phone){
  System.out.println("Address is:" + address + "," + "door no:"+ no + "," + "phone number:"+ phone);
  return true;
  }
  
 }