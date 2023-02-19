import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        System.out.println("<-------------   Welcome to the ArrayList   ------------------->");
        List<Student> al = new ArrayList<Student>();

//        add element into arrayList using add() method
        al.add(new Student("Mohacel",1002,3.85f,"CSE"));
        al.add(new Student("Reznu",1024,3.55f,"CSE"));
        al.add(new Student("Asadu",1030,3.50f,"CSE"));
        al.add(new Student("Adi",1033,3.65f,"CSE"));

//        is our List is empty or not using isEmpty() method
        System.out.println(al.isEmpty());

//      Number of Element using size() method
        System.out.println("Number of elements : "+al.size());

//        Access each item from Arraylist using forEach loop
        for(Student s: al){
            System.out.println(s);
        }

    }
}
