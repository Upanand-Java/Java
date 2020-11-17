package mcq;

import java.util.Comparator;
import java.util.TreeSet;

class Sample7 {
     public static void main(String[] args) {
         TreeSet<Monkey> monkeys = new TreeSet<>(Comparator.comparingInt(e-> e.i));
         monkeys.add(new Monkey(1));
         monkeys.add(new Monkey(2));
         monkeys.add(new Monkey(1));
         monkeys.add(new Monkey(1));
         monkeys.add(new Monkey(1));
         monkeys.add(new Monkey(9));
         System.out.println(monkeys.size());
         System.out.println(monkeys);
     }
     static class Monkey{
         int i;
         //int name;
          Monkey(int i){
              this.i = i;
          }

         @Override
         public String toString() {
             return "Monkey{" +
                     "i=" + i +
                     '}';
         }
     }
}
