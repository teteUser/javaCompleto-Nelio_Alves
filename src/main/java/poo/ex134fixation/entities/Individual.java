package poo.ex134fixation.entities;

public class Individual extends TaxPayer{

    private Double health;

    public Individual() {
    }

    public Individual(String name, Double income, Double health) {
        super(name, income);
        this.health = health;
    }

    public Double getHealth() {
        return health;
    }

    public void setHealth(Double health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return super.getName() + ": $ " + String.format("%.2f", this.taxCalculation()) + "\n";
    }

    @Override
    public double taxCalculation() {
        return super.getIncome() < 20000 ? (super.getIncome() * 0.15) - (this.getHealth() * 0.5) : (super.getIncome() * 0.25) - (this.getHealth() * 0.5);
    }
}
