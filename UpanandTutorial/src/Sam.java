import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Sam  {
    int i = 9;

    public static void main(String[] args) {
        String str = "Hacking";
        Sample sample = ()-> System.out.println(str+"java");
       // str = "ay"; - variable used under lambda expression should be final
        sample.callme();
        LinkedList<String> strings = new LinkedList<String>();
        strings.add("Value 1");
        strings.add("Value 2");
        strings.add("Value 3");
        strings.add("Random");

        Iterator<String> itr = strings.descendingIterator();
        while (itr.hasNext()){
            System.out.println(" "+itr.next());
        }
    }
    final public void hacker(){}
   // public void final hacker1(){}//
    public static final void hacker1(){}




}
