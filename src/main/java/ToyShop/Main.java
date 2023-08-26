package ToyShop;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ToyCollectionRandom toyCollectionRandom = new ToyCollectionRandom();
        toyCollectionRandom.put("1 кукла 2");
        toyCollectionRandom.put("3 заяц 6");
        toyCollectionRandom.put("2 робот 2");


        DropRate dropRate = new DropRate();
        List<Integer> results = toyCollectionRandom.getResult(10, dropRate);

        try {
            toyCollectionRandom.writeResultToFile(results, "result.txt");
            System.out.println("Результат успешно записан в файл result.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

//        System.out.println(results);

    }
}
