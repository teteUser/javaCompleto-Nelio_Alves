package poo.ex118worker;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel workerLevel;
    private double baseSalary;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(String name, WorkerLevel workerLevel, double baseSalary) {
        this.name = name;
        this.workerLevel = workerLevel;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getWorkerLevel() {
        return workerLevel;
    }

    public void setWorkerLevel(WorkerLevel workerLevel) {
        this.workerLevel = workerLevel;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", workerLevel=" + workerLevel +
                ", baseSalary=" + baseSalary +
                '}';
    }

    public void addContract(HourContract contract){
        this.contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        this.contracts.remove(contract)
    }

    public double income(int year, int month){

    }

}
