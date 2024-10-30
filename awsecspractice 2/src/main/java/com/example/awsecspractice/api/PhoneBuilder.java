package com.example.awsecspractice.api;

public class PhoneBuilder {
    private int price;
    private String model;
    private String processer;
    private String software;

    public PhoneBuilder setPrice(int price) {
        this.price = price;
        return this;
    }

    public PhoneBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public PhoneBuilder setProcesser(String processer) {
        this.processer = processer;
        return this;
    }

    public PhoneBuilder setSoftware(String software) {
        this.software = software;
        return this;
    }

    public Phone build(){
        return new Phone(price,model,processer,software);
    }
}
