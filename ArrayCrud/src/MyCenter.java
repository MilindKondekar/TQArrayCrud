import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MyCenter
{
	static int pCount=0;
	static Scanner sc = new Scanner(System.in);

	static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	
	public static void addperson(Person p1) throws ParseException
	{
		System.out.println("Enter Registration Id");
       p1.setRegId(sc.nextInt());
       
       System.out.println("Enter Name");
       p1.setName(sc.next());
       
       System.out.println("Enter age");
       p1.setAge(sc.nextInt());
       
       System.out.println("Enter birthdate in dd-mm-yyyy");
       String birthdate = sc.next();
       
     
       p1.setBirthdate(formatter.parse(birthdate));
	}

	public static void viewAll(Person p[])
	{
		
		for(int i=0;i<pCount;i++)
		{
			System.out.println(p[i]);
		}
	}
		

	public static void main(String[] args) throws ParseException 
	{

		Person[] p1 = new Person[20];
		int choice=0;
	    String ch=null;	
		
          
		
		do
		{
			System.out.println("1.Add a person"
					+ "\n2.Delete a person"
					+ "\n3.Update a person"
					+ "\n4.View person by id "
					+ "\n5.View all persons"
					+ "\n6.Go for the vaccination dose"
					+"\n7.Press 0 to exit");

			choice = sc.nextInt();

			switch(choice)
			{
			case 1: if(pCount<20)
			{
				p1[pCount] = new Person();
				
				addperson(p1[pCount]);
				pCount++;
			}

			else
			{
				System.out.println("No more registration");
			}
			System.out.println("Do you want to perform more operations(yes/no)");
			ch =sc.next();
            break;
			
			
			case 5: 
			{
				       viewAll(p1);
				       break;
			}
			
			}
			
			
			
			
			
		}while(ch.equalsIgnoreCase("yes"));


	}


}
