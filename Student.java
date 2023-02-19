public class Student {
    String name;
    int id;
    float CGPA;
    String department;

    public Student(String name, int id, float CGPA, String department){
        this.name = name;
        this.id = id;
        this.CGPA = CGPA;
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
}
