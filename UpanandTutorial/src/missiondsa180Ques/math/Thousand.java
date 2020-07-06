package missiondsa180Ques.math;

import java.util.LinkedList;
import java.util.List;

public class Thousand {
    public static void main(String[] args) {
        double input = 53.10;
        int noOfDays = 0;
        List<Double> list = new LinkedList<>();
        while (input <= 1000){
            double temp = input * 0.05;
            input += temp;
            noOfDays++;
            list.add(input);
        }
        System.out.println(noOfDays+" "+input);
        System.out.println(list.get(20));
    }


}
