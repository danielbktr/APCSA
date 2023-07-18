public class mod8DBAV2{
    public static int[][] calcMagicMath(int[] rowH, int[] colH){    
        int[][] result = new int[colH.length][rowH.length];
        for (int i=0; i<colH.length;i++){
            for (int j =0; j<rowH.length;j++){
                result[i][j] = rowH[j]*colH[i];
            }
        }
        return result;
}
}