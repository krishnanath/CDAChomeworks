public class ExceptionTest
{
	public static void main(String args[])
	{
		int accountBal=1000,moneyWithdraw;
		final int minBal=500;
		moneyWithdraw=800;
		try
		{
			if(accountBal-moneyWithdraw < 500)
			{
				throw new myException(minBal, accountBal-moneyWithdraw);
			}
			else
			{
				accountBal-=moneyWithdraw;
				System.out.println("Transaction successfull. Your current balance is "+accountBal);
			}
		}
		catch(myException e)
		{
			System.out.println(e.toString());
		}
	}
}