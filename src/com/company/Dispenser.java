package com.company;

public class Dispenser {
    // Передаем в метод количество литров
    // и тип бензина который нужно налить в машину
    public static Float fillUp(Order order) {
        System.out.println("Заправлено " + order.litters);
        return order.litters;
    }
}
