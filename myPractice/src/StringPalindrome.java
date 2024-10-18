public class StringPalindrome {


    public static Boolean palindromeString(String myString){


        int left = 0;
        int right = myString.length()-1;
        while(left < right){
            if( myString.charAt(left) != myString.charAt(right)){
            return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String args[]){

        String input = "HelloWord";
        System.out.println(palindromeString(input));
        System.out.println(palindromeString("abbba"));

    }
}
