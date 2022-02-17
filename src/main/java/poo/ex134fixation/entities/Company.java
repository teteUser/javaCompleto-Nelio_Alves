package poo.ex134fixation.entities;

public class Company extends TaxPayer{

    private Integer employees;

    public Company() {
    }

    public Company(String name, Double income, Integer employees) {
        super(name, income);
        this.employees = employees;
    }

    public Integer getEmployees() {
        return employees;
    }

    public void setEmployees(Integer employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return super.getName() + ": $ " + String.format("%.2f", this.taxCalculation()) + "\n";
    }

    @Override
    public double taxCalculation() {
        return this.getEmployees() <= 10 ? (super.getIncome() * 0.16) : (super.getIncome() * 0.14);
    }

}
