package corejava.java_basic.oops.constructor;

/*If Parent Class constructor throws an exception, Child class constructor must throw the same Exception
 * or Parent Exception.
 */

public class ConstructorThrowingException {
	public static void main(String[] args) {
		
		// -------------- To create an Object of DD, either we need to Throw Exception or handle in Try Catch --------- 
		try {
			DD d = new DD();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}



class AA{
	AA() throws ArithmeticException{
		System.out.println("Grand Parent Constructor throwing Arithmatic Exception.");
	}
}

class BB extends AA{
	BB() throws ArithmeticException{
		super();
		System.out.println("Parent Constructor throwing Arithmatic Exception [Same as Grand Parent].");
	}
}


class CC extends BB{
	CC() throws RuntimeException{
		super();
		System.out.println("Child Constructor throwing Runtime Exception [Parent Exception of Parent;s contructors exception].");
	}
}

class DD extends CC{
	DD() throws Exception{
		super();
		System.out.println("Grand Child Constructor throwin Exception [Parent Exception of child's contructors exception].");
	}
}