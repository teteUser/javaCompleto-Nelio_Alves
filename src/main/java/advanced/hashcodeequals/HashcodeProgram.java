package advanced.hashcodeequals;

public class HashcodeProgram {

    public static void main(String[] args) {

        HashcodeClient c1 = new HashcodeClient("Maria", "maria@gmail.com");
        HashcodeClient c2 = new HashcodeClient("Alex", "alex@gmail.com");

        System.out.println("Hashcode do c1: " + c1.hashCode());
        System.out.println("Hashcode do c2: " + c2.hashCode());
        System.out.println("Equals c1 com c2: " + c1.equals(c2));


    }

}
