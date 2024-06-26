/**
Purpose : This series is for the core java Batches
This is based on Java 17
Ref Books : Java Complete Reference- Herbert Schildt - 12th Edition
Instructor : Suman Maiti
*/

package corejava.java_basic.datatypes.primitives;
//----------Here we will see the LONG Object, long datatype ---------

public class Longs {
    public static void main(String[] args) {
        //------------- Integer is the by default data types for integrals

        System.out.println("Max value of LONG=" + Long.MAX_VALUE);
        System.out.println("Min value of LONG=" + Long.MIN_VALUE);
        System.out.println("BYTES of LONG=" + Long.BYTES);
        System.out.println("BIT SIZE of LONG=" + Long.SIZE);
        System.out.println("TYPE of LONG=" + Long.TYPE);
        System.out.println("TYPE of LONG=" + Long.class);

        long l1 = 12l;
        long l2 = (long)18;
        long l3 = 100l;

        long l4 = Long.valueOf(-30l);

        System.out.println(l1 + l2 + l3 + l4);
        System.out.println(Long.toHexString(l3));
        System.out.println(Long.toOctalString(100000));

        System.out.println(Long.compareUnsigned(l3, l4));
        System.out.println(Long.toBinaryString(-12));
    }
}
