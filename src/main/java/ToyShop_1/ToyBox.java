package ToyShop_1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyBox {
    private List<Toy> toys;
    private List<Toy> prizeToys;

    public ToyBox() {
        toys = new ArrayList<>();
        prizeToys = new ArrayList<>();
    }

    public void addToy(Toy toy){
        toys.add(toy);
    }

    public void changeFreq(int id, double freq){
        for (Toy toy:toys) {
            if(toy.getId() == id){
                toy.setFreq(freq);
                break;
            }
        }
    }

    public void createPrizeToys(){
        for (Toy toy:toys) {
            int countPrizes = (int) (toy.getFreq() *10);
            for (int i = 0; i < countPrizes; i++) {
                prizeToys.add(toy);
            }
        }

    }

    public Toy getPrizeToy(){
        if(prizeToys.isEmpty()){
            return null;
        }
        Random random = new Random();
        int randomIndex = random.nextInt(prizeToys.size());
        Toy prizeToy = prizeToys.remove(randomIndex);
        prizeToy.decreaseQuantity();
        savePrizeToyToFile(prizeToy);
        return prizeToy;
    }

    private void savePrizeToyToFile(Toy toy){
        try {
            FileWriter fileWriter = new FileWriter("prize_list(ToyShop_1).txt", true);
            fileWriter.write("Prize toy: " + toy.getName() + "\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
