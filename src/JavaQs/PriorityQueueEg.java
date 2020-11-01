package JavaQs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

/*
 * Create the Student and Priorities classes here.
 */
class Student {
    int id;
    double cgpa;
    String name;

    public Student(String name, double cgpa, int id) {
        this.id = id;
        this.cgpa = cgpa;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public double getCgpa() {
        return cgpa;
    }

    public String getName() {
        return name;
    }

}

class Priorities {

    List<Student> getStudents(List<String> events) {

        PriorityQueue<Student> student_queue = new PriorityQueue(Comparator.comparing(Student::getCgpa).reversed()
                .thenComparing(Student::getName).thenComparing(Student::getId));
        List<Student> students = new ArrayList<Student>();
        for (String req : events) {
            String arr[] = req.split(" ");
            String action = arr[0];
            if (action.equalsIgnoreCase("enter"))
                student_queue.add(new Student(arr[1], Double.parseDouble(arr[2]), Integer.parseInt(arr[3])));
            else if (action.equalsIgnoreCase("served"))
                student_queue.poll();
        }
        List<Student> studentlist = new ArrayList<Student>();

        Student first = student_queue.poll();
        if(first == null) 
        return null;
        else{
            while(first != null)
            {
                studentlist.add(first);
                first = student_queue.poll();
            }
        }
        return studentlist;
    }
}

public class PriorityQueueEg {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}