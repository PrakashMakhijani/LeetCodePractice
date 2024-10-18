import java.util.*;
import java.util.stream.Collectors;

public class LambdaPractice {


    public static void main(String[] args){

        String abc = "My nam is prakash makhijani";
        String[] myarray = abc.split(" ");
        List<String> names = Arrays.asList(myarray);
        List<String>newNames = names.stream()
                .map(word->word.substring(0,1).toUpperCase() + word.substring(1))
                .toList();
        StringBuilder CapsNames = new StringBuilder();
        for(String myString : newNames){
            CapsNames.append(myString);
            CapsNames.append(" ");
        }


       Optional<String> result=  Arrays.stream(abc.split(" "))
                        .map(word->Character.toUpperCase(word.charAt(0))+ word.substring(1))
                                .reduce((a,b)->a+ " " + b);
        System.out.println(CapsNames.toString());
        System.out.println(result.get());


        // Filter String Short than 4 letters
        String[] myArrayString = {"name", "Prakash", "Bob"};
        List<String> result2 =  Arrays.stream(myArrayString).filter(word->word.length()>=4).toList();

        System.out.println(result2);


        List<Integer> myint= Arrays.stream(myArrayString)
                        .map(name ->(int) name.chars()
                                .filter(ch->"aeiou".indexOf(ch) != -1)
                                .count()).toList();

        System.out.println(myint);


        // Vowels in a String
        String myString = "My name is prakash makhijani";

        Long vowels = myString.toLowerCase().chars()
                .filter(ch->"aeiou".indexOf(ch) !=-1)
                .count();

        Long constants = myString.toLowerCase().chars()
                .filter(ch->Character.isLetter(ch) && "aeiou".indexOf(ch) <0)
                .count();
        System.out.println(vowels + " " + constants);
    }

    List<Employee> employees = Arrays.asList(
            new Employee("Alice", 12,"Female", 75000),
            new Employee("Bob", 34,"Male", 50000),
            new Employee("Charlie", 43,"Male", 60000),
            new Employee("Diana", 45,"Female", 80000)
    );


    List<Employee>  femailEmployee = employees.stream().filter(emp->emp.getGender().equals("Female")).toList();

    //Count employees by gender

    Map<String,Long> myMap = employees.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));







}

class Employee{

    private String name;
    private int age;
    private String gender;
    private double salary;

    public Employee(String name, int age, String gender, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }
}
