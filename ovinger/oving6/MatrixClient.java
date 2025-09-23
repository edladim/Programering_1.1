public class MatrixClient {
    public static void main(String[] args) {

        Matrix2D matrix1 = new Matrix2D( 1, 2, 3, 4);
        Matrix2D matrix2 = new Matrix2D( 2, 3, 3, 1);

;
       
        System.out.println("Add: \n" + matrix1.add(matrix2));
        System.out.println("Multiply: \n" + matrix1.multiply(matrix2));
        System.out.println("Transpose: \n" + matrix1.transpose()); 
       
    }
}
