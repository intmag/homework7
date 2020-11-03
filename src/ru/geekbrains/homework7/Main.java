package ru.geekbrains.homework7;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Борис Николаевич", 3);
        Cat cat2 = new Cat("Николай Борисович", 2);
        Plate plate = new Plate(5);

        plate.addFood(4);
        cat.eat(plate);
        cat2.eat(plate);

        plate.addFood(4);
        cat.eat(plate);
        cat2.eat(plate);
        cat2.eat(plate);
        plate.printInfo();
        plate.addFood(4);
        plate.printInfo();
        Cat[] catArray = new Cat[5];
        catArray[0] = new Cat("Чарли", 5);
        catArray[1] = new Cat("Бакс", 4);
        catArray[2] = new Cat("Бусинка", 2);
        catArray[3] = new Cat("Маркиза", 3);
        catArray[4] = new Cat("Анфиса", 2);

        for (int i = 0; i < catArray.length; i++) {
            catArray[i].eat(plate);
            plate.addFood(4);
        }

    }
}
