public interface CashWithdrawInterface{
	public void CashWithdraw(int amount) throws NegativeWithdrawNotAllowed;
}

class CashWithdrawImp implements CashWithdrawInterface{
	public static void main(String [] args) throws NegativeWithdrawNotAllowed{
		CashWithdrawImp withdraw = new CashWithdrawImp();
		try{
		withdraw.CashWithdraw(Integer.parseInt(args[0]));
		}
		catch(NegativeWithdrawNotAllowed ae)
		{
			throw new NegativeWithdrawNotAllowed("Negative or zero cash amount is not allowed !! ");
		}
		catch(Exception ae){
			ae.printStackTrace();
		}
	}
	
	public void CashWithdraw(int amount) throws NegativeWithdrawNotAllowed{
		if (amount<=0){
			throw new NegativeWithdrawNotAllowed("Negative or zero cash amount is not allowed !! ");
		}
		else if (amount>20000){
			throw new WithdrawLimitExceeded("You can't withdraw more than 20000 !!");
		}
		else{
			System.out.println(amount + " has been withdrawn successfully !!");
		}
	}
}


/*

D:\Final Interview\Core java\Coding practice\6 - Exception handling>java CashWithdrawImp 1000
1000 has been withdrawn successfully !!

D:\Final Interview\Core java\Coding practice\6 - Exception handling>java CashWithdrawImp -100
Negative or zero cash amount is not allowed !!

D:\Final Interview\Core java\Coding practice\6 - Exception handling>javac CashWithdrawInterface.java

D:\Final Interview\Core java\Coding practice\6 - Exception handling>java CashWithdrawImp -100
Exception in thread "main" NegativeWithdrawNotAllowed: Negative or zero cash amount is not allowed !!
        at CashWithdrawImp.main(CashWithdrawInterface.java:13)

D:\Final Interview\Core java\Coding practice\6 - Exception handling>




D:\Final Interview\Core java\Coding practice\6 - Exception handling>java CashWithdrawImp -100
Exception in thread "main" NegativeWithdrawNotAllowed: Negative or zero cash amount is not allowed !!
        at CashWithdrawImp.main(CashWithdrawInterface.java:13)

D:\Final Interview\Core java\Coding practice\6 - Exception handling>java CashWithdrawImp 20000
20000 has been withdrawn successfully !!

D:\Final Interview\Core java\Coding practice\6 - Exception handling>java CashWithdrawImp 20001
WithdrawLimitExceeded: You can't withdraw more than 20000 !!
        at CashWithdrawImp.CashWithdraw(CashWithdrawInterface.java:25)
        at CashWithdrawImp.main(CashWithdrawInterface.java:9)

D:\Final Interview\Core java\Coding practice\6 - Exception handling>
D:\Final Interview\Core java\Coding practice\6 - Exception handling>java CashWithdrawImp 15000
15000 has been withdrawn successfully !!

D:\Final Interview\Core java\Coding practice\6 - Exception handling>

*/