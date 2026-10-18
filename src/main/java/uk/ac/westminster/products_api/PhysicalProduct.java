package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product: it is a product that has
// to be picked, packed and shipped.

public class PhysicalProduct extends Product{
    private double weightKG;
    private String dimensions;

    public PhysicalProduct(){

    }

    public PhysicalProduct(Long id, String name, double price,double weightKg, String dimensions){
        super(id, name, price);
        this.weightKG = weightKg;
        this.dimensions = dimensions;

    }

    public double getWeightKG() {
        return weightKG;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setWeightKG(double weightKG) {
        this.weightKG = weightKG;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }
}
