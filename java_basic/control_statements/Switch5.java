package corejava.java_basic.control_statements;


public class Switch5 {
    public static void main(String[] args) {
        //------------ Switch wih Enum -------------

        enum months {Vaisakha,Jyeshta,Ashadha,Shravana, Bhadrapada, Ashwin, Kartika, Agrahayana, Pausha, Magha, Phalguna, Chaitra}        
        months month = months.Jyeshta;

        switch(month){
            default:
                System.out.println("This is invalid month");
                break;
            case Vaisakha:
                System.out.println("This is Greeshma Ritu.");
                break;
            case Jyeshta:
                System.out.println("This is Greeshma Ritu.");
                break;
        }
        System.out.println("------------------------------------------------");
        //------------ Switch expression -------------

        int[] monthnumbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        for(int number:monthnumbers){
            Object result = switch(number){
                default -> {                    
                    String[] myMonthArray ={"This is Invalid Month"};
                    yield myMonthArray[0];
                }
                case 1,2,3 -> "This is First Quarter "+ number;
                case 4,5,6 -> "This is Secound Quarter "+ number;
                case 7,8,9 -> "This is Third Quarter "+ number;
                case 10,11,12 -> "This is Fourth Quarter "+ number;
            };

            System.out.println(result.toString());
        }
    }
}
