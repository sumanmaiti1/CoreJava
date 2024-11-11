// Left Triangle Star Pattern
//      *
//     **
//    ***
//   ****
//  *****


package corejava.java_basic.simple.practice.pattern;

public class LeftStartTriangle {
    public static void main(String[] args) {
        int noOfRows=4;        
        for (int i=0;i<=noOfRows-1;i++){
            String rowstr = "";
            for(int j=noOfRows-(i+1);j>0;j--){
                rowstr += " ";                
            }
            for(int k=0; k<i+1;k++){
                rowstr += "*";
            }
            System.out.println(rowstr);
        }
    }
}
