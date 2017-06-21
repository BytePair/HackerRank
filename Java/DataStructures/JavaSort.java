import java.util.*;


class Student {
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}


class StudentCompare implements Comparator<Student> {
    
    public int compare(Student a, Student b) {
     
        if (a.getCgpa() == b.getCgpa()) {
            if (a.getFname().equals(b.getFname())) {
                return a.getId() - b.getId();
            } else {
                return a.getFname().compareTo(b.getFname());
            }
        }
        
        return Double.compare(b.getCgpa(), a.getCgpa());
        
    }
    
}


public class JavaSort {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
      
        List<Student> studentList = new ArrayList<Student>();
        while(testCases > 0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();
         
            studentList.add(new Student(id, fname, cgpa));
         
            testCases--;
        }
       
        // use custom comparator to sort the list
        Collections.sort(studentList, new StudentCompare());
       
      
        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
    
}