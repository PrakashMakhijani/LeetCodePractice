//import java.util.*;
//import java.util.stream.Collectors;
//
//public class Main {
//    public static void main(String[] args) {
//
//        // List of person object older than age 30 sorted by name
//
//
//        Sim sim = new Airtel();
//        sim.calling();
//        sim.dialing();
//
//    }
//
//
//    person.stream
//            .filter(p->p.getAge() >30)
//            .sorted((p1,p2)->(p1.getname().compare(p2.getName)))
//            .collect(Collectors.toList());
//
//}
//
//
//public interface Sim{
//    void calling();
//    void dialing();
//}
//
//public class Airtel implements Sim{
//    @java.lang.Override
//    public void calling() {
//
//        System.out.println("Airtel is calling ");
//    }
//
//    @java.lang.Override
//    public void dialing() {
//        System.out.println("Airtel is dialing ");
//    }
//}
//
//
//
//
//
//
//
//
//
//public class FirstUniqoeNumber{
//
//        public static char firstUniqueChar(String myString){
//            HashMap<Character,Integer> myMap = new HashMap<>();
//            for(char c: myString){
//                myMap.put(c,myMap.getOrDefault(c,0)+1);
//            }
//            for(Map.Entry<Character,Integer> abc : myMap.entrySet()){
//
//                if(abc.getValue() ==1){
//                    return abc.getKey();
//                }
//
//            }
//            return '-';
//
//        }
//        public static void main(String[] args){
//            System.out.println(firstUniqueChar("Hello World"));
//        }
//
//        }
//
//        class LongestSubsyring{
//            public static int Longest3Substring(String abc){
//                Set<Character> mySet = new HashSet<>();
//                int left =0;
//                int maxLength=0;
//                for(int right =0;right< abc.length();right++){
//                    while (mySet.contains(abc.charAt(right))){
//                        mySet.remove(abc.charAt(right));
//                        left++;
//                    }
//                    mySet.add(abc.charAt(right));
//                    maxLength = Math.max(maxLength, right-left+1);
//                }
//
//                return maxLength;
//
//            }
//
//            List<String> myString = Arrays.asList("apple","baal","Cat");
//
//            List<String> convertedList = myString.stream()
//                    .filter(s->s.length()>3).map(String::toUpperCase).collect(Collectors.toList());
//
//            List<Integer> number = Arrays.asList(1,4,5,6,7,7,88,8);
//            Optional<Integer>myNumber=number.stream().max(Integer::compareTo)
//        }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////    Arrays.stream(s.trim().split("\\s+")).reduce((second,first)-> second + "" + first).forElse("")
////
////
////        String lowercaseString = s.toLowerCas();
////            lowercaseString.char().filter(c->"aeiou".indexOf(c) != -1).count
////    class MyRunnable implements Runnable{
////        public void run(){
////            for(int i=0;i<=10;i++){
////                System.out.println();
////            }
////        }
////    }
////
////    Optional<Map.Entry<Character,Long>> firstNonRepeated = frequencyMap.entrySet().stream
////}
////collect(Collectors.groupingby(Person::getAge,))
////
////
////@Service
////public class MyService{
////
////    @Autowired
////    private ProductRepository productRepository;
////
////
////    public Product getProductbyId(Long id){
////      return  productRepository.findById(id).orElseTrow(()-> new RerourceNotFoundException)
////    }
////}
////
////
////@RestController
////@RequestMapping('/api/product')
////public class ProdtController{
////
////    @GetMapping('/{id}')
////    public ResponseEntity<Product> getProductbyId(@PathVariable Long id){
////        Product product = productService.g
////                return new ResposeEntity<>(product,httpStatus.OK)
////    }
////}
////
////
////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////                        System.out.println("Hello World");
////
////                       String[] mySTring = {"abb","bcb","bca"};
////                        String[] mySTring2 = {"ab","bc","cd","da"};
////
////                      //
////
////    Thread t = new Thread(()->{
////        System.out.println("Hello World");
////    });
////
////    t.start();
////       System.out.println(chainedString(mySTring));
////        System.out.println(chainedString(mySTring2));
////
////
////        }
////    public static Boolean chainedString(String[] myString1) {
////        for (int i = 0; i < myString1.length; i++) {
////            if ((myString1[i].charAt(myString1[i].length() - 1)) != (myString1[i + 1].charAt(myString1[i].length() - 1))) {
////                return false;
////            }
////
////
////        }
////
////        return true;
////    }
////
////
////
////}
////    class MyThread extends Thread{
////
////    public void run(){
////        System.out.println("Thread is running");
////    }
////}
////
////
////class MyRunnable implements Runnable{
////
////    public void run(){
////
////    }
////}
//
//
