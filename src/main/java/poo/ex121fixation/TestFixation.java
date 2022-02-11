package poo.ex121fixation;

import poo.ex121fixation.entities.Client;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class TestFixation {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Client client1 = new Client();

        System.out.print("Name: ");
        client1.setName(scan.nextLine());

        System.out.println(client1.getName());

        // In progress...


    }

}
