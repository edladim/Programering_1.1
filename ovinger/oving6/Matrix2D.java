public class Matrix2D {
    
    // Instance field
    private int[][] matrix = new int[2][2];

    // Constructor
    Matrix2D(int a, int b, int c, int d){
        this.matrix[0][0] = a;
        this.matrix[0][1] = b;
        this.matrix[1][0] = c;
        this.matrix[1][1] = d;
    }

    // Methodes
    // Add to matrixes
    public String add(Matrix2D other){
        int a = this.matrix[0][0] + other.matrix[0][0];
        int b = this.matrix[0][1] + other.matrix[0][1];
        int c = this.matrix[1][0] + other.matrix[1][0];
        int d = this.matrix[1][1] + other.matrix[1][1];

        StringBuilder sb = new StringBuilder();
        sb.append(a).append(" ").append(b).append("\n").append(c).append(" ").append(d).append("\n");
        return sb.toString();
    }
    
    // Multiply matrixes
    public String multiply(Matrix2D other){
        int a = this.matrix[0][0] * other.matrix[0][0] + this.matrix[0][1] * other.matrix[1][0];
        int b = this.matrix[0][0] * other.matrix[0][1] + this.matrix[0][1] * other.matrix[1][1];
        int c = this.matrix[1][0] * other.matrix[0][0] + this.matrix[1][1] * other.matrix[1][0];
        int d = this.matrix[1][0] * other.matrix[0][1] + this.matrix[1][1] * other.matrix[1][1];

        StringBuilder sb = new StringBuilder();
        sb.append(a).append(" ").append(b).append("\n").append(c).append(" ").append(d).append("\n");
        return sb.toString();
    }

    // Transpose matrix
    public String transpose(){
        int a = this.matrix[0][0];
        int b = this.matrix[1][0];
        int c = this.matrix[0][1];
        int d = this.matrix[1][1];
        
        StringBuilder sb = new StringBuilder();
        sb.append(a).append(" ").append(b).append("\n").append(c).append(" ").append(d).append("\n");
        return sb.toString();
    }
}