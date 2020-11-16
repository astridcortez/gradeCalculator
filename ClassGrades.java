/**
 *
 * @author Astrid Cortez
 * @since 11/13/2020
 * @version 1.0
 */

package classgrades;


import java.util.Scanner;
import java.io.PrintStream;



public class ClassGrades {
    private final Grade[] classGrades = new Grade [5];
    
    //set lab grades into an array of all grades by section
    public void setLabs(Labs labs){
        classGrades[0] = labs;
        
    }
    
    //sets midterm grades into an array of all grades by section
    public void setMidterms(MidtermExams midterms){
        classGrades[1]= midterms;
    }
    
    //sets practice problem grades into an array of all grades by section
    public void setPracticeProblems(PracticeProblems PP){
        classGrades[2]= PP;
        
    }
    
    //sets finale exam grade into an array of all grades by section
    public void setFinalExam(FinalExam finalExam){
        classGrades[3] = finalExam;
        
    }
    
    //sets complete and total grade into an array of all grades by section
    public void setTotalGrade(TotalGrade totalGrade){
        classGrades[4] = totalGrade;
    }
    
    @Override
    public String toString(){
        String totalGradeSections = "Total Lab Grade: " + classGrades[0].getGrade() +
                "\n Total Midterm Grade: " + classGrades[1].getGrade() + 
                "\n Total Practice Problem Grade: " + classGrades[2].getGrade() +
                "\n Final Exam Grade: " + classGrades[3].getGrade() +
                "\n Final Grade: " + classGrades[4].getGrade();
        return totalGradeSections;
        
    }
    
    public static void main(String[] args) throws Exception {
         Scanner sc = new Scanner(System.in);  
        PrintStream ps = new PrintStream("TotalGrade.txt");  

        //Printing to the screen and to a file.
        System.out.println("This is a grade calculator for the class: Data Structures.");
        ps.println("This is a grade calculator for the class: Data Structures.");
        System.out.println("\nGrading is as follows: ");
        ps.println("\nGrading is as follows: ");
        System.out.println("Labs: 16 Points\nMidetems: 20 Points\nPractice Problems: 44 Points\nFinal: 20 Points");
        ps.println("Labs: 16 Points\nMidetems: 20 Points\nPractice Problems: 44 Points\nFinal: 20 Points");
        System.out.println();
        ps.println();

        Labs labGrade = new Labs();  
        PracticeProblems pp = new PracticeProblems();
        MidtermExams midterms = new MidtermExams();
        FinalExam finalTest = new FinalExam();
        TotalGrade total= new TotalGrade();
        ClassGrades grade = new ClassGrades();

        labGrade.printLabs(); //Asks the user to enter all the labs grade
        labGrade.totalLabGrade();    //Sums all the lab grade

        pp.printPPGrades(); //Asks the user to enter all the practice problems grade
        pp.totalPointsPP(); // Sums all the practice problems grade

        midterms.printMidterms(); //Asks the user to enter the midterms grade
        midterms.totalMidtermGrade();   //sums the midterms grade
        
        System.out.print("Final Exam: ");
        ps.print("Final Exam: ");
        int exam = sc.nextInt(); //Asks the user to enter Final grade.
        finalTest.setFinalGrade(exam);
        ps.print(exam);
        System.out.println(exam);

       // adds up all grades from all section into a total grade value
        total.setTotalSumGrade (labGrade.totalLabGrade()+pp.totalPointsPP()+midterms.totalMidtermGrade() + finalTest.getFinalGrade());

        //sets all grades into the one array
        grade.setLabs(labGrade);
        grade.setPracticeProblems(pp);
        grade.setMidterms(midterms);
        grade.setFinalExam(finalTest);
        grade.setTotalGrade(total);

        System.out.println("\n Total Grades:");
        ps.println("\nTotal Grades:");

        //prints all grades of all sections
        System.out.println(grade.toString());
        ps.println(grade.toString());
        
        
        //prints final exam grade to screen and file
        System.out.println("Final Exam: "+ grade.classGrades[3].getScore());
        ps.println("Final Exam: "+ grade.classGrades[3].getScore());
        
        //prints letter grade to screen and file
        System.out.println("Letter Grade: "+ grade.classGrades[4].getGrade());
        ps.println("Letter Grade: "+ grade.classGrades[4].getGrade());
        
        sc.close(); // close Scanner.
        ps.close(); //Close the output file.
        
        
        
    }
    
}
