package com.example.android.visitkorea;

public class Item {
    private String name;
    private String description;
    private String address;
    private String hours;
    private String phone;
    private int imageResourceId;


    public Item( String name, String description, String address, String hours,
                 String phone, int imageResourceId) {

        this.name = name;
        this.description = description;
        this.address = address;
        this.hours = hours;
        this.phone = phone;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHours() {
        return hours;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    }
