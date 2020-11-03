package ru.geekbrains.homework7;


public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;


    public Cat(String name, int appetite) {
        this.appetite = appetite;
        this.name = name;
        this.satiety = false;
    }

    public void eat(Plate plate) {
        if (satiety) {
            System.out.println(this.name + " не голоден");
        } else {
            System.out.println("Котик " + this.name + " питается");
            doEat(plate);
        }
    }

    private void doEat(Plate plate) {
        int plateCapacity = plate.getfood();
        if (plateCapacity >= appetite) {
            plate.decreaseFood(appetite);
            this.satiety = true;

        } else {
            System.out.println(this.name + ": я такими маленькими порциями не ем!");
        }
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Кот " + name + ", аппетит: " + appetite;
    }
}
