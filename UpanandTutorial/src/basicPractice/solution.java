package basicPractice;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class solution {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] inputTimeStamp = new String[n];
        for(int i = 0;i<n;i++){
             inputTimeStamp[i] = scanner.next();
        }
        for(String s:inputTimeStamp){
            System.out.println(s);
            DateFormat df6 = new SimpleDateFormat("HH:mm:ss");
            Date date = df6.parse(s);
            System.out.println(date);

        }
    }
}
