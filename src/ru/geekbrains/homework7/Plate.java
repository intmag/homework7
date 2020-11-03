package ru.geekbrains.homework7;

public class Plate {

    private int capacity;
    private int food;

    public int getFood() {
        return food;
    }

    public Plate(int capacity) {
        this.capacity = capacity;
    }

    public void addFood(int food) {
        if (this.food + food <= capacity) {
            this.food += food;
        } else {
            System.out.println("В миску влезает только: " + (capacity - this.food) + " порции корма!");
            this.food = capacity;
        }

    }

    @Override
    public String toString() {
        return "Plate{" + "capacity=" + capacity + ", food=" + food + '}';
    }


    public void printInfo() {
        System.out.println(this);
    }

    public void decreaseFood(int appetite) {
        if (this.food - appetite >= 0) {
            this.food -= appetite;
        } else {
            System.out.println("К сожалению в миске столько еды нет :-(");
        }
    }

    public int getfood() {
        return food;
    }
}
