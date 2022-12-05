package sort;

import java.util.ArrayList;
import java.util.List;

public class Person {


    private String name;

    private Integer id;

    private Integer rollNo;


    public Person(String name, Integer id, Integer rollNo) {
        this.name = name;
        this.id = id;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public static void main(String args[]){

        List<Person> personList = new ArrayList<>();

        personList.add(new Person("nsa", 23, 34));
        personList.add(new Person("dasflkd", 343, 34324));
        personList.add(new Person("asflkd", 343, 34324));

        for (Person person :
                personList) {
            System.out.println(person.getName());
        }

        System.out.println("------------------");

        personList.sort(new NameComparator());


        for (Person person :
                personList) {
            System.out.println(person.getName());
        }


    }



}
