package immutable;

public final class ImmutableClassStudent {
   final String name;
   final int id;
    final int marks;

    public ImmutableClassStudent(String name, int id, int marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getMarks() {
        return marks;
    }
}
