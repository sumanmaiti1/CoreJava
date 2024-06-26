package corejava.java_basic.control_statements;

public class Continue1 {
    public static void main(String... args){
        //------------ Continue with While --------------
        int i = 0;
        while(true){
            i++;
            if(i<10){continue;}
            System.out.println("Jay Shree Ram " + i);
            if(i==20){break;}
        }
        System.out.println("------------------------------------");

        //------------ Break with do While --------------
        i = 0;
        do{
            i++;
            if(i<10){continue;}
            System.out.println("Jay Shree Ram " + i);            
        }while(i<50);
        System.out.println("------------------------------------");
        
        //------------ Break with for --------------
        for(i=0;i<10;i++){
            if(i<5){
                continue;
            }
            System.out.println("Jay Shree Ram " + (i+1));
        }
        System.out.println("------------------------------------");

        //------------ Break with for each--------------
        int[] intArray = {0,1,2,3,4,5,6,7,8,9,10};
        for(int digit:intArray){
            if(digit==5){
                continue;
            }
            System.out.println("Jay Shree Ram " + (digit+1));
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
                    continue;
                case "Jay Shree Krishna" :
                    System.out.println("I am Sri Krishna Devotee");
                    continue;
                case "Har Har Mahadev" :
                    System.out.println("I am Sri Shiva Devotee");
                    break;
            }
        }
    }
}
