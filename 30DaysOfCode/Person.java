import java.io.*;
import java.util.*;


public class Person {
    
    private int age;	
      
    public Person(int initialAge) {

        // Add some more code to run some checks on initialAge
	if (initialAge < 0) {
	    System.out.println("Age is not valid, setting age to 0.");
	    age = 0;
	} 
	else {
	    age = initialAge;
	}
    }

    public void amIOld() {
	
	String ageTest = "";

	// Write code determining if this person's age is old and print the correct statement:
	if (age < 13) ageTest = "You are young.";
	else if (age >= 13 && age < 18) ageTest = "You are a teenager.";
	else ageTest = "You are old.";

	System.out.println(ageTest);
	
    }

    public void yearPasses() {
	
	// Increment this person's age.
	age++;
	
    }	


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {

   	    int age = sc.nextInt();
	    Person p = new Person(age);
	    p.amIOld();

	}

    }

}
