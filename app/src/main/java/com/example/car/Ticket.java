package com.example.car;

public class Ticket {

    private int price;

    private String deliveryPoint;

    private String deliveryTime;

    private int distance;

    private String departureTime;

    private String departurePoint;

    public Ticket(int price, String deliveryPoint, String deliveryTime, String departureTime, String departurePoint, int distance) {

        this.price = price;
        this.deliveryPoint = this.deliveryPoint;
        this.deliveryTime = this.deliveryTime;
        this.distance = this.distance;
        this.departureTime = this.departureTime;
        this.departurePoint = departurePoint;

    }




    public int getPrice() {
        return
                price;
    }

    public String getDeliveryPoint() {
        return
                deliveryPoint;
    }

    public String getDeliveryTime() {
        return
                deliveryTime;
    }

    public int getDistance() {
        return
                distance;
    }

    public String getDepartureTime() {
        return
                departureTime;
    }

    public String getDeparturePoint() {
        return
                departurePoint;
    }

    public String toString() {
        return "Билет: " +
                "Цена билета: " + price + ", " +
                "Точка отправления: " + departurePoint + ", " +
                "Время отправления: " + departureTime + ", " +
                "Точка прибытия: " + deliveryPoint + ", " +
                "Время прибытия: " + deliveryTime + ", " +
                "Расстояние: " + distance;

    }

}

