
package model;

public class PizzaConfig {
    
    private Double basePrice;
    private OptionSet option[];

    public PizzaConfig(String n, int maxOptionSet) {
        this.option = new OptionSet[maxOptionSet];
        
    }

    public PizzaConfig(Double basePrice) {
        this.basePrice = basePrice;
    }

    public Double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
    }

    public OptionSet[] getOption() {
        return option;
    }

    public void setOption(OptionSet[] option) {
        this.option = option;
    }
    
    
    
    
}
