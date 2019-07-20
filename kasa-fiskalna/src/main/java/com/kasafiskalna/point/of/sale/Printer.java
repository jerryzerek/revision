package com.kasafiskalna.point.of.sale;

public class Printer {

    private BarCodeScanner barCodeScanner;

    public Printer(BarCodeScanner barCodeScanner) {
        this.barCodeScanner = barCodeScanner;
    }

    public void printReceipt() {
        Double sum = barCodeScanner.getScannedProducts().stream()
                .mapToDouble(product -> product.getPrice())
                .sum();

        barCodeScanner.getScannedProducts().stream()
                .forEach(product -> System.out.println(product.getNameOfProduct() + " - " + product.getPrice()));

        System.out.println("Total price: " + sum);
    }
}