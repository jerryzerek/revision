package com.kasafiskalna.point.of.sale;

import java.util.ArrayList;
import java.util.List;

public class BarCodeScanner {

    private List<Product> scannedProducts;

    public BarCodeScanner() {
        scannedProducts = new ArrayList<>();
    }

    boolean scanBarcode(Product product) {
        if (product.getBarCode() == null) {
            return false;
        } else if (product.getBarCode() == "") {
            System.out.println("Invalid bar code");
            return false;
        }
        scannedProducts.add(product);
        return true;
    }

    public List<Product> getScannedProducts() {
        return scannedProducts;
    }
}