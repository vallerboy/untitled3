package taxes;

import java.util.ArrayList;
import java.util.List;

public class Database {
    List<Cash> cashList;

    public Database() {
       cashList  = new ArrayList<>();
    }


    public void addCash(Cash cash) {
        cashList.add(cash);
    }

    public double sumCost() {
        double sum = 0;
        for (Cash cash : cashList) {
            if(cash.getCashType() == Cash.CashType.COST){
                sum += cash.getValue();
            }
        }

        return sum;
    }

}
