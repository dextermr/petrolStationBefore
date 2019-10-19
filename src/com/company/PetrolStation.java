package com.company;

public class PetrolStation {
    private static Float PRICE_OF_95_GAS = 45.0f;
    private static Float PRICE_OF_98_GAS = 50.0f;

    public void makeService() {
        Car car = new Car(200, TypeOfGas.GAS_98, 0.0f);
        Float litters = 0.0f;
        if (car.getTypeOfGas() == TypeOfGas.GAS_95) {
            litters = car.getMoney() / PRICE_OF_95_GAS;
        }
        if (car.getTypeOfGas() == TypeOfGas.GAS_98) {
            litters = car.getMoney() / PRICE_OF_98_GAS;
        }
        Order order = new Order(car.getTypeOfGas(), litters);
        Cashbox.fillUp(order, car);
        System.out.println();
    }

    public static void main(String[] args) {
        PetrolStation petrolStation = new PetrolStation();
        petrolStation.makeService();
    }
}
