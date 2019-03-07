package tripadvisor;

public class Trip {
    private float price;
    private boolean allowForDog;
    private int daySpent;
    private Continent continent;

    public Trip(float price, boolean allowForDog, int daySpent, Continent continent) {
        this.price = price;
        this.allowForDog = allowForDog;
        this.daySpent = daySpent;
        this.continent = continent;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isAllowForDog() {
        return allowForDog;
    }

    public void setAllowForDog(boolean allowForDog) {
        this.allowForDog = allowForDog;
    }

    public int getDaySpent() {
        return daySpent;
    }

    public void setDaySpent(int daySpent) {
        this.daySpent = daySpent;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "price=" + price +
                ", allowForDog=" + allowForDog +
                ", daySpent=" + daySpent +
                ", continent=" + continent +
                '}';
    }
}
