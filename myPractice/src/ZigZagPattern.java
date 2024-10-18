//The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
//
//        P   A   H   N
//        A P L S I I G
//        Y   I   R
//        And then read line by line: "PAHNAPLSIIGYIR"
//
//        Write the code that will take a string and make this conversion given a number of rows:
//
//        string convert(string s, int numRows);


import java.util.HashMap;

public class ZigZagPattern {

    public static String zigZag(String myString, int numRow){
        HashMap<Integer, String> tempHashMap = new HashMap<>();

        int row = 1;
        boolean increase = true;
        int index = 0;
        while(index < myString.length()){
            String carry = tempHashMap.getOrDefault(row,"");
            tempHashMap.put(row,carry+myString.charAt(index));
            index++;

            if(increase){
                row++;
                if(row == numRow){
                    increase = false;
                }
            }else if(!increase){
                row --;
                if(row ==1){
                    increase = true;
                }
            }
        }

        String ans = "";
        for(int r : tempHashMap.keySet()){
            ans = ans + tempHashMap.get(r);
        }

        return ans;
    }

    public static void main (String args[]){

        System.out.println(zigZag("PAYPALISHIRING", 3));
    }
}
