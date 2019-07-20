package com.kasafiskalna.point.of.sale;

public class ScannedProductLCD {

    private BarCodeScanner barCodeScanner;
    Double sum = 0.00;

    public ScannedProductLCD(BarCodeScanner barCodeScanner) {
        this.barCodeScanner = barCodeScanner;
    }

    public void printOnScreen(Product product) {
        boolean isExisting = barCodeScanner.scanBarcode(product);

        if (isExisting) {
            sum += barCodeScanner.getScannedProducts().stream().mapToDouble(product1 -> product1.getPrice()).sum();
            System.out.println("Scanned product: " + product.getNameOfProduct() + ", price: " + product.getPrice());
        } else {
            System.out.println("Product not found!");
        }
    }

    public Double getSum() {
        return sum;
    }
}