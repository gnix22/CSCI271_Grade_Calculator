public class CalculateGrade {
    // set up grade variables, not sure if 0s need to be specified like in c++, so leaving as placeholder for now.
    private double avgAssignment = 0;
    private double avgInClassTest = 0;
    private double finalExamScore = 0;
    private double midtermExamScore = 0;
    private double combinedScore = (0.4*finalExamScore + 0.2*midtermExamScore + 0.1*avgInClassTest)/70;
    // use combined score and avg assignments grade if needed to create calculated grade.
    public double GradeCalculator(){
        double finalGrade = 0;
        double weights = 0.3 * (combinedScore - 60) / 20;
        if(combinedScore < 60){
            finalGrade = combinedScore;
        } else if (combinedScore >= 60 || combinedScore < 80) {
            finalGrade = (1 - weights) * combinedScore + weights * avgAssignment;
        } else if (combinedScore >= 80){
            finalGrade = 0.4*finalExamScore + 0.2*midtermExamScore + 0.1*avgInClassTest + 0.3*avgAssignment;
        } else {
            System.err.println("Error: invalid grade calculation");
        }
        return finalGrade;
    }
}
