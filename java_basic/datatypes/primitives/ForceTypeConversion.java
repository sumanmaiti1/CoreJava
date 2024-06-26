package corejava.java_basic.datatypes.primitives;

public class ForceTypeConversion {
	byte b = 123;
	short s = 13245;
	int i = 987654;
	long l= 987654398778974l;
	
	float f= 123.01234567890123f;
	double d = 12.1234568790123546789e-1;
	char ch = '@';
	
	public static void main(String[] args) {
		ForceTypeConversion a = new ForceTypeConversion();
		
		var temp=((a.b+a.s)/a.i*a.f+a.d-a.ch);
		System.out.println(temp + " -> Class : " + ((Object)temp).getClass().getCanonicalName());
		a.byteCasting(a);
		a.shortCasting(a);
		a.intCasting(a);
		a.longCasting(a);
		a.floatCasting(a);
		a.charCasting(a);					
	}
	
	public void byteCasting(ForceTypeConversion obj) {
		System.out.println("---------------- Doing Force Byte Type casting------------------");		
		System.out.println(obj.b);	
		
		byte s = obj.b;		
		System.out.println(s + ((Object)s).getClass().getName());
		
		byte i = (byte)obj.i;
		System.out.println(i + ((Object)i).getClass().getName());
		
		byte l = (byte)obj.l;
		System.out.println(l + ((Object)l).getClass().getName());
		
		byte f = (byte)obj.f;
		System.out.println(f + ((Object)f).getClass().getName());
		
		byte d = (byte)obj.d;
		System.out.println(d + ((Object)d).getClass().getName());
		
		byte ch = (byte)(short)(int) obj.ch;
		System.out.println(ch + ((Object)ch).getClass().getName());
	}

	public void shortCasting(ForceTypeConversion obj) {
		System.out.println("---------------- Doing Force Short Type casting------------------");		
		System.out.println(obj.s);	
		
		short i =(short) obj.i;
		System.out.println(i + ((Object)i).getClass().getName());
		
		short l =(short) obj.l;
		System.out.println(l + ((Object)l).getClass().getName());
		
		short f =(short) obj.f;
		System.out.println(f + ((Object)f).getClass().getName());
		
		short d =(short) obj.d;
		System.out.println(d + ((Object)d).getClass().getName());
		
		short ch = (short)(int) obj.ch;
		System.out.println(ch + ((Object)ch).getClass().getName());		
	}

	public void intCasting(ForceTypeConversion obj) {
		System.out.println("---------------- Doing Force Int Type casting------------------");		
		System.out.println(obj.i);	
		
		int l =(int) obj.l;
		System.out.println(l + ((Object)l).getClass().getName());
		
		int f =(int) obj.f;
		System.out.println(f + ((Object)f).getClass().getName());
		
		int d =(int) obj.d;
		System.out.println(d + ((Object)d).getClass().getName());
		
		int ch = (int) obj.ch;
		System.out.println(ch + ((Object)ch).getClass().getName());	
	}
	
	public void longCasting(ForceTypeConversion obj) {
		System.out.println("---------------- Doing Force Long Type casting------------------");		
		System.out.println(obj.l);			
		
		long f =(long) obj.f;
		System.out.println(f + ((Object)f).getClass().getName());
		
		long d =(long) obj.d;
		System.out.println(d + ((Object)d).getClass().getName());
		
		long ch = (long) obj.ch;
		System.out.println(ch + ((Object)ch).getClass().getName());	
	}


	public void floatCasting(ForceTypeConversion obj) {
		System.out.println("---------------- Doing Force Float Type casting------------------");		
		System.out.println(obj.f);					
		
		float d =(float) obj.d;
		System.out.println(d + ((Object)d).getClass().getName());
		
		float ch = (float) obj.ch;
		System.out.println(ch + ((Object)ch).getClass().getName());	
	}


	public void charCasting(ForceTypeConversion obj) {
		System.out.println("---------------- Doing Automatic Char Type casting------------------");		
		System.out.println(obj.ch);	
		
		char b = (char)(int)(short)(obj.b + 10);
		System.out.println(i + ((Object)i).getClass().getName());
		
		char s = (char)(int)(obj.s + 10);
		System.out.println(s + ((Object)s).getClass().getName());		
		
		char i = (char) (obj.i + 10);
		System.out.println(i + ((Object)i).getClass().getName());
		
		char l =(char) obj.l;
		System.out.println(l + ((Object)l).getClass().getName());
		
		char f =(char) obj.f;
		System.out.println(f + ((Object)f).getClass().getName());
		
		char d =(char) obj.d;
		System.out.println(d + ((Object)d).getClass().getName());
	}
}
