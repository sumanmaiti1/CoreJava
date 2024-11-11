// How to Generate Random Number in Java

package corejava.java_basic.simple.practice;


public class RandomNumber {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
        System.out.print(RandomNumber.generateRandomRumber(-100000000,999999999) + " ");
        }
        System.out.println("");
        for(int i=0;i<=10;i++){
        System.out.print(RandomNumber.generateRandomRumber((byte)18) + " ");
        }
    }
    public static long generateRandomRumber(long min, long max){
        return (long)(Math.random()*(max-min+1)+min);
    }
    public static String generateRandomRumber(Byte noOfDigit){
        String numberstring = "";
        int a=0;
        for(int i=0;i<noOfDigit;i++){
            a = (int)(Math.random()*10);
            if(i==0 && (a==0)){
                i--;
                continue;
            }
            numberstring += a;
        }
        return numberstring;
    }
}
