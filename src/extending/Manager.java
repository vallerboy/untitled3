package extending;

public class Manager extends Worker{
    private double salary;

    public Manager(String name, String surname, int salary) {
        super(name, surname);
        this.salary = salary;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void shout() {
        System.out.println("Robcie robcie bo mi prowizja spada");
    }
}
