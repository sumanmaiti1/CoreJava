// Left Right Triangle Star Pattern

//       *  
//     * * *
//   * * * * *
// * * * * * * *

package com.corejava.practice.javatpoint.simple.pattern;

public class LeftRightStartTriangle {
    public static void main(String[] args) {
        int noOfRow = 5,left=0,right=0,mid=0;   

        for(int i=0;i<noOfRow;i++){
            String strRow = "";
            left = right = (noOfRow-i-1);
            mid = 2*i+1;
            for(int a=0;a<left;a++){
                strRow += " " ;
            }
            for(int a=0;a<mid;a++){
                strRow += "*" ;
            }

            for(int a=0;a<right;a++){
                strRow += " " ;
            }
            System.out.println(strRow);
        }
    }
}
