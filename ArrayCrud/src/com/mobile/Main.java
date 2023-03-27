package com.mobile;

import java.util.Scanner;

public class Main {
     
	 static  Scanner sc = new Scanner(System.in);
	 static int count = 0;
	 
	public static void main(String[] args) 
	{
		MobileStore m[] = new MobileStore[20];
		
	/*	m[0] = new MobileStore(1,"Redmi3s","Mi",9000);
		m[1] = new MobileStore(2,"Galaxy","Samsung",25000);
		m[2] = new MobileStore(3,"Realme","realme",5000);
		count =3;*/
		 int ch1;	
		 do {
		System.out.println(" Choose from below operation"
				          + "\n 1. Add mobile"
				          + "\n 2. Delete mobile"
				          + "\n 3. Update mobile"
				          + "\n 4. View Mobile by Brand"
				          + "\n 5. View All mobile"
				          + "\n 6. Press 0 to exit");
		
		 ch1 = sc.nextInt();
		
		switch(ch1)
		{
		   
		case 1: m[count] = new MobileStore();
			    addmobile(m);
			    break;
		
		case 2:System.out.println("Enter Mobile ID");
		        int id = sc.nextInt();
			    deleteMobile(id,m);
			    break;
			    
		case 3: System.out.println("Enter Mobile ID");
		        id = sc.nextInt();
			    updateMobile(id,m);
			    break;
			    
		case 4: System.out.println("Enter Brand Name");
		        String name = sc.next();
		        viewByBrand(name,m);
		        break;
			    
		case 5: viewAllMobile(m);
		        break;
		
		}
		
		
		
		 }while(ch1!=0);

	}

	

	private static void viewByBrand(String name, MobileStore[] m)
	{
		int cnt=0;
		int i;
		for(i=0;i<count;i++)
		{
			if(m[i].getBrand().equalsIgnoreCase(name))
			{
				System.out.println("Mobile ID:"+m[i].getId()
				           +"\nMobile Name:"+m[i].getName()
				           +"\nMobile Price :"+m[i].getPrice());
		
		   System.out.println("===========================================");
			}
			
			cnt++;
		}
		
		if(cnt==0)
		{
			System.out.println("Record Not Found");
		}
		
	}



	private static void addmobile(MobileStore[] m) 
	{
		
		System.out.println("Enter Mobile Id");
		m[count].setId(sc.nextInt());
		
		System.out.println("Enter Mobile Name");
		m[count].setName(sc.next());
		
		System.out.println("Enter Mobile Brand");
		m[count].setBrand(sc.next());
		
		System.out.println("Enter Mobile price");
		m[count].setPrice(sc.nextFloat());
		
		System.out.println("Mobile Added to shop succesfully");
		
		System.out.println("===========================================");
		
		count++;	
	}
	

	private static void deleteMobile(int id,MobileStore m[]) 
	{
		int cnt=0;
		int i;
		int j = 0;
		for(i=0;i<count;i++)
		{
			if(m[i].getId()==id)
			{
				cnt++;
				break;
			}
		}
		if(cnt>0)
		{
			j=i+1;
			while(j!=count)
			{
				m[i] = m[j];
				i++;
				j++;
			}
			count--;	
			System.out.println("Record Deleted Succesfully");
		}
		
		else
		{
			System.out.println("Record Not Found");
		}
		
	}

	
	private static void updateMobile(int id,MobileStore []m)
	{
		int cnt=0;
		int i;
		for(i=0;i<count;i++)
		{
			if(m[i].getId()==id)
			{
				cnt++;
				break;
			}
		}
		
		if(cnt>0)
		{
			System.out.println("Enter new Id");
			m[i].setId(sc.nextInt());
			System.out.println("Enter new Name");
			m[i].setName(sc.next());
			System.out.println("Enter new Brand name");
			m[i].setBrand(sc.next());
			System.out.println("Enter new Price");
			m[i].setPrice(sc.nextFloat());
			
			System.out.println("Record Updated Succesfully");
		}
		
		else
		{
			System.out.println("Record Not Found");
		}
		
		
	}
	
	
	private static void viewAllMobile(MobileStore[] m) 
	{
		System.out.println("--------------All Mobiles--------------");
		for(int i=0;i<count;i++)
		{
			
			System.out.println("Mobile ID:"+m[i].getId()
					           +"\nMobile Brand:"+m[i].getBrand()
					           +"\nMobile Name:"+m[i].getName()
					           +"\nMobile Price :"+m[i].getPrice());
			
			System.out.println("===========================================");
		}
		
	}

	
	
	

}
