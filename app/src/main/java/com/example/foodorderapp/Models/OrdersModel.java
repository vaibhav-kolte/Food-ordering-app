package com.example.foodorderapp.Models;

public class OrdersModel {
    private int orderImage;
    private String soldOrderName, price, orderNumber;

    public OrdersModel(int orderImage, String soldOrderName, String price, String orderNumber) {
        this.orderImage = orderImage;
        this.soldOrderName = soldOrderName;
        this.price = price;
        this.orderNumber = orderNumber;
    }

    public int getOrderImage() {
        return orderImage;
    }

    public void setOrderImage(int orderImage) {
        this.orderImage = orderImage;
    }

    public String getSoldOrderName() {
        return soldOrderName;
    }

    public void setSoldOrderName(String soldOrderName) {
        this.soldOrderName = soldOrderName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
}
