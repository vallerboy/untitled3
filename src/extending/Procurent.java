package extending;

public class Procurent implements CanFire {
    private String name;

    public Procurent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void fireWorker(Worker worker) {
        System.out.println("jeszcze o tym nie wiesz ale juz tu nie pracujesz od tygodnia, nie ma pensji");
    }
}
