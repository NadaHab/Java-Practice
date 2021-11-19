package myTwoDimArrays;

public class AverageStudentGrades {
    public static void main(String[] args) {
        double[] sum = {0, 0, 0, 0};
        double[] average = {0, 0, 0, 0};
        double classAverage=0;
        double[][] grades = {
                {12.5, 17, 15},
                {14, 18, 19},
                {13, 14, 15.5},
                {14.5, 18, 15}
        };
        // sums each row in array sum
        for (int row = 0; row < grades.length; row++) {
//            System.out.println("row" + row);
            for (int column = 0; column < grades[row].length; column++) {
                sum[row] += grades[row][column];
            }
            average[row] = sum[row] / grades[row].length;
//                System.out.println("average "+row+ "is"+average[row]);
        }


        for (int row = 0; row < grades.length; row++) {
            String Row2Decimal= String.format("%.02f",average[row]);
            System.out.println("Student " + (row + 1) + " average is: " + Row2Decimal);
            classAverage+=average[row];
        }
//       System.out.println("number of students :"+grades.length);
        classAverage= classAverage/grades.length;
        String ClassAverage2Decimal= String.format("%.02f",classAverage);
        System.out.println( "The class average is: "+ClassAverage2Decimal);
        System.out.println("List of students with average higher than the class average:");
        for (int row = 0; row < grades.length; row++) {
            if (average[row]>=classAverage)
                System.out.println("Student " + (row + 1));
        }
    }
}
