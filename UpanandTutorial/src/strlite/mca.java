package strlite;

import java.util.ArrayList;
import java.util.List;

public class mca {
    public static void main(String[] args) {
        List<Animal> pets = new ArrayList<>();
        pets.add(new pet("Dog"));
        new mca().getSize(pets);
        System.out.println(pets.size());


    }

    public void getSize(List<Animal> pets){
        pets.add(new pet("cat"));

    }
}

class Animal{

}

class pet extends Animal{
    String name;
    public  pet(String name) {
        this.name = name;
    }

}
