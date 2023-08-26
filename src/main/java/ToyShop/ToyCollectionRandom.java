package ToyShop;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ToyCollectionRandom {
    private PriorityQueue<Toy> toyQueue;

    public ToyCollectionRandom() {
        toyQueue = new PriorityQueue<>(Comparator.comparingInt(Toy::getFreq));
    }

    public void put (String input){
        String[] data = input.split(" ");
        int id = Integer.parseInt(data[0]);
        String name = data[1];
        int weight = Integer.parseInt(data[2]);

        Toy toy = new Toy(id, name, weight);
        toyQueue.add(toy);
    }

    public List<Integer> getResult (int count, DropRate generator){
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int result = generator.generate(count);
            results.add(result);
        }
        Collections.shuffle(results);
        return results;
    }

    public void writeResultToFile(List<Integer> results, String fileName) throws IOException{
        FileWriter fileWriter = new FileWriter(fileName);
        for (Integer result:results) {
            fileWriter.write(result.toString() + " ");
        }
        fileWriter.close();
    }


}
