package advanced.map;

import java.util.Map;
import java.util.TreeMap;

public class MapProgram {

    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "99711122");

        cookies.remove("email");
        cookies.put("phone", "99711133"); //como já existe um registro com essa chave, ao invés de um novo registro ser adicionado, o registro existente simplesmente terá o valor sobrescrito

        System.out.println("ALL COOKIES:");
        for(String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }

}
