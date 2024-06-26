package corejava.java_basic.control_statements;

public class DoWhile1 {
    public static void main(String... args) {
        int iterator = 1;
        do {
            System.out.println("Inside do While " + iterator);
        } while (iterator == 0);


        // ---------- Second Do while --------------
        do {
            System.out.println("Inside Do While " + iterator);
            iterator++;
        }
        while (iterator < 11);

        // ---------- Second Do while with Wile nested--------------
        do {
            System.out.println("Inside Do While " + iterator);
            while (iterator < 15) {
                iterator +=2;
            }
            iterator++;
        } while (iterator < 30);
    }
}

