package missiondsa180Ques.array;

import java.util.TreeSet;

public class MaxModulo {
    public static void main(String[] args) {
        int[] input = {10, 7, 18};
      long r =   maxModulo(input ,13);
        System.out.println(r);

    }

    public static long maxModulo(int[] a,  int k) {
        int[] s = new int[a.length];
        TreeSet<Integer> tree = new TreeSet<>();

        s[0] = a[0] % k;
        tree.add(s[0]);
        int result = s[0];

        for (int i = 1; i < a.length; i++) {

            s[i] = (s[i - 1] + a[i]) % k;

            // find least element in the tree strictly greater than s[i]
            Integer v = tree.higher(s[i]);

            if (v == null) {
                // can't find v, then compare v and s[i]
                result = Math.max(s[i], result);
            } else {
                result = Math.max((s[i] - v + k) % k, result);
            }
            tree.add(s[i]);
        }
        return result;
    }
}
