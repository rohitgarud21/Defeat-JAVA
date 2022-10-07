package com.fenixhub;

import java.util.Arrays;

import com.fenixhub.matrix.builders.GenericMatrixBuilder;
import com.fenixhub.matrix.classes.GenericMatrix;
import com.fenixhub.matrix.classes.IntegerMatrix;
import com.fenixhub.matrix.utilities.MatrixOperations;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        IntegerMatrix matrix = new IntegerMatrix(new Integer[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });

        System.out.println(matrix);
        System.out.println("Rows: " + matrix.getRows());
        System.out.println("Columns: " + matrix.getColumns());

        System.out.println("Row 0: " + Arrays.toString(matrix.getRow(0)));
        System.out.println("Column 0: " + Arrays.toString(matrix.getColumn(0)));        
        System.out.println("");

        System.out.println("Inserting row at index 1");
        matrix.insertRow(1, new Integer[]{10, 11, 12});
        System.out.println(matrix);

        System.out.println("Inserting column at index 1");
        matrix.insertColumn(1, new Integer[]{13, 14, 16, 17});
        System.out.println(matrix);

        System.out.println("Getting subarray 2x2 from index 0, 0");
        System.out.println(matrix.getMatrix(2, 2));

        System.out.println("Generating a random matrix with a MatrixBuilder");
        IntegerMatrix newMatrixFromBuilder = new IntegerMatrix(new GenericMatrixBuilder<>(Integer.class)
        .fromRandom(10, 10, -20, 20)
        .build()
        );
        System.out.println(newMatrixFromBuilder);

        GenericMatrix<Integer> doubleMatrix = new GenericMatrix<Integer>(new Integer[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });
        
        System.out.println("A Double matrix generated by a GenerixMatrix");
        System.out.println(doubleMatrix);

        System.out.println("Transpose of matrix");
        System.out.println(MatrixOperations.transpose(doubleMatrix));

        System.out.println("Scalar product of matrix for scalar");
        System.out.println(MatrixOperations.scalar(doubleMatrix, -20));

        System.out.println("Sum of a matrice for itself");
        System.out.println(MatrixOperations.sum(doubleMatrix, doubleMatrix));

        System.out.println("Dot product of a matrice for itself");
        System.out.println(MatrixOperations.dot(doubleMatrix, doubleMatrix));

        System.out.println("Hadamard of a matrice for itself");
        System.out.println(MatrixOperations.hadamard(doubleMatrix, doubleMatrix));


    }
}
