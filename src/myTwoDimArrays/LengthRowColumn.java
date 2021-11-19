package myTwoDimArrays;

public class LengthRowColumn {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5},
                {3, 4, 5},
                {4,3, 5}
        };
        System.out.println("number of rows "+matrix.length);
        System.out.println("number of columns "+matrix[0].length);
        //length of row
        for (int row = 0; row < matrix.length; row++) {
            System.out.println("length of row "+row+"is "+ matrix[row].length);
        }
//        for (int column = 0; column < matrix[column].length; column++) {
//            System.out.println("length of column "+column+"is "+ matrix[column].length);
//        }


    }
}
