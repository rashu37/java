public class Application{

   public String name;
   public int age;
   public int salary;
   public String datebirth;
   public long number;
   public byte experience;
   public boolean govtjob;
   
  
   public Application(){
   System.out.println("Applicant information");
   }
    
   public Application(String name){
   this.name=name;
   System.out.println("Applicant name:" + name);
   }

   public Application(String name,int age){
   this.name=name;
   this.age=age;
   System.out.println("Applicant name:" + name + " ," + "age:"+ age);
   } 

   public Application(String name,byte age, int salary){
	this.name=name;
   this.age=age;
   this.salary=salary;
   System.out.println("Applicant name:" + name + " ," + "age:"+ age+ ", " + "salary:"+ salary);
   }   
   public Application(String name,byte age, int salary,String datebirth){
	this.name=name;
   this.age=age;
   this.salary=salary;
   this.datebirth=datebirth;
   System.out.println("Applicant name:" + name + " ," + "age:"+ age+ ", " + "salary:"+ salary+ ","+ "Date of birth:"+ datebirth);
   }   
   public Application(String name,byte age, int salary,String datebirth,long number){
	this.name=name;
   this.age=age;
   this.salary=salary;
   this.datebirth=datebirth;
   this.number=number;
   System.out.println("Applicant name:" + name + " ," + "age:"+ age+ ", " + "salary:"+ salary+ ","+ "Date of birth:"+ datebirth+ "," + "applicant number:"+ number);
   }  
      
   public Application(String name,byte age, int salary,String datebirth,byte experience){
	this.name=name;
   this.age=age;
   this.salary=salary;
   this.datebirth=datebirth;
  
   this.experience=experience;
   System.out.println("Applicant name:" + name + " ," + "age:"+ age+ ", " + "salary:"+ salary+ ","+ "Date of birth:"+ datebirth + "," + "Experience:" + experience);
   }
   
   


}


