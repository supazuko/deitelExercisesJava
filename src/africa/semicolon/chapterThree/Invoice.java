package africa.semicolon.chapterFour;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantityOfItem;
    private double pricePerItem;

    public Invoice (String partNumber, String partDescription, int quantityOfItem, double pricePerItem){
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantityOfItem = quantityOfItem;
        this.pricePerItem = pricePerItem;
    }

    public int getQuantityOfItem() {
        return quantityOfItem;
    }

    public void setQuantityOfItem(int quantityOfItem) {
        if (quantityOfItem< 0) {
            quantityOfItem = 0;
        }
        this.quantityOfItem = quantityOfItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public double getPricePerItem() {
        if (pricePerItem < 0) {
            pricePerItem = 0.0;
        }
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }
    public double getInvoiceAmount(){
        return pricePerItem * quantityOfItem;
    }
}
