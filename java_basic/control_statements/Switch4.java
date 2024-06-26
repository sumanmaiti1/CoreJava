package corejava.java_basic.control_statements;

public class Switch4 {
    public static void main(String[] args) {
        int kindergardenAge = 1;
        switch(kindergardenAge){
            default:
                System.out.println("Permitted values are 1 to 6");
                break;
            case 1:
                System.out.println("Age 1 is too young to send in kindergarden ");
            case 2:
                System.out.println("Age 2 is too young to send in kindergarden ");
                break;
            case 3:
                System.out.println("Age 3 can be sent in kindergarden ");
            case 4:
                System.out.println("Age 5 can be sent in kindergarden ");
            case 5:
                System.out.println("Age 5 can be sent in kindergarden ");
                break;
        }
    }
}
