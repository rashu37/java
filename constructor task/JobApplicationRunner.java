public class JobApplicationRunner{

  public static void main(String args[]){
   String skills[]={"java","C++","HTML","CSS"};
  JobApplication job=new JobApplication("Jeevan",(short)35,(int)30000,"BE",skills,7.23f, false);
  System.out.println(" " + job);
  
  job.eligible(24);
  
  String taken=job.eligible1("BSC");
  System.out.println(" " + taken);
  
  job.eligible2("BE",skills);
  
  boolean taken1=job.eligible1("BE",7.23f);
  System.out.println(" " + taken1);
  }
  }