// Diamond Shaped Pattern
//     *
//    ***
//   *****
//  *******
//  *******
//   *****
//    ***
//     *


package com.corejava.practice.javatpoint.simple.pattern;

public class DiamondShapePattern {
    public static void main(String[] args) {
        int noOfRow = 8;
        int left=0,right=0,mid=0;
        String strRow="";
        int updown = noOfRow/2;
    //------------------ For first part ---up direction ----------
        for(int i=1;i<=updown;i++){
            strRow="";
            String strright = "";
            String strleft = "";
            String strmid = "";
            left = right = updown - i ;
            mid = 2 * i  -1;
            for(int a=1;a<=left;a++){
                strleft += " ";
                strright += " ";
            }
            for(int a=1;a<=mid;a++){
                strmid += "*";
            }
            strRow =strleft + strmid + strright;
            System.out.println(strRow);
        }

        //------------------ For Second part ---down direction ----------
        for(int i=1;i<=updown;i++){
            strRow="";
            String strright = "";
            String strleft = "";
            String strmid = "";
            left = right = i - 1 ;
            mid = 2 * (updown -i) + 1 ;
            for(int a=1;a<=left;a++){
                strleft += " ";
                strright += " ";
            }
            for(int a=1;a<=mid;a++){
                strmid += "*";
            }
            strRow =strleft + strmid + strright;
            System.out.println(strRow);
        }
    }
}
