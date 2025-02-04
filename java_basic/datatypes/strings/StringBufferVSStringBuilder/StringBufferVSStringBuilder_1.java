/**
 * String Buffer and Strig builder objects are ditto same.
 * Apart from the fact that, all the methods in StringBuffer is SYNCHRINISED. but for String Builder they are not.
 * StringBuffer is Thread Safe. StringBuilder is NOT THREAD safe
 * StringBuffer is bit slower than StringBuilder
 * String Buffer is since java 1.0.
 * StringBuilder is from Java 1.5
 */


package corejava.java_basic.datatypes.strings.StringBufferVSStringBuilder;

public class StringBufferVSStringBuilder_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sbf = new StringBuffer();
		StringBuilder sbl = new StringBuilder();
		
		
		
		//--------------- for String Buffer ----------------
		Long startTimestamp = System.currentTimeMillis();
		for(int i=0; i<=1000000 ;i++) {
			sbf.append("- " + i);
		}
		Long endTimestamp = System.currentTimeMillis();
		System.out.println("For String Buffer : " + (endTimestamp-startTimestamp));
				
		
		
		//--------------- for String Builder ----------------
		startTimestamp = System.currentTimeMillis();
		for(int i=0; i<=1000000 ;i++) {
			sbl.append("- " + i);
		}
		endTimestamp = System.currentTimeMillis();
		System.out.println("For String Builder : " + (endTimestamp-startTimestamp));
		
	}

}
