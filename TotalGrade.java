/**
 *
 * @author Astrid Cortez
 */
package classgrades;


public class TotalGrade extends Grade {
    int totalSumGrade;
    
    //sets total grade
    public void setTotalSumGrade(int total){
        totalSumGrade = total;
        super.setGrade(totalSumGrade);
        
    }
    
    //returns total grade
    public int getTotalGrade(){
        return totalSumGrade;
        
    }
    
}
