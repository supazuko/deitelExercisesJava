package africa.semicolon.chapterFour;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("twelve", "improved", 12, 1000 );

        System.out.println(invoice.getPartNumber());
        invoice.setPartNumber("thirteen");
        System.out.println(invoice.getPartNumber());

        System.out.println(invoice.getPartDescription());
        invoice.setPartDescription("new and improved");
        System.out.println(invoice.getPartDescription());

        System.out.println(invoice.getQuantityOfItem());
        invoice.setQuantityOfItem(67);
        System.out.println(invoice.getQuantityOfItem());

        System.out.println(invoice.getPricePerItem());
        invoice.setPricePerItem(2000);
        System.out.println(invoice.getPricePerItem());

        System.out.println(invoice.getInvoiceAmount());
    }
}
