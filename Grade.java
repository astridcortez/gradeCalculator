/**
 *
 * @author Astrid Cortez
 */

package classgrades;


public class Grade {
    private int grade;
    
    //sets grade
    void setGrade(int grade){
        this.grade = grade;
        
    }
    
    //gets grade
    public int getScore(){
        return grade;
        
    }
    
    //returns letter grade
    public char getGrade(){
        char letterGrade;
        
        if (grade >= 90){
            letterGrade = 'A';
            
        }else if (grade >= 80){
            letterGrade = 'B';
            
        }else if (grade >=70){
            letterGrade = 'C';
            
        }else if (grade >=60){
            letterGrade = 'D';
            
        }else{
            letterGrade = 'F';
            
        }
        return letterGrade;
    
    }
    
    
    
}
