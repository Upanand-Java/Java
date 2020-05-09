package basicGroovyCodePractice

class RangeDemo {
    public static void main(String[] args) {
        Range range = 1 ..<10
        println range
        println("Range are ${range}")
        assert (0..10).contains(1)
        println("range is ${range instanceof List}")
        Date date = new Date()
        println("${date}")
        println("One week after ${date+7}")
        //Range of date
        Date oneWeekAfter = date+7;
        Range days = date..oneWeekAfter
        println("${days}")
        Range letter = 'a'..'z'
        println("${letter}")
    }
}
