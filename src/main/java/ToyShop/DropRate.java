package ToyShop;

import org.w3c.dom.ls.LSOutput;

public class DropRate {
    int count1 = 1;
    int count2 = 1;


    public int generate(int count) {

        if(count1 <= (Math.round(count*0.2))){
            count1++;
            return 1;
        } else if (count2 <= (Math.round(count*0.2))) {
            count2++;
            return 2;
        } else {
            return 3;
        }
    }
}
