package basicJava.streamApi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveVowel {

    public static void main(String[] args) {
        String s = "my name is upanand";

        Function<String , List<String>> stringIntegerFunction = str ->{
            List<String> list = new LinkedList<>();
            List<Character> characters = new ArrayList<>(5);
            characters.add('a');
            characters.add('e');
            characters.add('i');
            characters.add('o');
            characters.add('u');

            String[] arr = str.split(" ");

            for(int i=0;i<arr.length;i++) {
                if (!characters.contains(arr[i].charAt(0))){
                    list.add(arr[i]);
                }
            }

            return list;
        };

                 List<String> list =   stringIntegerFunction.apply(s);
                         //stream().collect(Collectors.toList());

        System.out.println(list);



    }
}
