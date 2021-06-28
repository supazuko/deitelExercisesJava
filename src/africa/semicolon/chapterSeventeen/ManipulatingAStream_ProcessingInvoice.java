package africa.semicolon.chapterSeventeen;

import africa.semicolon.chapterFour.Invoice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ManipulatingAStream_ProcessingInvoice {
    public static void main(String[] args) {
        ManipulatingAStream_Invoice[] invoices = {
                new ManipulatingAStream_Invoice(83, "Electric Sander", 7, 57.98),
                new ManipulatingAStream_Invoice(24, "Power Saw", 18, 99.99),
                new ManipulatingAStream_Invoice(7, "Sledge Hammer", 11, 21.50),
                new ManipulatingAStream_Invoice(77, "Hammer", 76, 11.99),
                new ManipulatingAStream_Invoice(39, "Lawn Mower", 3, 79.50),
                new ManipulatingAStream_Invoice(68, "Screwdriver", 106, 6.99),
                new ManipulatingAStream_Invoice(56, "Jig saw", 21, 11.00),
                new ManipulatingAStream_Invoice(3, "Wrench", 34, 7.50)
        };
        List<ManipulatingAStream_Invoice> list = Arrays.asList(invoices);


        System.out.println("Invoice list:");
        System.out.printf("%2s %8s %10s %8s %n", "PartNumber", "Description", "Quantity", "Price");
//        list.forEach(System.out::println);
        list.stream()
                .sorted(Comparator.comparing(ManipulatingAStream_Invoice::getPartDescription))
                .forEach(System.out::println);
        list.stream()
                .sorted(Comparator.comparing(ManipulatingAStream_Invoice::getPrice))
                .forEach(System.out::println);

//        Map<String, List<ManipulatingAStream_Invoice>> groupByQuantity = list.stream()
//                .sorted(Comparator.comparing(ManipulatingAStream_Invoice::getQuantity))
//                .collect(Collectors.groupingBy(ManipulatingAStream_Invoice::getQuantity))
//                .forEach(System.out::println);
//        System.out.println(groupByQuantity);
//
//        Map<String, List<ManipulatingAStream_Invoice>> groupByDesc = list.stream()
//                .sorted(Comparator.comparing(ManipulatingAStream_Invoice::getQuantity))
//                .collect(Collectors.groupingBy(ManipulatingAStream_Invoice::getPartDescription))
////                .forEach(System.out::println);
//        System.out.println(groupByDesc);

    }
}
