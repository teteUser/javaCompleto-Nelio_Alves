package poo.ex131fixation.entities;

import java.text.SimpleDateFormat;

public final class ImportedProduct extends Product {

    private Double customsFee;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag(){
        return super.getName() + " $ " + String.format("%.2f", this.totalPrice()) + " (Customs fee: $ " + String.format("%.2f", this.customsFee) +  ")\n";
    }

    public double totalPrice(){
        return super.getPrice() + this.customsFee;
    }

}
