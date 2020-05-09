package serializable;

import java.io.*;

public class DriverClass {
    public static void main(String[] args)  throws IOException ,ClassNotFoundException {
        ImplementSerializable implementSerializable = new ImplementSerializable(1,"upanand");

        FileOutputStream fileOutputStream = new FileOutputStream("xyz.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(implementSerializable);

        FileInputStream fileInputStream = new FileInputStream("xyz.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
       ImplementSerializable serializable = (ImplementSerializable) objectInputStream.readObject();

        System.out.println(serializable.id+" "+serializable.name);

        objectOutputStream.close();
        objectInputStream.close();



    }
}
