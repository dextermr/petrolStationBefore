package com.company;

public class Cashbox {
    // Признак указывающий занята ли колонка
    private static boolean isOccupied;

    public static void fillUp(Order order, Car car){
        // Если колонка занята, просим подождать
        if (isOccupied) {
            System.out.println("Подождите, пока колонка освободится");
        // Если колонка свободна, просим подождать
        } else {
            // занимаем колонку
            isOccupied = true;
            // наливаем бензин согласно заказу
            Float gas = Dispenser.fillUp(order);
            // освобождаем колонку
            isOccupied = false;
            // отдаем бензин клиенту
            car.addGas(gas);
        }
    }
}
