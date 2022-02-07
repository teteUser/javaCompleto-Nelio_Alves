package gen.vector;

import java.util.Locale;
import java.util.Scanner;

public class TestVector {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        EntityVector[] rooms = new EntityVector[10];
        int n = 1;

        do {
            System.out.print("How many rooms will be rented? ");
            n = scan.nextInt();
            if(n<=0 || n>10) System.out.println("Please select a quantity between 1 and 10!");
        }while(n<=0 || n>10);

        scan.nextLine();

        for(int i=1; i<=n; i++){
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Email: ");
            String email = scan.nextLine();
            System.out.print("Room: ");
            int room = scan.nextInt();
            rooms[room] = new EntityVector(name, email);
        }

        System.out.println("Busy rooms:");
        for(int i=0; i<= rooms.length; i++){
            if(rooms[i] != null) System.out.printf("%d: %s, %s"\n, i, rooms[i].getName(), rooms[i].getEmail());
        }



        scan.close();
    }


}
