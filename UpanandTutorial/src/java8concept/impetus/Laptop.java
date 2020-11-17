package java8concept.impetus;

public class Laptop {
    int price;
    String modelName;

    public Laptop(int price, String modelName) {
        this.price = price;
        this.modelName = modelName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "price=" + price +
                ", modelName='" + modelName + '\'' +
                '}';
    }
}
