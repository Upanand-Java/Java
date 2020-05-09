package immutable;

import java.util.List;

public final class ImmutableEmployeeClass {
   final int id;
    final String name;
    final List<String> project;

    public ImmutableEmployeeClass(int id, String name, List<String> project) {
        this.id = id;
        this.name = name;
        this.project = project;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getProject() {
        return project;
    }

    @Override
    public String toString() {
        return "ImmutableEmployeeClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", project=" + project +
                '}';
    }
}
