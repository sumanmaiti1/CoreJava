package corejava.java_basic.control_statements;

public class For2 {
    public static void main(String... args){
        int i=10;

        //-------------- for loop with out a body ----------
        for(;;){
            i--;
            System.out.println("Jay Shree krishna " + i);
            if(i==0){break;}
        }

        System.out.println("---------------------------------------------");

        var iterator = 0;
        //------------ For loop with VAR --------------
        for(var a="Suman"; (iterator<a.length() && a.contains("S")); iterator++){
            System.out.print(a.charAt(iterator));
        }

        System.out.println("---------------------------------------------");
        //------------- For loop with multi dimension array ---------------
        int[][] myArray = new int[][]{{0,1,2,3},{4,5,6,7,8,9}};
        for(var k=0;k<myArray.length;k++){
            for(var j=0;j<myArray[k].length;j++){
                System.out.println("Value at [" + k + "," + j + "] is " + myArray[k][j]);
            }
        }
    }
}
