import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo 
{

	public static void main(String[] args) {
		
		
		Date birthdate = new Date(2020,10,23);
	    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
	    
	    
	    System.out.println((formatter.format(birthdate)));
		
	}
	
}
