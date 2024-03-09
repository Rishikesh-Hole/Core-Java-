public class WithdrawLimitExceeded extends RuntimeException{
	WithdrawLimitExceeded(){
		super();
	}
	
	WithdrawLimitExceeded(String expMsg){
		super(expMsg);
	}
	
	WithdrawLimitExceeded(String expMsg, Throwable cause){
		super(expMsg, cause);
	}
}