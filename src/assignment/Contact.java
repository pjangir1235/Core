package assignment;

public class Contact implements ContractMethod
{
	private String[] name=new String[30];
	private String[] number=new String[30];
	int pos=0;
	@Override
	public void AddContact(String name,String number)
	{
		this.name[pos]=name;
		this.number[pos++]=number;
	}
	@Override
	public boolean CheckContact(String str)
	{
		for(int i=0;i<=pos;i++)
			if(str.equals(name[i]))
				return true;
			
		return false;
		
	}
	@Override
	public void PrintContact()
	{
		for(int i=0;i<pos;i++)
			System.out.println(name[i]+"\t "+number[i]);
				
	}
	
	
}
