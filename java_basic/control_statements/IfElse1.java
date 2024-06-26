package corejava.java_basic.control_statements;

public class IfElse1 {
    public static void main(String[] args) {
        int a =10, b=12;
        if(a==b){
            System.out.println("a and b are same");
        } else{
            System.out.println("a and b are not same");
        }

        if(a>b){
            System.out.println("a is greater than b");
        } else{
            System.out.println("b is either equal or greater than a");
        }

        if(a<b){
            System.out.println("b is greater than a");
        } else{
            System.out.println("a is either equal or greater than b");
        }
    }
}
