package assignment;


import java.util.Scanner;


public class MainMethod 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int choice=0; 
		String str;
		Contact ct=new Contact();
		CallHistory chist=new CallHistory();
		while(choice!=5)
		{
			System.out.println("***Phone***");
			System.out.println("1. Make Call");
			System.out.println("2. ADD Contact");
			System.out.println("3. Show Contacts");
			System.out.println("4. Call History");
			System.out.println("5. Switch off");
			try {
				
			choice=s.nextInt();
			} catch (Exception e) {
				System.out.println("Wrong Entry");
				choice=0;
			}

			switch(choice)
			{
				case 1	:	int ch=-1;
							System.out.println("1. Call By Contact");
							System.out.println("2. Call By Number");
							System.out.println("3. go back");
							try
							{
							ch=s.nextInt();
							} catch (Exception e) {
								System.out.println("Wrong Entry");
								ch=0;
							}
							switch(ch)
							{
								case 1	:	System.out.println("Enter Name");
											str=s.next();
											boolean b=ct.CheckContact(str);
											if(b==true)
											{
												int cho=0;
												while(cho!=1)
												{
													System.out.println("Calling.....");
													System.out.println("Press 1 to terminate");
													cho=s.nextInt();
												}
												chist.AddHistory(str);
											}
											else
												System.out.println("There is no such contact");
											break;
								case 2	:	System.out.println("Enter Number");
											str=s.next();
											if(str.length()!=10)
												System.out.println("Enter Proper No");
											else
											{
												int cho=0;
												while(cho!=1)
												{
													System.out.println("Calling.....");
													System.out.println("Press 1 to terminate");
													cho=s.nextInt();
												}
												chist.AddHistory(str);
											}
												
											
											break;
								default	:	break;
							}
							
							
					
							break;
				case 2	:	System.out.println("Enter Name :  ");
							String name=s.next();
							System.out.println("Enter Number :  ");
							String number=s.next();
							boolean b=ct.CheckContact(name);
							if(b==false)
							{
								ct.AddContact(name, number);
								System.out.println("Contact Added");
							}
							else
								System.out.println("Contact Already Exist");
							break;
				case 3	:	ct.PrintContact();
							break;
				case 4	:	try
							{
								chist.PrintHistory();
							} catch (Exception e) {
								e.printStackTrace();
							}
							break;
				case 5	: 	break;
				
				default	:	System.out.println("Wrong Choice");
			}
		}
		s.close();
	}
	
}
