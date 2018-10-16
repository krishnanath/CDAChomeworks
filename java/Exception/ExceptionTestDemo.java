class myException extends Exception
{
	int currentBal,minBalance;
	public myException(int i,int j)
	{
		minBalance=i;
		currentBal=j;
	}
	public String toString()
	{
		return "Your transaction can not be done. Required min balance is "+minBalance+" and yours will be less than that ("+currentBal+")";
	}
}

public class ExceptionTestDemo
{
	public static void main(String args[])
	{
		int accountBal=1000,moneyWithdraw;
		final int minBal=500;
		moneyWithdraw=200;
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