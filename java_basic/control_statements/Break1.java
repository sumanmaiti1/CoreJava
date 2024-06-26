package corejava.java_basic.control_statements;

public class Break1 {
    public static void main(String[] args) {
        
        //------------ Break with While --------------
        int i = 0;
        while(true){
            i++;
            System.out.println("Jay Shree Ram " + i);
            if(i==10){break;}
        }
        System.out.println("------------------------------------");

        //------------ Break with do While --------------
        i = 0;
        do{
            i++;
            System.out.println("Jay Shree Ram " + i);
            if(i==10){break;}
        }while(i<50);
        System.out.println("------------------------------------");
        
        //------------ Break with for --------------
        for(i=0;i<10;i++){
            System.out.println("Jay Shree Ram " + (i+1));
            if(i==5){
                break;
            }
        }
        System.out.println("------------------------------------");

        //------------ Break with for each--------------
        int[] intArray = {0,1,2,3,4,5,6,7,8,9,10};
        for(int digit:intArray){
            System.out.println("Jay Shree Ram " + (digit+1));
            if(digit==5){
                break;
            }
        }
        System.out.println("------------------------------------");
        
        //------------ Break with Switch--------------
        String[] myStringArray = new String[]{"Jay Shree Ram", "Jay Shree Krishna", "Har Har Mahadev","abc"};
        for (String myStringArray1 : myStringArray) {
            switch (myStringArray1) {
                default :
                    System.out.println("Nothing Matched");
                case "Jay Shree Ram":
                    System.out.println("I am Sri Ram Devotee");
                    break;
                case "Jay Shree Krishna" :
                    System.out.println("I am Sri Krishna Devotee");
                    break;
                case "Har Har Mahadev" :
                    System.out.println("I am Sri Shiva Devotee");
                    break;
            }
        }
    }
}
