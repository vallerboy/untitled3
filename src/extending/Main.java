package extending;

import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("Kamil", "Nosicki");
        Manager manager = new Manager("Ja", "Jakowski", 2300);
        Director director = new Director("Kwiatek", "Kwiatkowski", 364);
        Procurent procurent = new Procurent("Ktos");

        System.out.println(director.getSalary());

        System.out.println(manager.getSalary());
        manager.setSalary(9000);
        System.out.println(manager.getSalary());


        printSomeWorker(worker);
        printSomeWorker(manager);
        printSomeWorker(director);


        Worker[] employers = {worker, manager, director};
        for (Worker employer : employers) {
            System.out.println(employer);
        }

        prepareFireOfWorker(director, worker);
        prepareFireOfWorker(procurent, worker);

        //JOptionPane.showConfirmDialog(null, "Dziś w nocy będzie ciemno!");

    }

    public static void prepareFireOfWorker(CanFire canFire, Worker worker){
        System.out.println("*papierologia*");
        canFire.fireWorker(worker);
    }

    public static void printSomeWorker(Worker worker){
        System.out.println(worker.getName() + " " + worker.getSurname());
        worker.shout();
    }
}
