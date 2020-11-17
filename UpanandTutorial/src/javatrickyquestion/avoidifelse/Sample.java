package javatrickyquestion.avoidifelse;

abstract class Sample1 {
    abstract protected void m1();
     abstract public void m2();
}

class Sample extends Sample1{

    @Override
    public void m1() {
        System.out.println("hey");
    }

    @Override
    public void m2() {

    }
}
