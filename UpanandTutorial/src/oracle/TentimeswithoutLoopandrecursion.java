package oracle;

public class TentimeswithoutLoopandrecursion {
    static int i=1;
    public static void main(String[] args) { ///if we want to 1000
        fun();
    }

    private static void fun() {
        p300();
        p300();
        p300();
        p100();
    }

    private static void p300() {
        p100();
        p100();
        p100();
    }

    private static void p100() {
        p30();
        p30();
        p30();
        p10();
    }

    private static void p30() {
        p10();
        p10();
        p10();
    }
    private static void p10() {
        p3();
        p3();
        p3();
        p1();
    }

    private static void p3() {
        p1();
        p1();
        p1();
    }

    private static void p1() {
        System.out.print(i+++" ");
    }
}
