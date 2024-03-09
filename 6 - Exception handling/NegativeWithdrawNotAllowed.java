public class NegativeWithdrawNotAllowed extends Exception{
	NegativeWithdrawNotAllowed(){
		super();
	}
	
	NegativeWithdrawNotAllowed(String expMsg){
		super(expMsg);
	}
	
	NegativeWithdrawNotAllowed(String expMsg, Throwable cause){
		super(expMsg, cause);
	}
}


