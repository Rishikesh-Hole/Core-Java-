/*
abstract class extending concrete class and interface 
*/

//abstract class AbstractClassTest2 implements Interface1 extends ConcreateClass  {  -- Error - we should write extends statement before implements statement
abstract class AbstractClassTest2 extends ConcreateClass  implements Interface1 {  	
}

interface Interface1{
	
}

class ConcreateClass{
	
}