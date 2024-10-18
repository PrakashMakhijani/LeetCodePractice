import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String args[]){

        int[] myaaray1= {2,7,11,15};
        System.out.println( twoSumMethod(myaaray1, 9));
    }

    public static String twoSumMethod(int[] myArray,int target){

        HashMap<Integer,Integer> myMap= new HashMap<>();

        for(int i=0;i<myArray.length;i++){
            myMap.put(myArray[i],i);
        }

        for(int i=0;i<myArray.length;i++){
            int comp = target - myArray[i];
            if(myMap.containsKey(comp) && myMap.get(comp) !=i){
                return Arrays.toString(new int[]{i, myMap.get(comp)});
            }
        }

        return "";


    }
}
