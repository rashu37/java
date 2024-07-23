public class CosmaticsRunner{

    public static void main(String args[]){
	
	Cosmatics cosmatics=new Cosmatics("Cream tone",2500,"Nyaka",0.18f,5.5);
	
	cosmatics.details("Cream tone");
	cosmatics.details1("Cream tone",2300);
	String product=cosmatics.details1("Cream tone",2500,"Nyaka");
	System.out.println(" " + product);
	boolean product2=cosmatics.details2("Cream tone",2500,"Nyaka",0.18f);
	System.out.println(" " + product2);
	}
	}