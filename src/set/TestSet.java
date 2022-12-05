package set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class TestSet {



    public static void main(String srgs[]){

        Student student = new Student(1L, "sanam", "matatritha");
        Student student2 = new Student(2L, "hello", "helo");
        Student student3 = new Student(1L, "sanam", "matatritha");

        Set<Student> students = new HashSet<>();
        students.add(student);
        students.add(student2);
        students.add(student3);

        for (Student student1 :
                students) {
            System.out.println("name " + student1.getName() + "addres " + student1.getAddress());
        }
    }



}

class Student{

    public Student(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    private Long id;

    private String name;

    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    // this equals is checking if two object are equal or not
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return Objects.equals(id, student.id) && Objects.equals(name, student.name) && Objects.equals(address, student.address);
//    }
//
//    // creating has code with three parameter
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name, address);
//    }

    @Override
    public String toString() {
        return  "id" + id + " name : " + name + " address : " + address;
    }
}
