/**
 * String Buffer and Strig builder objects are ditto same.
 * Apart from the fact that, all the methods in StringBuffer is SYNCHRINISED. but for String Builder they are not.
 * StringBuffer is Thread Safe. StringBuilder is NOT THREAD safe
 * StringBuffer is bit slower than StringBuilder
 * StringBuffer is since java 1.0.
 * StringBuilder is from Java 1.5
 */

//--------Here we will demonstrate the Thread safety paramether for StringBuffer vs StringBuilder


package corejava.java_basic.datatypes.strings.StringBufferVSStringBuilder;

import java.util.Iterator;

public class StringBufferVSStringBuilder_2 {
	
	//StringBuilder sb = new StringBuilder(2000);
	StringBuffer sb = new StringBuffer(2000);
	
	Runnable r1 =  new Runnable() {
		@Override
		public void run() {
			for(int i=1;i<=5;i++){
				sb.append("\nJay shree Ram " + i);
			}	
		}	
	};
	
	Runnable r2 = new Runnable() {
		
		@Override
		public void run() {
			for(int i=6;i<=10;i++) {
				sb.append("\nJay shree Krishna " + i);
			}
		}
	};
	
	public static void main(String[] args) throws InterruptedException{
		StringBufferVSStringBuilder_2 obj = new StringBufferVSStringBuilder_2();
		
		Thread t1= new Thread(obj.r1);
		Thread t2= new Thread(obj.r2);
		
		t1.start();
		t2.start();
		
		Thread.sleep(1000);
		System.out.println(obj.sb);
	}
	
}
