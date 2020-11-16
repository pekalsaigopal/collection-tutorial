package in.psg.arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
        String[] names = new String[3];
        names[0] = "Sagar";
        names[1] = "Sai";
        names[2] = "Gopal";
        //names[3] = "Jai";//uncomment and observe

        //printing numbers array using for each loop
        for(int number : numbers)
            System.out.println(number);

        for(String name : names)
            System.out.println(name);



    }


}
