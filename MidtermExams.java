/**
 *
 * @author Astrid Cortez
 */
package classgrades;

import java.io.PrintStream;
import java.util.Scanner;


public class MidtermExams extends Grade {
    private final int [] midtermGrades = new int [2];
    private final PrintStream ps;
    Scanner sc = new Scanner(System.in);
    
    //constructor
    public MidtermExams() throws Exception{
        ps = new PrintStream("MidtermGrades.txt");
        
    }
    
    //sets mid term grades
    public void setMidtermGrades(int grade, int midterm){
        midtermGrades[midterm-1] = grade;
        
    }
    
    //sums up total mid term grades
    public int totalMidtermGrade(){
        int total = 0;
        for (int i = 0; i <2; i++){
            total = total + midtermGrades[i];
        }
        
        super.setGrade(total);
        return total;
        
    }
    
    //asks user to input midterm grades
    public void printMidterms(){
        
        System.out.println("Midterm #1 Grade: ");
        ps.print("Midterm #1 Grade: ");
        int midterm = sc.nextInt();
        midtermGrades[0] = midterm;
        System.out.println(midtermGrades[0]);
        ps.print(midtermGrades[0]);
        
        System.out.println("Midterm #2 Grade: ");
        ps.print("Midterm #2 Grade: ");
        midterm = sc.nextInt();
        midtermGrades[1] = midterm;
        System.out.println(midtermGrades[1]);
        ps.print(midtermGrades[1]);
        
        
    }
    
}
