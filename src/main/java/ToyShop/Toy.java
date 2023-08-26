package ToyShop;

public class Toy {
    private int id;
    private String name;
    private int freq;

    public Toy(int id, String name, int freq) {
        this.id = id;
        this.name = name;
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
    public int getFreq() {
        return freq;
    }
    public void setFreq(int freq) {
        this.freq = freq;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", freq=" + freq +
                '}';
    }
}
