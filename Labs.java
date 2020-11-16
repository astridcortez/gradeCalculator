/**
 *
 * @author Astrid Cortez
 */

package classgrades;

import java.io.PrintStream;
import java.util.Scanner;

public class Labs extends Grade {
    private final int [] labGrades = new int [8];
    private final PrintStream ps;
    Scanner sc = new Scanner(System.in);
    
    //constructor
    public Labs() throws Exception{
        ps = new PrintStream("LabGrades.txt");
        
    }
    
    //sets lab grades
    public void setLabGrades(int grade, int lab){
        labGrades[lab-1] = grade;
        
    }
    
    //returns total lab grades
    public int totalLabGrade(){
        int total = 0;
        for (int i = 0; i <8; i++){
            total = total + labGrades[i];
        }
        
        super.setGrade(total);
        return total;
        
    }
    
    //asks user to inout total lab grades
    public void printLabs(){
        System.out.println("Lab #1 Grade: ");
        ps.print("Lab #1 Grade: ");
        int lab = sc.nextInt();
        labGrades[0] = lab;
        System.out.println(labGrades[0]);
        ps.print(labGrades[0]);
        
        System.out.println("Lab #2 Grade: ");
        ps.print("Lab #2 Grade: ");
        lab = sc.nextInt();
        labGrades[1] = lab;
        System.out.println(labGrades[1]);
        ps.print(labGrades[1]);
        
         System.out.println("Lab #3 Grade: ");
        ps.print("Lab #3 Grade: ");
        lab = sc.nextInt();
        labGrades[2] = lab;
        System.out.println(labGrades[2]);
        ps.print(labGrades[2]);
        
        System.out.println("Lab #4 Grade: ");
        ps.print("Lab #4 Grade: ");
        lab = sc.nextInt();
        labGrades[3] = lab;
        System.out.println(labGrades[3]);
        ps.print(labGrades[3]);
        
         System.out.println("Lab #5 Grade: ");
        ps.print("Lab #5 Grade: ");
        lab = sc.nextInt();
        labGrades[4] = lab;
        System.out.println(labGrades[4]);
        ps.print(labGrades[4]);
        
        System.out.println("Lab #6 Grade: ");
        ps.print("Lab #6 Grade: ");
        lab = sc.nextInt();
        labGrades[5] = lab;
        System.out.println(labGrades[5]);
        ps.print(labGrades[5]);
        
         System.out.println("Lab #7 Grade: ");
        ps.print("Lab #7 Grade: ");
        lab = sc.nextInt();
        labGrades[6] = lab;
        System.out.println(labGrades[6]);
        ps.print(labGrades[6]);
        
        System.out.println("Lab #8 Grade: ");
        ps.print("Lab #8 Grade: ");
        lab = sc.nextInt();
        labGrades[7] = lab;
        System.out.println(labGrades[7]);
        ps.print(labGrades[7]);
        
    }
}
