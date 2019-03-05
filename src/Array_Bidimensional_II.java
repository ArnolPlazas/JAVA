
public class Array_Bidimensional_II {
    public static void main(String[] args){
        int[][] matrix={
            {10,15,18,19,21},
            {11,125,118,-19,23},
            {110,115,-18,9,1},
            {12,42,23,119,211}
        };
        for (int[]fila:matrix){
            System.out.println();
            for (int columna:fila){
                System.out.print(columna+" ");
            }
        }
    }
}
