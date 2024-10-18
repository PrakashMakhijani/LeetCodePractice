//
//Given a string s, return the longest
//palindromic
//
//        substring
//in s.
//
//
//
//Example 1:
//
//Input: s = "babad"
//Output: "bab"
//Explanation: "aba" is also a valid answer.

public class PalindromeSubString {

    public static String largetPalindrome(String myString){

        if (myString == null || myString.length() == 0){
            return "";
        }
        String longestString= "";
        for(int i=0;i<myString.length();i++){
            String OddPalindrome = expandAroundcentre(myString,i,i);
            if (OddPalindrome.length() > longestString.length()) {
                longestString = OddPalindrome;
            }
            String evenPalindrome= expandAroundcentre(myString,i,i+1);
            if (evenPalindrome.length() > longestString.length()) {
                longestString = evenPalindrome;
            }
        }


        return longestString;
    }

    private static String expandAroundcentre(String s, int left, int right){
        while(left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }

        return s.substring(left+1,right);
    }




    public static void main(String args[]){
            String input = "babbbababababbababa";
        System.out.println(largetPalindrome(input));
    }

}



