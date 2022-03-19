package advanced.map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExercise {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Map<String, Integer> map = new LinkedHashMap<>();

        System.out.print("Enter file full path: ");
        String path = scan.next();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while(line != null){
                String[] str = line.split(",");
                String name = str[0];
                Integer votes = Integer.parseInt(str[1]);

                if(map.containsKey(name)){
                    Integer plus = map.get(name);
                    plus += votes;
                    map.put(name, plus);
                }else {
                    map.put(name, votes);

                }

                line = br.readLine();
            }

            for(String key : map.keySet()){
                System.out.println(key + ": " + map.get(key));
            }

        }
        catch(IOException f){
            System.out.println("Error: " + f.getMessage());
        }
        scan.close();

    }

}
