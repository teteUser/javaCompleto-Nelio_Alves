package gen.test2;

import java.util.Locale;
import java.util.Scanner;

public class TestGeneral {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantas posições vc quer no vetor? ");
        int n = scan.nextInt();
        Double[] vetDouble = new Double[n];





        scan.close();
    }
}
