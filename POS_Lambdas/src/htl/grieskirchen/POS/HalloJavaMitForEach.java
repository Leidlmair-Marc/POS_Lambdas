package htl.grieskirchen.POS;

import java.util.ArrayList;

public class HalloJavaMitForEach {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i< list.size();i++){
            System.out.println(list.get(i));
        }

        list.forEach(item -> System.out.println(item));

        list.forEach(System.out::println);
    }
}
