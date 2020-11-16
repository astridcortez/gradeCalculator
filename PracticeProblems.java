/**
 *
 * @author Astrid Cortez
 */
package classgrades;

import java.io.PrintStream;
import java.util.Scanner;


public class PracticeProblems extends Grade {
    
    private final Scanner sc = new Scanner(System.in);
    private final PrintStream ps;
    int [] ppGrades = new int [8];
    
    //constructor
    public PracticeProblems() throws Exception{
        
        ps = new PrintStream("pproblems.txt");
        
        
    }
    
    //sets practice problem grades
    public void setPPGrades(int ppNumber, int grade){
        
        ppGrades [ppNumber-1] = grade;
        
    }
    //sums up all the practice problem grades
    public int totalPointsPP(){
        int total = 0;
        for (int i = 0; i < 8; i++){
            total = total + ppGrades[i];
        }
        super.setGrade(total);
        return total;
        
    }
    
    //asks user to input practice problem grades
    public void printPPGrades(){
        
        System.out.println("Practice Problem #1 Grade: ");
        ps.print("Practice Problem #1 Grade: ");
        int pp = sc.nextInt();
        ppGrades[0] = pp;
        System.out.println(ppGrades[0]);
        ps.print(ppGrades[0]);
        
        System.out.println("Practice Problem #2 Grade: ");
        ps.print("Practice Problem #2 Grade: ");
        pp = sc.nextInt();
        ppGrades[1] = pp;
        System.out.println(ppGrades[1]);
        ps.print(ppGrades[1]);
        
        System.out.println("Practice Problem #3 Grade: ");
        ps.print("Practice Problem #3 Grade: ");
        pp = sc.nextInt();
        ppGrades[2] = pp;
        System.out.println(ppGrades[2]);
        ps.print(ppGrades[2]);
        
        System.out.println("Practice Problem #4 Grade: ");
        ps.print("Practice Problem #4 Grade: ");
        pp = sc.nextInt();
        ppGrades[3] = pp;
        System.out.println(ppGrades[3]);
        ps.print(ppGrades[3]);
        
        System.out.println("Practice Problem #5 Grade: ");
        ps.print("Practice Problem #5 Grade: ");
        pp = sc.nextInt();
        ppGrades[4] = pp;
        System.out.println(ppGrades[4]);
        ps.print(ppGrades[4]);
        
        System.out.println("Practice Problem #6 Grade: ");
        ps.print("Practice Problem #6 Grade: ");
        pp = sc.nextInt();
        ppGrades[5] = pp;
        System.out.println(ppGrades[5]);
        ps.print(ppGrades[5]);
        
        System.out.println("Practice Problem #7 Grade: ");
        ps.print("Practice Problem #7 Grade: ");
        pp = sc.nextInt();
        ppGrades[6] = pp;
        System.out.println(ppGrades[6]);
        ps.print(ppGrades[6]);
        
        System.out.println("Practice Problem #8 Grade: ");
        ps.print("Practice Problem #8 Grade: ");
        pp = sc.nextInt();
        ppGrades[7] = pp;
        System.out.println(ppGrades[7]);
        ps.print(ppGrades[7]);
        
    }
    
}
