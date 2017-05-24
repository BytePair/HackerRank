import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
    
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    public Student(String firstName, String lastName, int id, int[] testScores) {
        super(firstName, lastName, id);
        this.testScores = testScores;
    }

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public String calculate() {
        int total = 0;
        int numGrades = 0;
        for (int i = 0; i < this.testScores.length; i++) {
            total += this.testScores[i];
            numGrades += 1;
        }
        double finalScore = total / numGrades;
        if (finalScore >= 90 && finalScore <= 100) {
            return "O";
        }
        else if (finalScore >= 80 && finalScore < 90) {
            return "E";
        }
        else if (finalScore >= 70 && finalScore < 80) {
            return "A";
        }
        else if (finalScore >= 55 && finalScore < 70) {
            return "P";
        }
        else if (finalScore >= 40 && finalScore < 55) {
            return "D";
        }
        else if (finalScore < 40) {
            return "T";
        }
        return "Could not find grade";
    }
}

class Inheritance {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}