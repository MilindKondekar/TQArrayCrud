import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Person 
{

	private int regId;
	private String name;
    private Date birthdate;
    private int age;
    private Date vaccine[];
    
    
    Person()
    {
    	vaccine = new Date[3];
    }


	public Person(int regId, String name, Date birthdate, int age) 
	{
		this();
		this.regId = regId;
		this.name = name;
		this.birthdate = birthdate;
		this.age = age;
	}


	static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	
	
	public int getRegId() 
	{
		return regId;
	}


	public void setRegId(int regId)
	{
		this.regId = regId;
	}


	public String getName() 
	{
		return name;
	}


	public void setName(String name) 
	{
		this.name = name;
	}


	public Date getBirthdate()
	{
		return birthdate;
	}


	public void setBirthdate(Date birthdate) 
	{
		this.birthdate = birthdate;
	}


	public int getAge() 
	{
		return age;
	}


	public void setAge(int age) 
	{
		this.age = age;
	}


	public Date[] getVaccine() 
	{
		return vaccine;
	}


	public void setVaccine(Date[] vaccine) 
	{
		this.vaccine = vaccine;
	}


	
	public String toString() 
	{
		return "Person regId=" + regId + ", name=" + name +" Birthdate"+formatter.format(birthdate) + ", age=" + age + ", vaccine="
				+ Arrays.toString(vaccine) ;
	}
    
    
    
    
    
    
	
	
	
	
}