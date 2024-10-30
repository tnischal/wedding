package com.example.awsecspractice.api;

public class Phone {
    private int price;
    private String model;
    private String processer;
    private String software;

    public Phone(int price, String model, String processer, String software) {
        this.price = price;
        this.model = model;
        this.processer = processer;
        this.software = software;
    }


    @Override
    public String toString() {
        return "Phone{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", processer='" + processer + '\'' +
                ", software='" + software + '\'' +
                '}';
    }
}
