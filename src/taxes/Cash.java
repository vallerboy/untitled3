package taxes;

public class Cash  {
    public enum CashType {
        COST, INCOME;
    }

    private double value;
    private String name;
    private CashType cashType;


    public Cash(double value, String name, CashType cashType) {
        this.value = value;
        this.name = name;
        this.cashType = cashType;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CashType getCashType() {
        return cashType;
    }

    public void setCashType(CashType cashType) {
        this.cashType = cashType;
    }
}

