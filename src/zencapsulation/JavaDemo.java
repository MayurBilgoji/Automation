package zencapsulation;

public class JavaDemo 
{
	public static void main(String[] args)
	{
		Account a=new Account();
		a.setAccount(400);
		int amt=a.getAmount();
		System.out.println(amt);
		a.setAccount(5000);
		int amtt=a.getAmount();
		System.out.println(amtt);
		
		
	}
	

}
