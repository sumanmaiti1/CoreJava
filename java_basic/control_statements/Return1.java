package corejava.java_basic.control_statements;

public class Return1 {
    public static void main(String... args){
        System.out.println(new Return1().test());
    }

    private String testMethod(){
        return "Har Har Mahadev";
    }

    String test(){
        return testMethod();
    }
}
