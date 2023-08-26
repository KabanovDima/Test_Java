package ToyShop_1;

public class Toy {
    private int id;
    private String name;
    private int quantity;
    private double freq;

    public Toy(int id, String name, int quantity, double freq) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.freq = freq;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getFreq() {
        return freq;
    }
    public void setFreq(double freq) {
        this.freq = freq;
    }

    public void decreaseQuantity(){
        if (quantity > 0){
            quantity--;
        }
    }
}
