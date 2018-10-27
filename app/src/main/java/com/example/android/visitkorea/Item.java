package com.example.android.visitkorea;

public class Item {
    private String name;
    private String description;
    private String address;
    private String hours;
    private String phone;
    private int imageResourceId;


    public Item( String name, String description, String address, String phone,
                String hours, int imageResourceId) {

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

    public String getAddress() {
        return address;
    }

    public String getHours() {
        return hours;
    }

    public String getPhone() {
        return phone;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @Override
    public String toString() {
        String output = getName() + "\n" +
                getDescription() + "\n" +
                getAddress() + "\n" +
                getHours() + "\n" +
                getPhone() + "\n" +
                getImageResourceId()
                ;

        return output;
    }
}





