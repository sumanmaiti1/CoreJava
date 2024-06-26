//2. Write a Program in Java to Add two Numbers.

package corejava.practice.geeksforgeeks.simple;

public class AddNumbers {
    public static void main(String[] args) {
        int sum = 0;
        try{
            for(String s:args){
                sum += Integer.parseInt(s);
            }
        }
        catch(NumberFormatException e){
            System.err.println("Invalid input given : " + e.toString());
            System.exit(0);
        }
    System.out.println("The sum is :- " + sum);
    }
}
