package general.files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FilesProgram {

    public static void main(String[] args){

        File file = new File("d:\\temp\\in.txt");
        Scanner scan = null;

        try{
            scan = new Scanner(file);
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        finally{
            if(scan != null) {
                scan.close();
            }
        }

    }

}
