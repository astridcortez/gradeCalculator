/**
 *
 * @author Astrid Cortez
 */

package classgrades;

import java.util.Scanner;


public class FinalExam extends Grade{
        
    Scanner sc = new Scanner (System.in);
    private int finalGrade;
    
    //constructor
    public FinalExam(){
        super.setGrade(finalGrade);
        
    }
    
    //sets finals grade
    public void setFinalGrade(int finalGrade){
        this.finalGrade = finalGrade;
        super.setGrade(finalGrade);
        
    }
    
    //returns final grade
    public int getFinalGrade(){
        return finalGrade;
        
    }
    
    
    
    
    
}
