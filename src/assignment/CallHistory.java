package assignment;

public class CallHistory implements CallHistortMethod
{
	private String[] history=new String[30];
	int pos=0;
	@Override
	public void AddHistory(String s)
	{
		history[pos++]=s;
	}
	@Override
	public void PrintHistory()
	{
		if(pos==0)
			System.out.println("No History");
		else
		{
			for(int i=pos-1;i>=0;i--)
				System.out.println(history[i]);
		}
	}
}
