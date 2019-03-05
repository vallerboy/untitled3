package extending;

public class Director extends Manager implements CanFire {

    private int daysOfFreedays;


    public Director(String name, String surname, int daysOfFreedays) {
        super(name, surname, 10000);
        this.daysOfFreedays = daysOfFreedays;
    }

    @Override
    public void shout() {
        System.out.println("Robic!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    public int getDaysOfFreedays() {
        return daysOfFreedays;
    }

    public void setDaysOfFreedays(int daysOfFreedays) {
        this.daysOfFreedays = daysOfFreedays;
    }

    @Override
    public void fireWorker(Worker worker) {
        System.out.println("aa widze tutaj wyniki slabe hmhmhmhmhm lecisz out");
    }
}
