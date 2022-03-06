package interfaces.comparable.entities;

public class ComparableEmployee implements Comparable<ComparableEmployee>{

    private String name;
    private Double salary;

    public ComparableEmployee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(ComparableEmployee other) {
        return name.compareTo(other.getName());
    }

}
