public class SampleClass {
    public static void main(String[] args) {
        String in = "SuperMan";
        convert(in);
        String R = "23:05:38";
        String inp = "12:36:07";
        convertTime(R , inp);
    }

    private static void convertTime(String r, String inp) {
        String[] given = r.split(":");
        String[] convert = inp.split(":");
        boolean indicator = false;
        StringBuilder sb = new StringBuilder();

        for(int i=2 ; i>=1 ;i--){
            if(indicator)
                given[i] = Integer.toString(Integer.parseInt(given[i]) -1);

            int val =    Integer.parseInt(given[i]) - Integer.parseInt(convert[i]);
            if(val>9) {
                sb.append(val);
                sb.append(':');
            }else if(val>=0){
                sb.append('0');
                sb.append(val);
                sb.append(':');
            }else{
             int temp=   val +60;
             indicator = true;
                if(temp>9) {
                    sb.append(temp);
                    sb.append(':');
                }else if(temp>=0){
                    sb.append('0');
                    sb.append(temp);
                    sb.append(':');
                }

            }
        }
        if(indicator){
            int temp = Integer.parseInt(given[0]) - Integer.parseInt(convert[0])-1;
            if(temp>9)
                sb.append(temp);
            else {
                sb.append('0');
                sb.append(temp);
            }

        }
       String s = sb.reverse().toString();
         String[] arr = s.split(":");
        System.out.println(s);

        if(Integer.parseInt(arr[0])>0){
            System.out.println(arr[0]+" hours ago");
        }else if(Integer.parseInt(arr[1])>0)
            System.out.println(arr[1]+" minute ago");
        else if(Integer.parseInt(arr[1])>0)
            System.out.println(arr[2]+" seconds ago");
        else
            System.out.println("now");

    }

    private static void convert(String in) {
        int val = (int)in.charAt(0)+32;
        char i = (char) val;
        System.out.println(val);
        System.out.println(i);
    }
}
