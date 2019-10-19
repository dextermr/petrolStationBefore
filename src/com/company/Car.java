package com.company;

public class Car {
    // Сколько денег есть у водителя машины на бензин
    private Integer money;
    // Какой тип топлива используется в машине 95 или 98
    private TypeOfGas typeOfGas;
    // Текущее количества бензина
    private Float currentQuantityOfGas;

    public Car(Integer money, TypeOfGas typeOfGas, Float currentQuantityOfGas) {
        this.money = money;
        this.typeOfGas = typeOfGas;
        this.currentQuantityOfGas = currentQuantityOfGas;
    }

    public Integer getMoney() {
        return money;
    }

    public TypeOfGas getTypeOfGas() {
        return typeOfGas;
    }

    // Добавить к текущему количеству бенизина количество купленное на заправке
    public void addGas(Float quantityOfGas) {
        currentQuantityOfGas += quantityOfGas;
    }
}
