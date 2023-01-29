import java.lang.*;

public interface IAccountOperations
{
	int a = 10;
	public static void test(){}
	public abstract void addAccount(Account a);
	void removeAccount(Account a);
	Account getAccount(int accountNumber);
	void showAllAccounts();
}