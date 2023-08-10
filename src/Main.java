import data.*;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Student> students = findAllStudent();
        collectStudentGroup(students);

        //Mapping List to Map key values
//        Map<String,Student> studentMap = students
//                .stream()
//                .collect(Collectors.toMap(Student::getName, Function.identity()));

        //Mapping to Map if the key is duplicate
        //Function identity is the object
        //(a,b) referred to key and if the key duplicate then return a/b(the first/second)
//        Map<String,Student> studentMap = students
//                .stream()
//                        .collect(Collectors.toMap(Student::getEmail,Function.identity(),(a,b) -> a));

          //same with above but the last parameter stand for specifying which data type of data structure we want to use
//        Map<String,Student> studentMap = students.stream()
//                        .collect(Collectors.toMap(Student::getEmail,Function.identity(),(a,b) -> a, LinkedHashMap::new));



//        //partioning is grouping with true or false value
//        Map<Boolean, List<Student>> studentMap = students.stream()
//                        .collect(Collectors.partitioningBy(student -> student.getAge() > 25));


//        //grouping by is grouping with the specified data we want to use
//        Map<Object,List<Student>> studentMap = students.stream().collect(Collectors.groupingBy(Student::getDesa));
//        studentMap.forEach((k,v) -> System.out.println("key : " + k  + "\n values : " + v));
//        System.out.println("Student map : " + studentMap.getClass());

    }

    private static List<Student> findAllStudent() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1L,"Faqih Abdul Rachman", EDesa.THB, ECategoryStudent.PGM, EKelompok.KLP1,EGender.MALE,"iamfaqih.rochman@gmail.com","089514523914",28));
        students.add(new Student(2L,"Nurlaeli", EDesa.THB, ECategoryStudent.PGM, EKelompok.KLP1,EGender.FEMALE,"nurlaeli@gmail.com","089514533914",28));
        students.add(new Student(3L,"Kaishi Anshori yasir", EDesa.PERUM, ECategoryStudent.PRA_REMAJA, EKelompok.KLP2,EGender.MALE,"iamfaqih.rochman@gmail.com","089514543914",15));
        students.add(new Student(4L,"Kholid Zafran", EDesa.KRJ, ECategoryStudent.REMAJA, EKelompok.KLP2,EGender.FEMALE,"kholid@gmail.com","089514553914",14));
        students.add(new Student(5L,"Kaindra", EDesa.KRJ, ECategoryStudent.PRA_REMAJA, EKelompok.KLP3,EGender.FEMALE,"kaindra@gmail.com","089514563917",11));
        students.add(new Student(6L,"Angkasa", EDesa.PERUM, ECategoryStudent.REMAJA, EKelompok.KLP4,EGender.FEMALE,"angkasa@gmail.com","089514523914",10));
        return students;
    }

    private static void collectStudentGroup(List<Student> students) {
       Map<Object,List<Student>> objectListMap =  students.stream().collect(Collectors.groupingBy(Student::getDesa));
       objectListMap.forEach((k,v) -> System.out.println("key : " + k + "\n : value : " + v));
    }

    private static void partitioning(List<Student> students) {
        Map<Boolean,List<Student>> booleanListMap = students.stream().collect(Collectors.partitioningBy(student -> student.getAge() > 15));
        booleanListMap.forEach((k,v) -> System.out.println("key : " + k + "\n value : " + v));
    }

    private static void listToMap(List<Student> students) {
        Map<String,Student> studentMap = students.stream()
                .collect(Collectors.toMap(Student::getEmail, x -> x));
        studentMap.forEach((k,v) -> System.out.println("key : " + k + " \n value : " + v));
    }

    private static void listToMapDuplicateKey (List<Student> students) {
        Map<String, Student> studentMap = students.stream()
                .collect(Collectors.toMap(Student::getEmail, Function.identity(),(a,b) -> a,LinkedHashMap::new));
        studentMap.forEach((k,v) -> System.out.println("key : " + k + "\n value : " + v));
    }

}