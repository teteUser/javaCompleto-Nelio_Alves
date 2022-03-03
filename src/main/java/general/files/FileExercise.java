package general.files;

/*
*   Enunciado:
*   Fazer um programa para ler o caminho de um arquivo .csv contendo os dados de itens vendidos.
*   Cada item possui um nome, preço unitário e quantidade, separados por vírgula.
*   Voê deve gerar um novo arquivo chamado "summary.csv", localizado em uma subpasta chamada "out"
*   a partir da pasta original do arquivo de origem, contendo apenas o nome e o valor total para
*   aquele item (preço unitárop multiplicado pela quantidade), conforme exemplo.
 */

import general.files.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class FileExercise {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter file path: ");
        String sourceFileStr = scan.nextLine();

        File sourceFile = new File(sourceFileStr);
        String sourceFolderStr = sourceFile.getParent();

        boolean success = new File(sourceFolderStr + "\\out").mkdir();
        String targetFileStr = sourceFolderStr + "\\out\\summary.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))){

            String itemCsv = br.readLine();

            while(itemCsv != null){

                String[] fields = itemCsv.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Product(name, price, quantity));

                itemCsv = br.readLine();
            }

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){

                for(Product item : list){
                    bw.write(item.getName() + "," + String.format("%.2f", item.total()));
                    bw.newLine();
                }

                System.out.println(targetFileStr + " CREATED!");

            }
            catch (IOException e){
                System.out.println("Error writing file: " + e.getMessage());
            }

        }
        catch(IOException e){
            System.out.println("Error reading file: " + e.getMessage());
            e.printStackTrace();
        }


    }

}
