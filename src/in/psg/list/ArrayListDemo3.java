package in.psg.list;

import java.util.ArrayList;

public class ArrayListDemo3 {

        public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(14);
        al.add(17);
        al.add(25);
        al.add(3);
        //al.add("sai");
        //al.add("gopal");


        //increment each number by 10
        for(Integer number : al){
            System.out.println(number+10);
        }

    }

}
