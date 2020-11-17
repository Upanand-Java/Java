package missiondsa180Ques.queue;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> integers = new PriorityQueue<>(Collections.reverseOrder());
        integers.add(2);
        integers.add(5);
        integers.add(1);
        integers.add(10);
        integers.add(15);
        System.out.println(integers);
        integers.remove();
        System.out.println(integers);
       // System.out.println(integers.peek());
    }
}
