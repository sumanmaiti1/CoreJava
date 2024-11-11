// Right Triangle Star Pattern

//*
//**
//***
//****
//*****
//******


package corejava.java_basic.simple.practice.pattern;

public class RightStartTriangle {
    public static void main(String[] args) {
        int noOfRow = 7;
        for(int i=0;i<noOfRow;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
