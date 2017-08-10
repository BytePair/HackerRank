import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Comparator;


class Student {

    int id;
    String name;
    double cgpa;

    // constructor
    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    // returns the id of the student
    public int getID() {
        return this.id;
    }
    
    // returns the name of the student
    public String getName() {
        return this.name;
    }

    // returns the CGPA of the student
    public double getCGPA() {
        return this.cgpa;
    }
}


class Priorities {

    public List<Student> getStudents(List<String> events) {

        PriorityQueue<Student> pq = new PriorityQueue<>(events.size(), 
            new Comparator<Student>() {
                public int compare(Student a, Student b){
                    // first check GPA, highest first
                    if (a.getCGPA() > b.getCGPA()) return -1;
                    if (a.getCGPA() < b.getCGPA()) return 1;
                    // serve by name in ascending case-sensitive alphabetical order
                    if (!a.getName().equals(b.getName())) {
                        return a.getName().compareTo(b.getName());
                    }
                    // if GPA and name the same, sort by ID
                    return a.getID() - b.getID();
                }
            });


        for (String s : events) {
            String[] holder = s.split(" ");
            // if we are serving someone
            if (holder[0].equals("SERVED")) {
                pq.poll();
            }
            // if we are adding someone
            else {
                Student student = new Student(Integer.parseInt(holder[3]), holder[1], Double.parseDouble(holder[2]));
                pq.add(student);
            }
            
        }
        
        List<Student> students = new ArrayList<>();
        
        // add students left in priority queue to the list
        while (!pq.isEmpty()) {
            students.add(pq.poll());
        }
        
        return students;
    }

}


public class PriorityQueue {

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
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }

}
