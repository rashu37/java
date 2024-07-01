public class Marks{
public static final int total=6;    //600/100=6
public static void name(){

System.out.println("the Student name is: XXX");
System.out.println("The total subjects are : 6");
}

public static void obtained(int marks){
double totalmarks = (marks/Marks.total);
System.out.println("the total marks obtained: " + totalmarks);
}

public static void result(){
String result="Pass";
System.out.println("The result is :"+ result);

}
}