package basicPractice

class NumberOfCount {
    public static void main(String[] args) {
        String x = "AzabZbBzAa"
        HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();
        println(x.toLowerCase())
        char[] chars = x.toLowerCase().toCharArray();
        //if you want to print in uppercase
      //  char[] chars = x.toUpperCase().toCharArray();
        for(char c: chars){
            if(hashMap.containsKey(c)){
                hashMap.put(c,hashMap.get(c)+1);
            }else{
                hashMap.put(c,1);
            }
        }
        println(hashMap)


    }
}
