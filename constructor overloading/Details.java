public class Details{

  public String name;
  public int age;
  public String city;
  public double salary;
  public boolean isactive;
  
  
  public Details(String name){
  this("Radha",22);
  this.name=name;
  System.out.println("the person name is:" + name);
  return;
  }
  
  public Details(String name,int age){
  this("setha" ,23,"hospet");
  this.name=name;
  this.age=age;
  System.out.println("the person name is:" + name + ", " + "age:" + age);
  return;
  }
  
  public Details(String name,int age,String city){
	  this("Shree",25,"bengaluru",30000.34);
  this.name=name;
  this.age=age;
  this.city=city;
  System.out.println("the person name is:" + name + ", " + "age:" + age+ ", " + "city:" + city);
  return;
  }
  
  public Details(String name,int age,String city,double salary){
	  this("shree",24,"hospet",35000.43,true);
  this.name=name;
  this.age=age;
  this.city=city;
  this.salary=salary;
  System.out.println("the person name is:" + name + ", " + "age:" + age+ ", " + "city:" + city+ "," + "Salary:" + salary);
  return;
  }
  
  public Details(String name,int age,String city,double salary,boolean isactive){
	 
  this.name=name;
  this.age=age;
  this.city=city;
  this.salary=salary;
  this.isactive=isactive;
  System.out.println("the person name is:" + name + ", " + "age:" + age+ ", " + "city:" + city+ "," +
  "Salary:" + salary+ "," + "Is person active:" + isactive);
  return;
  }
  
  
  public void namedetails(){
	  System.out.println("name is:" + name);
	  return;
  }
  
    public void agedetails(String name,int age){
		System.out.println("name is:" + name + "," + "age:" + age);
		return;
  }
  
    public void citydetails(String name,int age,String city){
		System.out.println("name is:" + name + "," + "age:" + age+ "," + "city:" + city);
		return;
}
}