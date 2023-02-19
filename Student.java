import java.util.Objects;

public class Student {
    private String name;
    private int id;
    private float CGPA;
    private String department;


    public Student(String name, int id, float CGPA, String department){
        this.name = name;
        this.id = id;
        this.CGPA = CGPA;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getCGPA() {
        return CGPA;
    }

    public void setCGPA(float CGPA) {
        this.CGPA = CGPA;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", CGPA=" + CGPA +
                ", department=" + department +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==this){
            return true;
        } else if (obj instanceof  Student){
            Student std = (Student) obj;
            if (name.equals(std.name) && (id== std.id) && (CGPA==std.CGPA) && (department.equals(std.department)) ){
                return true;
            }else return false;
        }else return false;
    }

}
