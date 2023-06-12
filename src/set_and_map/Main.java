package set_and_map;

import java.util.HashSet;
import java.util.Set;

public class Main {
    private static class Student {
        public int id;
        public String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "{ID: " + this.id + ", Name: " + this.name + "}";
        }

        @Override
        public boolean equals(Object obj){
            Student otherStudent = (Student) obj;
//            return fasle;
            return !(this.id == otherStudent.id && this.name == otherStudent.name);
        }

        @Override
        public int hashCode(){
            return (this.name + "-" + this.id).hashCode();
        }
    }

    public static void main(String[] args) {
    // Set dựa trên hashcode để làm key, ta override hàm hashcode,
        // khi add nó sẽ dựa trên giá trị key tuân theo công thức ta định nghĩa và cho ra giá trị giống nhau,
        // do đó, Set sẽ loại bỏ key bị trùng

        // Như vậy nếu ta coi 2 object là như nhau trong Set hay Map thì phải override 2 hàm equals và hashCode tuỳ business
        Set<Student> myStudents = new HashSet<>();
        Student s1 = new Student(1, "Jack");
        Student s2 = new Student(2, "Adam");
        Student s3 = new Student(1, "Jack");

        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);

        for (Student student : myStudents) {
            System.out.println(student);
        }

        System.out.println("s1 == s3: " + (s1 == s3));
        System.out.println("s1 == s3: " + (s1.equals(s3)));
        System.out.println("s1 hashcode: " + s1.hashCode());
        System.out.println("s3 hashcode: " + s3.hashCode());

    }
}
