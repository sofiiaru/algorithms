package review;

import java.util.*;

public class ArrayListReview {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Jared"));
        students.add(new Student(2, "Mike"));
        students.add(new Student(3, "Julie"));
        students.add(new Student(4, "Mary"));

        System.out.println("Printing with legacy for loop");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        System.out.println("Printing with iterator");

        Iterator<Student> iter = students.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println("Printing backwards with iterator");

        while(((ListIterator<?>) iter).hasPrevious()) {
            System.out.println(((ListIterator<Student>) iter).previous());
        }

        System.out.println("Printing using for each loop");
        for(Student s: students) {
            System.out.println(s);
        }

        System.out.println("Using lambda");
        students.forEach(student -> System.out.println(student));

        //sorting elements in teh list
        Collections.sort(students, new sortByIdDesc());

        Collections.sort(students, new sortByNameDesc());




    }

    static class sortByIdDesc implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o2.id - o1.id;
        }
    }

    static class sortByNameDesc implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o2.name.compareTo(o1.name);
        }
    }
}


