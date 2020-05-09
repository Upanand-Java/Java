package serializable;

import java.io.Serializable;

public class ImplementSerializable implements Serializable {
    int id ;
    String name ;

    public ImplementSerializable(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
