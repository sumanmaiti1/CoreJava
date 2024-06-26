package corejava.java_basic.datatypes.primitives;

public class AutomaticTypeConversion {
	
	byte b = 123;
	short s = 13245;
	int i = 987654;
	long l= 987654398778974l;
	
	float f= 123.01234567890123f;
	double d = 12.1234568790123546789e-1;
	char ch = '@';
	
	public static void main(String[] args) {
		AutomaticTypeConversion a = new AutomaticTypeConversion();
		a.byteCasting(a);
		a.shortCasting(a);
		a.intCasting(a);
		a.longCasting(a);
		a.floatCasting(a);
		a.charCasting(a);
	}
	
	public void byteCasting(AutomaticTypeConversion obj) {
		System.out.println("---------------- Doing Automatic Byte Type casting------------------");		
		System.out.println(obj.b);	
		
		short s = obj.b;		
		System.out.println(s + ((Object)s).getClass().getName());
		
		int i = obj.b;
		System.out.println(i + ((Object)i).getClass().getName());
		
		long l = obj.b;
		System.out.println(l + ((Object)l).getClass().getName());
		
		float f = obj.b;
		System.out.println(f + ((Object)f).getClass().getName());
		
		double d = obj.b;
		System.out.println(d + ((Object)d).getClass().getName());
	}

	public void shortCasting(AutomaticTypeConversion obj) {
		System.out.println("---------------- Doing Automatic Short Type casting------------------");		
		System.out.println(obj.s);	
		
		int i = obj.s;
		System.out.println(i + ((Object)i).getClass().getName());
		
		long l = obj.s;
		System.out.println(l + ((Object)l).getClass().getName());
		
		float f = obj.s;
		System.out.println(f + ((Object)f).getClass().getName());
		
		double d = obj.s;
		System.out.println(d + ((Object)d).getClass().getName());
	}

	public void intCasting(AutomaticTypeConversion obj) {
		System.out.println("---------------- Doing Automatic Int Type casting------------------");		
		System.out.println(obj.i);			
		
		long l = obj.i;
		System.out.println(l + ((Object)l).getClass().getName());
		
		float f = obj.i;
		System.out.println(f + ((Object)f).getClass().getName());
		
		double d = obj.i;
		System.out.println(d + ((Object)d).getClass().getName());
	}
	
	public void longCasting(AutomaticTypeConversion obj) {
		System.out.println("---------------- Doing Automatic Long Type casting------------------");		
		System.out.println(obj.l);			
		
		float f = obj.l;
		System.out.println(f + ((Object)f).getClass().getName());
		
		double d = obj.l;
		System.out.println(d + ((Object)d).getClass().getName());
	}

	public void floatCasting(AutomaticTypeConversion obj) {
		System.out.println("---------------- Doing Automatic Float Type casting------------------");		
		System.out.println(obj.f);					
		
		double d = obj.f;
		System.out.println(d + ((Object)d).getClass().getName());
	}

	public void charCasting(AutomaticTypeConversion obj) {
		System.out.println("---------------- Doing Automatic Char Type casting------------------");		
		System.out.println(obj.ch);	
		
		int i = obj.ch + 10;
		System.out.println(i + ((Object)i).getClass().getName());
		
		long l = obj.ch;
		System.out.println(l + ((Object)l).getClass().getName());
		
		float f = obj.ch;
		System.out.println(f + ((Object)f).getClass().getName());
		
		double d = obj.ch;
		System.out.println(d + ((Object)d).getClass().getName());
	}

}
