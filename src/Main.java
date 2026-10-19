//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int averageMarkCalculator(int[] Marks){
        int marksTotal = 0;
        for(int Mark:Marks){
            marksTotal += Mark;
        }
        return marksTotal/ Marks.length;
    }
    public static void main(String[] args) {
        final int PASSING_STUDENT_MARK = 4;
        int[][] studentMarks = {{8,5,10,8,4,7},{6,4,5,3,3,1},{10,9,7,9,8,6},{6,1,4,2,7,5}};
        for (int i = 0;i< studentMarks.length;i++){
            int averageMark = averageMarkCalculator(studentMarks[i]);
            if(averageMark<PASSING_STUDENT_MARK){
                System.out.println("Student nr." + i + " did not pass with average mark: " + averageMark);
                }
            else{
                System.out.println("Student nr." + i + " successfully passed with average mark: " + averageMark);
                }
            }
        }
    }