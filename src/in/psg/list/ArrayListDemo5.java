package in.psg.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(14);
        al.add(17);
        al.add(25);
        al.add(3);

        for(Integer number : al) {
            System.out.print(number+" ");
        }
        System.out.println();
        // 12 14 17 25 3

        //foreach loop is best for reading the data of a Collection (No modification)
//        for(Integer number : al) {
//            if (number > 15){
//                al.remove(number);
//            }
//        }

        //System.out.println(al);

//        for(int i=0;i<al.size();i++){
//            if(al.get(i) > 15){
//                al.remove(al.get(i));
//            }
//        }
//
//        System.out.println(al);

        Iterator<Integer> alIterator = al.iterator();
        while (alIterator.hasNext()){
            if(alIterator.next() > 15){
                alIterator.remove();
            }
        }

        System.out.println(al);




    }
}
