package ToyShop_1;

public class Main {
    public static void main(String[] args) {
        ToyBox toyBox = new ToyBox();

        toyBox.addToy(new Toy(1, "Cat", 5, 0.2));
        toyBox.addToy(new Toy(2, "Dog", 7, 0.2));
        toyBox.addToy(new Toy(3, "Doll", 8, 0.6));

        toyBox.changeFreq(2, 0.4);

        toyBox.createPrizeToys();

        for (int i = 0; i < 20; i++) {
            Toy prizeToy = toyBox.getPrizeToy();
            if(prizeToy != null){
                System.out.println("Congrats, you won a " + prizeToy.getName());
            } else {
                System.out.println("No more prize toys");
                break;
            }
        }

    }
}
