import java.util.*;

class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Students");
        int numOfStudents = sc.nextInt();
        int stuGrades[] = new int[numOfStudents];
        for(int i=0; i<numOfStudents; i++){

            System.out.println("Enter the grade of Student " + (i+1));
            stuGrades[i] = sc.nextInt();

            while(!(stuGrades[i]>=0 && stuGrades[i]<=100)){

                    System.out.println("Student grade out of bounds. Enter the number again");
                    stuGrades[i] = sc.nextInt();

                }


        }

    }
}

/*Create a class called StudentMarks, which prompts user for the number of students, reads
it from the keyboard, and saves it in an int variable called numOfStudents. It then prompts user
for the grades of each of the students and saves them in an int array called stuGrades. Your
program shall check that the grade is between 0 and 100 else has to trow an error message. */