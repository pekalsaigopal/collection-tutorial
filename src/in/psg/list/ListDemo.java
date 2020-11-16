package in.psg.list;

import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        //creating immutable list : words
        List<String> words = List.of("Sai","Sagar","Milan","Guru","Milan");
        System.out.println(words.size());//5
        System.out.println(words.contains("Milan")); //true
        System.out.println(words.get(2)); //Milan
        System.out.println(words.isEmpty()); //false
        System.out.println(words.indexOf("Sagar")); //1
        System.out.println(words.indexOf("Milan"));//2
        System.out.println(words.lastIndexOf("Milan")); //4


    }
}
