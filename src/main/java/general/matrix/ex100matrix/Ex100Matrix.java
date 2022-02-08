package general.matrix.ex100matrix;

import java.util.Locale;
import java.util.Scanner;

public class Ex100Matrix {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int m = scan.nextInt();
        int n = scan.nextInt();

        int[][] mat = new int[m][n];
        for(int i=0; i< mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                mat[i][j] = scan.nextInt();
            }
        }

        int x = scan.nextInt();
        for(int i=0; i< mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                if(mat[i][j] == x){
                    System.out.printf("\nPosition %d,%d:\n", i, j);
                    if(j>0) System.out.printf("Left: %d\n", mat[i][j-1]);
                    if(j<mat[i].length-1) System.out.printf("Right: %d\n", mat[i][j+1]);
                    if(i>0) System.out.printf("Up: %d\n", mat[i-1][j]);
                    if(i<mat.length-1) System.out.printf("Down: %d\n", mat[i+1][j]);
                }
            }
        }

        scan.close();
    }
}
