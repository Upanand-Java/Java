package immutable;

public class DriverClass {
    public static void main(String[] args) {
        ImmutableClassStudent immutableClassStudent = new ImmutableClassStudent("upanand",8,399);
        System.out.println(immutableClassStudent.getName());
        //immutableClassStudent.id = 9;
        ImmutableClassStudent classStudent = new ImmutableClassStudent("virat",7,432);
        classStudent = immutableClassStudent;
        System.out.println(classStudent.getName()); // result is upanand only if we copy the object then we can change the reference

        String s = new String("upan");
        String s1 = new String("vire");
        s1 = s;
        System.out.println(s1); //
    }
}
