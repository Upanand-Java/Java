public interface Sample {
    default String  getImpl(){
        return "upa";
    }

    void callme();
}
