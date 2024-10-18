import java.util.*;
import java.util.stream.Collectors;

public class LambdaBasics {




    public static void main(String[] args){

        List<List<Integer>> myList = Arrays.asList(
                Arrays.asList(1,4,6),
                Arrays.asList(5,7,8),
                Arrays.asList(8,0,7)
        );

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Edward", "alice", "bob");

        List<Integer> myNewList = Arrays.asList(3,5,7,2,4,5,8,9,6,5,4,8,0,4);
        List<Integer> newList = myList.stream()
                .flatMap(List::stream)
                .sorted(Comparator.naturalOrder())
                .toList();

        List<Integer> newListreverseOrder = myList.stream()
                .flatMap(List::stream)
                .sorted(Comparator.reverseOrder())
                .toList();

        //Distinct
        long distinctListcount = myNewList.stream()
                        .distinct().count();

        //square of numbers
        List<Integer> listSquare = myNewList.stream()
                .map(n -> n * n).toList();


        //sum of List
        Integer sumOfList = myNewList.stream()
                        .reduce(0,Integer::sum);

        Optional<Integer> maxNumber = myNewList.stream()
                        .max(Integer::compareTo);

        Map<Boolean, List<Integer>> evenOdd = myNewList.stream()
                        .collect(Collectors.partitioningBy(n->n%2==0));

        // 4. Reducing: Concatenate all names into a single string
        String concatenatedNames = names.stream()
                .reduce("", (s1, s2) -> s1 + ", " + s2).replaceFirst(", ", ""); // Remove leading comma
        System.out.println("Concatenated Names: " + concatenatedNames);

        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .toList();
        System.out.println("Names starting with 'A': " + filteredNames);

        // Converting names to uppercase
        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println("Uppercase Names: " + upperCaseNames);

        // 1. Filtering: Get names that start with 'A' or 'a'
        List<String> namesStartingWithA = names.stream()
                .filter(name -> name.toLowerCase().startsWith("a"))
                .collect(Collectors.toList());
        System.out.println("Names starting with 'A': " + namesStartingWithA);


        // 3. Sorting: Sort names in alphabetical order
        List<String> sortedNames = names.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted Names: " + sortedNames);


        // 5. Counting: Count names with length greater than 3
        long countLongNames = names.stream()
                .filter(name -> name.length() > 3)
                .count();
        System.out.println("Count of Names longer than 3 characters: " + countLongNames);

        System.out.println(newList);
        System.out.println(newListreverseOrder);
    }
}
