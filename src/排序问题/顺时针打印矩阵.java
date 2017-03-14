package 排序问题;

import java.util.ArrayList;

/**
 * Created by Houskii on 17/3/4.
 */
public class 顺时针打印矩阵 {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int[][] m = matrix;
        ArrayList<Integer> list = new ArrayList<>();
        while(m.length!=0){
            for(int i = 0;i<m[0].length;i++){
                list.add(m[0][i]);
            }
            m = rotate(m);
        }
        return list;
    }

    int[][] rotate(int[][] matrix){
        int h = matrix.length;
        int w = matrix[0].length;
        int[][] m = new int[w][h-1];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = matrix[j+1][w-i-1];
            }
        }
        return m;
    }

}
