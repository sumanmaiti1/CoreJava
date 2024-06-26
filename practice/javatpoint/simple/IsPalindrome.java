// Palindrome Program in Java

package corejava.practice.javatpoint.simple;

public class IsPalindrome {
    public static void main(String[] args) {        
        System.out.println(new IsPalindrome().isPalindrome(4514));
        System.out.println(new IsPalindrome().isPalindrome1(12321));
        System.out.println(new IsPalindrome().isPalindrome("sumus"));
    }
    private String isPalindrome(int num){
        int result = num,reverse=0, reminder = 0;
        while(result>0){
            reminder = result%10;
            result = result/10;
            reverse = reverse*10 +reminder;
        }

        return (reverse==num)?"Is Palindrome":"NOT palindromr";
    }

    private String isPalindrome1(int num){
        int result = num,reminder=0;
        String reverse = "";
        while(result>0){
            reminder = result%10;
            result = result/10;
            reverse = reverse +reminder;
        }
        return (Integer.parseInt(reverse)==num)?"Is Palindrome":"NOT palindromr";
    }
    
    private String isPalindrome(String str){
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse += str.charAt(i);
        }
        return (reverse.equals(str))?"is Palindrome":"NOT palindrome";
    }
}
