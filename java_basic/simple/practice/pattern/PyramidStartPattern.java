// Pyramid Star Pattern
//      * 
//     * *
//    * * *
//   * * * * 
//  * * * * *


package corejava.java_basic.simple.practice.pattern;

public class PyramidStartPattern {
    public static void main(String[] args) {
        
        int noOfRow = 5;
        int left =0;
        String strRow="" ;

        for(int i=0;i<noOfRow;i++){
             strRow = "";
            left = (noOfRow-i-1);
            
            for(int a=0;a<left;a++){
                strRow += " ";
            }

            for(int a=0;a<i+1;a++){
                strRow = strRow + "*" + " ";
            }
            
            System.out.println(strRow);
        }        
    }
}
