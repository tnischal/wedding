package com.example.awsecspractice.api;

public class PhoneMain {

    public static void main(String[] args) {
        Phone phone = new PhoneBuilder()
                .setModel("iPhone 14 Pro Max")
                .setPrice(1100)
                .setProcesser("A16")
                .build();
        System.out.println(phone);
    }
}
