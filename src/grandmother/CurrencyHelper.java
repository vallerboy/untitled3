package grandmother;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class CurrencyHelper {
    public static void main(String[] args) {
        double amount = 5.01;
        int[] coins = {500,200,100, 5, 2, 1 };



        //-------------------------------------
        int amountAsInt = (int) (amount * 100);
        int counter = 0;
        int coinsIndex = 0;

        while (amountAsInt != 0){
            if(amountAsInt - coins[coinsIndex] >= 0){
                amountAsInt -= coins[coinsIndex];
                counter++;
            }else{
                coinsIndex++;
            }
        }

        System.out.println(counter);
    }
}
