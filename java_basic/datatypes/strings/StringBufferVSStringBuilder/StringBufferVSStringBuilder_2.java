/**
 * String Buffer and Strig builder objects are ditto same.
 * Apart from the fact that, all the methods in StringBuffer is SYNCHRINISED. but for String Builder they are not.
 * StringBuffer is Thread Safe. StringBuilder is NOT THREAD safe
 * StringBuffer is bit slower than StringBuilder
 * String Buffer is since java 1.0.
 * StringBuilder is from Java 1.5
 */


package corejava.java_basic.datatypes.strings.StringBufferVSStringBuilder;

public class StringBufferVSStringBuilder_2 implements Runnable {
	
	StringBuffer sbf = new StringBuffer();
	StringBuilder sbl = new StringBuilder();
	
	Runnable r1= new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=1;i<=5;i++) {
				sbf.append("Jay Shree Krishna - " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(sbf);
			}
		}
	};
	
	Runnable r2= new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int j=6;j<=10;j++) {
				sbf.append("Jay Shree Ram - " + j);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(sbf);
			}
		}
	};
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBufferVSStringBuilder_2 obj = new StringBufferVSStringBuilder_2();
		Thread t1 = new Thread(obj.r1);
		Thread t2 = new Thread(obj.r2);
		
		t1.start();
		t2.start();
		
		
		
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
