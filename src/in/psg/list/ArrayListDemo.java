package in.psg.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class ArrayListDemo {
    public static void main(String[] args) {
        //type 1
        //Instantiating ArrayList object and referenced by an ArrayList
        ArrayList al1 = new ArrayList();
        //ArrayList al1 = new ArrayList(100);
        al1.add("sai");
        al1.add("gopal");

        //print al1
        System.out.println(al1);

        al1.add("sagar"); // Appends the specified element to the end of this list.
        System.out.println(al1); //[sai, gopal, sagar]

        al1.add(1,"sanatan");
        System.out.println(al1); //[sai, sanatan, gopal, sagar]

        List list1 = List.of("jai",2); //created list1
        List list2 = List.of("jk","sonu"); //created list2

        al1.addAll(list1); //Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's Iterator.
        System.out.println(al1); //[sai, sanatan, gopal, sagar, jai, 2]

        al1.addAll(0,list2); //Inserts all of the elements in the specified collection into this list, starting at the specified position.
        System.out.println(al1); //[jk, sonu, sai, sanatan, gopal, sagar, jai, 2]

        //Returns true if this list contains the specified element.
        System.out.println(al1.contains(2)); //true

        System.out.println(al1.get(2));//sai

        System.out.println(al1.indexOf("gopal"));//4

        System.out.println(al1.isEmpty());//false

        al1.add(2);
        System.out.println(al1); //[jk, sonu, sai, sanatan, gopal, sagar, jai, 2, 2]

        System.out.println(al1.lastIndexOf(2)); //8

        al1.remove(8); //Removes the element at the specified position in this list.
        System.out.println(al1); //[jk, sonu, sai, sanatan, gopal, sagar, jai, 2]

        al1.add("gopal");
        System.out.println(al1); //[jk, sonu, sai, sanatan, gopal, sagar, jai, 2, gopal]

        al1.remove("gopal"); //Removes the first occurrence of the specified element from this list, if it is present.
        System.out.println(al1); //[jk, sonu, sai, sanatan, sagar, jai, 2, gopal]

        System.out.println(al1.remove("sjafkl")); //false

        al1.add("jk");
        System.out.println(al1);//[jk, sonu, sai, sanatan, sagar, jai, 2, gopal, jk]

        al1.removeAll(list2); //Removes from this list all of its elements that are contained in the specified collection.
        System.out.println(al1); //[sai, sanatan, sagar, jai, 2, gopal]

        al1.set(1,"sai sanatan");
        System.out.println(al1); //[sai, sai sanatan, sagar, jai, 2, gopal]

        System.out.println(al1.size()); //6

        List subList = al1.subList(0,3); //Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
        System.out.println(subList); //[sai, sai sanatan, sagar]

        Object[] arr = al1.toArray();
        System.out.println(arr); //[Ljava.lang.Object;@3f0ee7cb //it will give the hascode
        System.out.println(Arrays.toString(arr)); //[sai, sai sanatan, sagar, jai, 2, gopal]

        System.out.println(list1); //[jai, 2]

        al1.retainAll(list1); //Retains only the elements in this list that are contained in the specified collection.
        System.out.println(al1); //[jai, 2]

    }




}
