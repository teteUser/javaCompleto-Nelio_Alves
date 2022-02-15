package poo.ex130polymorphism.entities;

public final class OutsourcedEmployee extends Employee{

    public OutsourcedEmployee() {
        super();
    }

    public double additionalCharge(double amount){
        return super.payment() + (amount * 1.1);
    }

}
