import java.io.Serializable;

public class Student implements Serializable {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int id;

    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }




    @Override
    public String toString() {
        return "student id " + id + " name :" + name;
    }
}
