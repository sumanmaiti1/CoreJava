package corejava.java_basic.control_statements;

public class For1 {
    public static void main(String... args) {
        //----------- First for loop --------------
        for (int i = 0; i < 10; i++) {
            System.out.println("Jay Shree Krishna " + i);
        }

        System.out.println();

        //----------- Second for loop --------------
        for (int i = 0; i < 10; System.out.println("Jay Shree Krishna " + i)) {
            i++;
        }

        System.out.println();

        //----------- third for loop nested --------------
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= 9; j++) {
                System.out.println("Jay Shree Ram " + i + " " + j);
            }
        }

        System.out.println();

        //----------- Fourth for loop --------------
        for (int i =10; i>0; i--)
            System.out.println("Har Har Mahadev " + i );

        System.out.println();

    //----------- Fifth for loop --------------
        //int i,j;
        for(int i =0,j=9; i<=j; i++,j--){
            System.out.println("Har Har Mahadev " + i + " " + j );
        }
    }
}
