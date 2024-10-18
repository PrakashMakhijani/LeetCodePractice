import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergeSortedArray {

    public static int[]  megeSortedArray(int[] array1, int[] array2){

        int length1= array1.length;
        int length2 = array2.length;

        int[] mergedarray = new int[length1+ length2];
        int i=0,j=0,k=0;
        while(i<length1 && j<length2){
            if(array1[i]<=array2[j]){
                mergedarray[k++] = array1[i++];

            }else{
                mergedarray[k++] = array2[j++];

            }
        }

        while (i < length1) {
            mergedarray[k++] = array1[i++];
        }

        // Copy remaining elements of array2, if any
        while (j < length2) {
            mergedarray[k++] = array2[j++];
        }



        return mergedarray;
    }
    public static void main(String args[]){
        int[] array1 = {1,4,6,7};
        int[] array2 = {2,5,6,8};
        int [] result = megeSortedArray(array1,array2);
        Set<Integer> mySet = new HashSet<>();

        for(int a: result){
            mySet.add(a);
        }
      //  Set<Integer> mySet = new HashSet<>(Arrays.asList(result));
        System.out.println("merged array "+ Arrays.toString(result));
        System.out.println("merged Array unique :" + mySet);
    }
}
