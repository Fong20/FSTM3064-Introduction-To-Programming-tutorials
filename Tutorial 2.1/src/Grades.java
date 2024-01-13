import java.util.Scanner;

public class Grades {
	public static void main(String[] args) {

//Declare variables
int score;
char A;
char B;
char C;
char D;
char grade;

Scanner keyboard = new Scanner(System.in);

//Prompt user to enter value
System.out.print("Please enter value:");
score = keyboard.nextInt();

//Grades condition
	if (score >= 90.0) 
		grade = 'A';
	
	
	else if (score >= 80.0) 
		grade = 'B';
	
	
	else if (score >= 70.0)
		grade = 'C';
	
	else if (score >=60.0)
		grade = 'D';
	
	else
		grade = 'F';
	
	System.out.print("Your grade is: " + grade);
	
	keyboard.close();
}
}