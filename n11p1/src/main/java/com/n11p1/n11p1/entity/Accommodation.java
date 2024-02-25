package com.n11p1.n11p1.entity;

public class Accommodation {
    String name;
    double area;
    int roomCount;
    double pricePerMeter;

    double price;

    public Accommodation(String name, double area, int roomCount, double pricePerMeter, double price) {
        this.name = name;
        this.area = area;
        this.roomCount = roomCount;
        this.pricePerMeter = pricePerMeter;
        this.price = this.price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public double getPricePerMeter() {
        return pricePerMeter;
    }

    public void setPricePerMeter(double pricePerMeter) {
        this.pricePerMeter = pricePerMeter;
    }

    @Override
    public String toString() {
        return "Accommodation{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", roomCount=" + roomCount +
                ", pricePerMeter=" + pricePerMeter +
                '}';
    }
}