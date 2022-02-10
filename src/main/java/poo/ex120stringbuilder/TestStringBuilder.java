package poo.ex120stringbuilder;

import poo.ex120stringbuilder.entities.Comment;
import poo.ex120stringbuilder.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class TestStringBuilder {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");

        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country",
                12);

        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);



        scan.close();
    }

}
