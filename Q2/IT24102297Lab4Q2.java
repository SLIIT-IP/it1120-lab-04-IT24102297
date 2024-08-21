import java.util.Scanner;

public class IT24102297Lab4Q2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Exam marks
        System.out.print("Please enter exam marks (out of 100): ");
        double exam_marks = scanner.nextDouble();

	
        while (exam_marks < 0 || exam_marks > 100) 
	{
            System.out.println("Invalid input for the exam marks. Terminating program. ");
            System.out.println();
	
		
		System.out.print("Please enter exam marks (out of 100): ");
        	exam_marks = scanner.nextDouble();
        }

		

        // Lab marks
        System.out.print("Please enter lab submission marks (out of 100): ");
        double lab_marks = scanner.nextDouble();
        while (lab_marks < 0 || lab_marks > 100) 
	{
            System.out.println("Invalid input for the exam marks. Terminating program. ");
            System.out.println();

		System.out.print("Please enter lab submission marks (out of 100): ");
        	lab_marks = scanner.nextDouble();

	
        }



        // Input the percentage taken from the exam mark and the lab submission mark

        System.out.print("Please enter the percentage given for the exam: ");
        double exam_percentage = scanner.nextDouble();

        System.out.print("Please enter the percentage given for the lab submission: ");
        double lab_percentage = scanner.nextDouble();

        while (exam_percentage + lab_percentage != 100) 
	{
            System.out.println("The percentage must add up to 100.Terminating program.");

            System.out.println(); 
	    System.out.print("Please enter the percentage given for the exam: ");
            exam_percentage = scanner.nextDouble();

            System.out.print("Please enter the percentage given for the lab submission: ");
            lab_percentage = scanner.nextDouble();
        }
	
        // Calculating the final marks

        double final_marks = (exam_marks * exam_percentage / 100) + (lab_marks * lab_percentage / 100); 
	System.out.println();  
	System.out.print("Final mark is: " + final_marks);

        
    }
}
