public class OneDriveRunner{

     public static void main(String args[]){
	 
	 
	 OneDrive.tasks("xyz", 8763234567L);
	 
	 String returnvalue=OneDrive.tasks("photos", 250);
	 System.out.println(" " + returnvalue);
	 
	 OneDrive.tasks(25);
	 
	 String value= OneDrive.tasks(500, "seeth123");
	 System.out.println(" " + value);
	 
	 System.out.println(OneDrive.tasks("seeth@123"));
	 }
	 }
	
	 