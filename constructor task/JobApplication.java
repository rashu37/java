public class JobApplication{

   public String name;
   public short age;
   public int salary;
   public String qualification;
   public String skills[];
   public float marks;
   public boolean govtjob;

   
      
   public JobApplication(String name,short age, int salary,String qualification,String skills[],float marks,boolean govtjob){
	this.name=name;
    this.age=age;
    this.salary=salary;
    this.qualification=qualification;
	this.marks=marks;
	this.govtjob=govtjob;
	
	for(int i=0; i<skills.length; i++)
  
      System.out.println("Applicant name:" + name + " ," + "age:"+ age+ ", " + "salary:"+ salary+ ","+"Qualification:"+qualification+ "," + 
     "Skills:"+ skills[i] + ","+ "Degree marks:"+ marks+"," +"Is government job:" + govtjob);
    }
	
	
	public void eligible(int age){
		if(this.age>18){
			System.out.println("The eligible to job application:"+ "," + "age:" + age);
			
		}else{
			System.out.println("not eligible for job application");
		}
	}
	
	public String eligible1(String qualification){
		if(this.qualification==qualification){
			System.out.println("The eligible to job application:"+ "," + "qualification:" + qualification);
			return "Eligible";
			}else{
			System.out.println("not eligible for job application");
			return "not Eligible";
		}
	}
		
	public void eligible2(String qualification,String skills[]){
		if(this.qualification==qualification && this.skills==skills){
			System.out.println("The eligible to job application:"+ "," + "qualification:" + qualification+"," + "Skills:" +skills);
			}else{
			System.out.println("not eligible for job application"+ "," + "Skills:" +skills);
		}
	}
     public boolean eligible1(String qualification,float marks){
		if(this.qualification==qualification && this.marks==marks){
			System.out.println("The eligible to job application:"+ "," + "qualification:" + qualification + ", " + "Degree marks:" + marks);
			return true;
			}else{
			System.out.println("not eligible for job application");
			return false;
		}
	}


}


