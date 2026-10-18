package uk.ac.westminster.products_api;

// A DigitalProduct IS-A Product: it is a product that is
// delivered as a download rather than shipped.

public class DigitalProduct extends Product{
    private String downloadUrl;
    private double fileSizeMB;

    public DigitalProduct(){

    }

    public DigitalProduct(Long id, String name, double price,String downloadUrl, double fileSizeMB ){
        super(id,name,price);
        this.downloadUrl=downloadUrl;
        this.fileSizeMB=fileSizeMB;

    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public void setFileSizeMB(double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }
}
