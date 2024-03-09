// we can use protected and public only with abstract keyword. Everything else is not not allowed.
// all members of a abstract class are "default" by default 
abstract class AbstractClassTest5{
	//void m1(); // invalid
	abstract void m2();  // valid
	//private abstract void m3();  // invalid
	protected abstract void m4(); // valid
	public abstract void m5(); // valid
	//static abstract void m6(); // invalid
	//final abstract void m7(); // invalid
	final void m8(){}
	void m9(){
		
	}
	
}

