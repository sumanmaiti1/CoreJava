package corejava.java_basic.control_statements;

public class While1 {
    public static void main(String... args){
        int iterator = 1;

        while(true){
            System.out.println("Jay Shree krishna " + iterator );
            iterator++;
            if(iterator==10){
                iterator=1;
                break;
            }
        }

//        while(false){
//            System.out.println("Jay Shree krishna " + iterator );
//            iterator++;
//            if(iterator==10){
//                break;
//            }
        // ------------ nested while loop -----------------
        l1:
        while(true) {
            while (iterator <= 10) {
                System.out.println("Jay Shree krishna " + iterator);
                iterator++;
                if (iterator == 10) {
                    break l1;
                }
            }
        }

        while(iterator<20){;;;;;;;;;}
    }
}
