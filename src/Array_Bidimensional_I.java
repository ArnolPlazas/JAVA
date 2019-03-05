
public class Array_Bidimensional_I {
    public static void main(String[] args){
        int[][] matrix=new int[3][2];
        
        matrix[0][0]=12;
        matrix[0][1]=-2;

        matrix[1][0]=132;
        matrix[1][1]=-11;        
        
        matrix[2][0]=132;
        matrix[2][1]=-11;
        
        for(int i=0;i<3;i++){
            System.out.println();
            for(int j=0; j<2;j++){
                System.out.print(matrix[i][j]+" ");
        }
        }
    }
        
}
