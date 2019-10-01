
package model;

public class OptionSet {
    private String name;
    private Option choices[];
    
    
    class Option {
        private String name;
        private Double price;
    }

    public OptionSet(String name) {
        this.name = name;
    }
    
    
}
