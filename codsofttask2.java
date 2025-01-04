package codsoft;
import java.util.Scanner;

public class Codsofttask2 {
	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.println("Enter marks obtained in Subject 1 (out of 100): ");
	        double subject1 = scanner.nextDouble();
	        System.out.println("Enter marks obtained in Subject 2 (out of 100): ");
	        double subject2 = scanner.nextDouble();
	        System.out.println("Enter marks obtained in Subject 3 (out of 100): ");
	        double subject3 = scanner.nextDouble();
	        System.out.println("Enter marks obtained in Subject 4 (out of 100): ");
	        double subject4 = scanner.nextDouble();
	        System.out.println("Enter marks obtained in Subject 5 (out of 100): ");
	        double subject5 = scanner.nextDouble();

	       
	        double totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;

	       
	        double averagePercentage = totalMarks / 5.0;

	        
	        char grade;
	        if (averagePercentage >= 90) {
	            grade = 'A';
	        } else if (averagePercentage >= 80) {
	            grade = 'B';
	        } else if (averagePercentage >= 70) {
	            grade = 'C';
	        } else if (averagePercentage >= 60) {
	            grade = 'D';
	        } else {
	            grade = 'F';
	        }

	  
	        System.out.println("Total Marks: " + totalMarks);
	        System.out.println("Average Percentage: " + averagePercentage + "%");
	        System.out.println("Grade: " + grade);

	        scanner.close();
	    }
	}
