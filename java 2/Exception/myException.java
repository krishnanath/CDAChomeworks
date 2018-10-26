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