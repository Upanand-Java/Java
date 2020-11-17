package missiondsa180Ques.stringques;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringMatching {
    public static void main(String[] args) {
        String[] words = {"leetcoder","leetcode","od","hamlet","am"};

        LinkedHashSet<String> strings = new LinkedHashSet<>();
        Stream.of(words).map(i->strings.add(i)).collect(Collectors.toList());

        System.out.println(strings);
        List<String> result = new ArrayList<>();
        HashSet<String> hs = new HashSet<>();

        for(int i=0;i<words.length;i++){
            for(String s : strings){
                if(s.indexOf(words[i])>-1 && !s.equals(words[i]) ){
                    hs.add(words[i]);
                }
            }
        }
        System.out.println("leetcoder".indexOf("leetcode"));
        System.out.println("leetcoder".indexOf("coder"));
        System.out.println(hs);
        System.out.println(new ArrayList<>(hs));


    }
}
