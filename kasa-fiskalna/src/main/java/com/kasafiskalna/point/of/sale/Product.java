package com.kasafiskalna.point.of.sale;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity(name = "product")
public class Product {

    private String barCode;
    private double price;
    private String nameOfProduct;

    public Product(String barCode, double price, String nameOfProduct) {
        this.barCode = barCode;
        this.price = price;
        this.nameOfProduct = nameOfProduct;
    }

    public Product() {
    }

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "barcode")
    public String getBarCode() {
        return barCode;
    }

    @Column(name = "price")
    public double getPrice() {
        return price;
    }

    @Column(name = "productName")
    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }
}
